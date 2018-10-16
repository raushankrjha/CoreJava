/* eslint-env browser */
/* eslint-disable no-console */

/* global $, get_current_user_info, analytics, wp_vars, API_billing,
   geny_cart, retrieve_product, list_licenses, retreve_cart,
   retrieve_product
 */


//
// Track
// Author: Alan Sikora
//
var Track = {};

// Gets current user from API
// ***************************
Track.get_current_user = function get_current_user(callback) {
    get_current_user_info(function(text_status, response, license_api_response, data) {
        // @TODO Error handling!
        callback(data);
    });
}

// Tracks when the user logs out
// *****************************
Track.logout = function logout() {
    analytics.reset();
}

Track.log_to_console = function(msg) {
    if (wp_vars.is_production) {
        return;
    }
    console.log(msg);
};

// Tracks when the user deletes it's account
// *****************************************
Track.deleted_account = function() {
    analytics.track('account-deleted');
};

// Tracks when the user submits contact form
// *****************************************
Track.submit_contact_us = function(type, email, product) {
    analytics.track('contact-submitted', {
        'request-type': type
    });
}

// When user submits the payment "When the button is clicked."
// *****************************************
Track.cart_payment_submit = function(method) {
    analytics.track('payment-submitted', {
        'payment-method': method
    });
    Track.log_to_console('Tracked: "payment-submitted" with ' + method);
};

// Tracks when the user clicks on any product
// ******************************************
Track.product_click = function(product_id, wp_product_id, wp_tracking_category, wp_product_name, callback) {
    Track.ready_filter(function() {
        if (product_id) {
            retrieve_product(product_id, function(text_status, response, billing_api_response, data) {
                if (text_status != 'success')
                    return callback && callback();
                API_billing.get_location(function(arg1, arg2, arg3, location_data) {
                    if (arg1 != 'success')
                        return callback && callback();
                    var product = data.data[0],
                        pricing = geny_cart.get_product_pricing_for_location(product.pricing, location_data);

                    Track.product_click_actual(product_id, pricing, wp_product_id, wp_tracking_category, wp_product_name, callback);
                });
            });
        } else {
            Track.product_click_actual(product_id, null, wp_product_id, wp_tracking_category, wp_product_name, callback);
        }
    }, callback);
};

Track.product_click_actual = function(product_id, pricing, wp_product_id, wp_tracking_category, wp_product_name, callback) {
    API_billing.get_location(function(arg1, arg2, arg3, location_data) {
        if (arg1 != 'success') {
            return callback && callback();
        }
        var params = {
            id: wp_product_id,
            sku: wp_product_id,
            name: wp_product_name,
            price: pricing ? pricing.price : 0,
            currency: pricing ? pricing.currency.iso_code : location_data.data.currency_iso_code,
            category: wp_tracking_category
        };

        analytics.track('Viewed Product', params, callback);

        Track.log_to_console('Tracked "Viewed Product" with:');
        Track.log_to_console(params);
    });
};

// Tracks when order is successfully submitted
// ******************************************
Track.completed_order = function(cart_id, order_ref, coupon, callback) {
    this.get_current_user(function(user_data) {
        list_licenses(function(arg1, arg2, arg3, orders_data) {
            if (arg1 != 'success')
                return callback && callback();
            var userLTV = 0,
                business_multi = 3;
            for (var ref in orders_data.bought) {
                var licenses = orders_data.bought[ref].licenses;
                for (var j = 0; j < licenses.length; j++) {
                    var license = licenses[j],
                        value = 1;
                    if (license.type_name == 'Business') {
                        value *= business_multi;
                    }
                    userLTV += value;
                }
            }

            retreve_cart(cart_id, function(text_status, response, billing_api_response, data) {
                if (text_status != 'success')
                    return callback && callback();
                analytics.identify(user_data.customer_uuid, {
                    userLicenceType: user_data.license_info,
                    userLTV: userLTV
                }, {}, function() {
                    var cart = data.data,
                        cart_product = cart.products[0],
                        wp_post_id = wp_vars.cart_products[cart_product.id].wp_post_id,
                        wp_product = wp_vars.wp_products[wp_post_id],
                        discount = cart.discounts.length != 0 ? cart.discounts[0] : null;

                    var params = {
                        orderId: order_ref,
                        total: cart.total_price,
                        revenue: cart.total_price_without_tax,
                        shipping: 0,
                        tax: parseInt((cart.total_price - cart.total_price_without_tax) * 100, 10) / 100,
                        discount: discount ? discount.value_tax_exc : 0,
                        coupon: coupon,
                        currency: cart.currency_iso_code,
                        products: [{
                            id: wp_post_id,
                            sku: wp_post_id,
                            name: wp_product.title,
                            price: cart_product.price,
                            quantity: cart_product.quantity,
                            category: wp_product.tracking_category
                        }]
                    };
                    analytics.track('Completed Order', params, callback);
                    Track.log_to_console('Tracked "Completed Order" with:');
                    Track.log_to_console(params);
                });

            });
        });
    });
};

// Tracks when product download is clicked - called by autotracking
// ***************************************
Track.product_download = function(os, arch, opt) {
    var data = {
        os: os,
        arch: arch,
        vm: opt || 'none'
    };
    analytics.track('product-downloaded', data);
    Track.log_to_console('Tracked "product-downloaded" with:');
    Track.log_to_console(data);
};

// User adds/removes an item to/from cart (one more after the get started)
// ***************************************
Track.changed_product_quantity = function(prod_id, quantity_delta) {
    if (quantity_delta == 0) {
        Track.log_to_console('Not tracked quantity change: delta=0');
        return;
    }

    retrieve_product(prod_id, function(text_status, response, billing_api_response, data) {
        API_billing.get_location(function(arg1, arg2, arg3, location_data) {
            if( arg1 != 'success')
                return;

            var product = data.data[0],
                pricing = geny_cart.get_product_pricing_for_location(product.pricing, location_data),
                wp_post_id = wp_vars.cart_products[prod_id].wp_post_id,
                wp_product = wp_vars.wp_products[wp_post_id];

            var params = {
                id: wp_post_id,
                sku: wp_post_id,
                name: wp_product.title,
                price: pricing.price,
                currency: pricing.currency.iso_code,
                quantity: Math.abs(quantity_delta),
                category: wp_product.tracking_category
            };

            if (quantity_delta < 0) {
                analytics.track('Removed Product', params);
                Track.log_to_console('Tracked "Removed Product" with:');
            } else {
                analytics.track('Added Product', params);
                Track.log_to_console('Tracked "Added Product" with:');
            }
            Track.log_to_console(params);
        });
    });

};

// Account activated
// *******************************
Track.account_activated = function(callback) {
    Track.ready_filter(function() {
        this.get_current_user(function(user_data) {
            analytics.identify(user_data.customer_uuid, {
                email: user_data.user.email
            }, {}, function() {
                analytics.track('signup-3-activated', {}, {}, callback);
                Track.log_to_console('Tracked "signup-3-activated"');
            });
        });
    }, callback);
};

// when transaction fails or has to be manually checked
// *******************************
Track.transaction_stopped = function(status, message, callback) {
    Track.ready_filter(function() {
        var data = {
            'payment-status': status,
            reason: message ? message.substr(0, 64) : 'Unknown failure'
        };
        analytics.track('payment-stopped', data, {}, callback);
        Track.log_to_console('Tracked "payment-stopped" with:');
        Track.log_to_console(data);
    }, callback);
};

// Tracks when FAQ item is clicked
// *******************************
Track.faq_item_clicked = function faq_item_clicked(id, title) {
    analytics.track('FAQ Item Clicked', {
        id: id,
        title: title
    });
}

// Tracks when the user is created
// *******************************
Track.user_creation = function user_creation(data, callback) {
    Track.ready_filter(function() {
        if (!data.customer_uuid)
            return callback && callback();
        analytics.alias(data.customer_uuid);

        var params = {
            id: data.customer_uuid,
            email: data.user.email,
            userCompanyType: data.enterprise_type,
            userUsageType: data.usage_type,
            userSince: data.user.date_joined,
            userOptIn: data.newsletter
        };
        analytics.identify(data.customer_uuid, params, {}, function() {
            Track.log_to_console('Tracked "identify" with:');
            Track.log_to_console(params);
            analytics.track('signup-2-created', {}, {}, function() {
                Track.log_to_console('Tracked "signup-2-created"');
                if (callback) callback();
            });
        });
    }, callback);
};

// Tracks when the user signs in
// *****************************
Track.sign_in = function(data, callback) {
    Track.ready_filter(function() {
        if (!data.customer_uuid)
            return callback && callback();

        analytics.alias(data.customer_uuid);

        var params = {
            id: data.customer_uuid,
            userLicenceType: data.license_info,
            userLastSignIn: data.last_signin_attempt_date,
            userActivity: data.cloud_last_connection_date,
            userDuration: data.user.date_joined
        };
        analytics.identify(data.customer_uuid, params, function() {
            Track.log_to_console('Tracked "identify" with:');
            Track.log_to_console(params);
            analytics.track('account-signedin', {}, {}, function() {
                Track.log_to_console('Tracked "account-signedin"');
                if (callback) callback();
            });
        });
    }, callback);
};

// Filter if tracking is ready
// ***************************
Track.ready_filter = function ready_filter(ready_callback, not_ready_callback) {
    if (Track.not_ready) {
        not_ready_callback && not_ready_callback.apply(Track);
    } else {
        ready_callback && ready_callback.apply(Track);
    }
}

// Auto-track
// **********
$(document).on('click', 'a[data-track]', function(e) {
    if ($(this).hasClass("disabled")) {
        return;
    }

    var params = $(this).data('track').split('|');

    var method = params.shift();

    Track[method].apply(Track, params);
});

// Check if is ready (not blocked)
// *******************************
Track.not_ready = true;

/* set analytics ready */

analytics.ready(function() {
    Track.not_ready = false;
});

// Load track events from attribute - tracks on click
// *****************************
$(document).on('click', '[data-track-link]', function(e) {
    e.preventDefault();
    var button = $(this);
    var event = $(this).data('track-link');

    function callback() {
        Track.log_to_console('Info: Tracked "' + event + '" on ');
        Track.log_to_console(button);
        window.location = button.attr('href');
    }

    Track.ready_filter(function() {
        analytics.track(event, {}, {}, callback);
    }, callback);
});

// Load track events from attribute - tracks on page load
// *****************************
$('[data-track-on-load]').each(function() {
    var event = $(this).data('track-on-load');
    analytics.track(event, {}, {}, function() {
        Track.log_to_console('Info: Just Tracked "' + event + '"');
    });
});

window.Track = Track;
