/* eslint-env browser */
/* eslint-disable no-console */
/* global jQuery, geny_billing_settings_object, sign_out, APICache */

// Billing API

function call_billing_api(method, endpoint, payload, callback) {
    var billing_api_response = '';
    var xhr = jQuery.ajax({
        headers: {
            "X-Requested-With": "XMLHttpRequest"
        },
        xhrFields: {
            withCredentials: true
        },
        contentType: "application/json;charset=UTF-8",
        url: geny_billing_settings_object.billing_api_url + endpoint,
        dataType: 'json',
        data: JSON.stringify(payload),
        method: method
    })
    .done(function(data, text_status, response) {
        if (typeof(callback) == "function") {
            callback(text_status, response, billing_api_response, data);
        }
    })
    .fail(function(response, text_status, text_error) {
        if(xhr.status == 401){
            //sign-out unauthorized user
            sign_out(function(){
                window.location = '/';
            });
            return;
        }
        if (typeof response.responseJSON !== 'undefined' && response.responseJSON !== null) {
            billing_api_response = response.responseJSON.desc;
        } else {
            billing_api_response = "Something went wrong, please try again.";
        }

        if (typeof(callback) == "function") {
            callback(text_status, response, billing_api_response);
        }
    });

}

// ================================== CARTS ==================================

// Retrieve list of all carts from current user
function retrieve_all_carts(callback) {
    call_billing_api('GET', '/carts/', {}, callback);
}

// Creates a new cart for the current user
// genymotion format: {"product_id": 8, "product_quantity":1}
// id_address_invoice is optional
function create_cart(id_address_invoice, genymotion, callback) {
    var data = {"genymotion": genymotion};
    if(id_address_invoice != null){
        data.id_address_invoice = id_address_invoice;
    }
    call_billing_api('POST', '/carts/', data, callback);
}

// Retrieve a single cart by its ID
function retreve_cart(cart_id, callback) {
    call_billing_api('GET', '/carts/' + cart_id + '/', {}, callback);
}

// Updates a cart
// genymotion format: {"product_id": 8, "product_quantity":1}
// id_address_invoice is optional
function update_cart(cart_id, id_address_invoice, genymotion, callback) {
    var data = {};
    if(genymotion != null){
        data.genymotion = genymotion;
    }
    if(id_address_invoice != null){
        data.id_address_invoice = id_address_invoice;
    }
    call_billing_api('PUT', '/carts/' + cart_id + '/', data, callback);
}

// Creates and processes an order from a cart using Paypal.
// It is assumed that the addresses and customer exist in the Prestashop database, also, that the products availability were checked.
function charge_paypal(cart_id, return_url, cancel_url, callback) {
    call_billing_api('POST', '/carts/' + cart_id + '/charge/paypal/', { "gateway": {"redirect_urls": {"return_url": return_url, "cancel_url": cancel_url }}}, callback);
}

// Creates and processes an order from a cart using Stripe.
// It is assumed that the addresses and customer exist in the Prestashop database, also, that the products availability were checked.
function charge_stripe(cart_id, token, callback) {
    call_billing_api('POST', '/carts/' + cart_id + '/charge/stripe/', {"gateway": {"token": token}}, callback);
}

// Add the tag voucher to the cart identified by the cart_id
function add_voucher_tag(cart_id, voucher_tag, callback) {
    call_billing_api('PUT', '/carts/' + cart_id + '/voucher/' + voucher_tag + '/', {}, callback);
}

// Remove the tag voucher from the cart identified by the cart_id
function remove_voucher_tag(cart_id, voucher_tag, callback) {
    call_billing_api('DELETE', '/carts/' + cart_id + '/voucher/' + voucher_tag + '/', {}, callback);
}


// ================================== PAYMENTS ==================================

// Executes a PayPal payment.
function execute_paypal(payment_id, payer_id, external_id, callback) {
    call_billing_api('POST', '/payments/paypal/execute/', {"payment_id": payment_id, "payer_id": payer_id, "external_id": external_id}, callback);
}

// Voids an authorized PayPal charge.
function void_paypal(authorization_id, external_id) {
    call_billing_api('POST', '/payments/paypal/void/', {"authorization_id": authorization_id, "external_id": external_id});
}

// Captures a PayPal charge.
function capture_paypal(authorization_id, payment_id, external_id, callback) {
    call_billing_api('POST', '/payments/paypal/capture/', {"authorization_id": authorization_id, "payment_id": payment_id, "external_id": external_id}, callback);
}

// Refunds a captured PayPal charge.
function refund_paypal(capture_id, payment_id, external_id) {
    call_billing_api('POST', '/payments/paypal/refund/', {"capture_id": capture_id, "payment_id": payment_id, "external_id": external_id});
}

// Voids an authorized stripe charge.
function void_stripe(external_id) {
    call_billing_api('POST', '/payments/stripe/void/', {"external_id": external_id});
}

// Captures a Stripe charge.
function capture_stripe(external_id, callback) {
    call_billing_api('POST', '/payments/stripe/capture/', {"external_id": external_id}, callback);
}

// Refunds a captured Stripe charge.
function refund_stripe(external_id) {
    call_billing_api('POST', '/payments/stripe/refund/', {"external_id": external_id});
}


// ================================== PRODUCTS ==================================

// Retrieve a list of available products in a zone. (NOT used now, server => server call is used for local cache file)
function retrieve_all_products(callback) {
    if(APICache.is_valid('retrieve_all_products')){
        var cached = APICache.get('retrieve_all_products');

        //if we are using old cache, invalidate and pull fresh data
        if(!cached[3].data[0].pricing){
            APICache.clear('retrieve_all_products');
            retrieve_all_products(callback);
        }
        else{//apply cache otherwise
            callback.apply(this, APICache.get('retrieve_all_products'));
        }
    }
    else{
        call_billing_api('GET', '/products/', {}, function(status, response, billing_api_response, data){
            if (status == 'success') {
                APICache.set( 'retrieve_all_products', arguments );
            }
            callback.apply( this, arguments );
        });
    }
}

// Retrieve the product identified by the ID parameter if it's available in a zone
function retrieve_product(product_id, callback) {
    var cache_id = 'retrieve_product_' + product_id
    // Check if we have cached information - for tracking mostly
    if ( APICache.is_valid(cache_id) ) {
        callback.apply(this, APICache.get(cache_id));
    } else { // Otherwise, call the API again
        call_billing_api('GET', '/products/' + product_id + '/', {}, function(status, response, error_message, data) {
            if (status == 'success') {
                APICache.set( cache_id, arguments );
            }
            callback.apply( this, arguments );
        });
    }
}


// ================================== RENDER TEST ==================================

// View to test how renderer.py might handle different types of Response data
// Depending on passed object_type, will return a Response with Response(data=)
function render_test(object_type) {
    call_billing_api('POST', '/render_test/', {"object_type": object_type});
}

// ================================== USER ==================================

// Retrieve list of all addresses of the current user
function retrieve_all_user_addresses(callback) {
    call_billing_api('GET', '/user/address/', {}, callback);
}

// Create a new address associated to the current user
// Required fields: firstname, lastname, address1, alias, city, iso_code
function create_user_address(firstname, lastname, address1, alias, city, iso_code, id_state, dni, phone_mobile, phone, address2, postcode, other, company, vat_number, callback) {
    call_billing_api('POST', '/user/address/', {
        "firstname": firstname,
        "lastname": lastname,
        "address1": address1,
        "address2": address2,
        "alias": alias,
        "city": city,
        "iso_code": iso_code,
        "phone": phone,
        "postcode": postcode,
        "id_state": id_state,
        // "dni": dni,
        // "other": other,
        "company": company,
        // "phone_mobile": phone_mobile,
        "vat_number": vat_number
    }, callback);
}

// Retrieve an address of the current user identified by the parameter ID
function retrieve_user_address(address_id, callback) {
    call_billing_api('GET', '/user/address/' + address_id + '/', {}, callback);
}

// Update an address of the current user identified by the parameter ID
// Required fields: address_id, firstname, lastname, address1, alias, city, iso_code
function update_user_address(address_id, firstname, lastname, address1, alias, city, iso_code, id_state, dni, phone_mobile, phone, address2, postcode, other, company, vat_number, callback) {
    call_billing_api('PUT', '/user/address/' + address_id + '/', {
        "firstname": firstname,
        "lastname": lastname,
        "address1": address1,
        "alias": alias,
        "city": city,
        "iso_code": iso_code,
        "id_state": id_state,
        "dni": dni,
        "phone_mobile": phone_mobile,
        "phone": phone,
        "address2": address2,
        "postcode": postcode,
        "other": other,
        "company": company,
        "vat_number": vat_number
    }, callback);
}

// Remove an address of the current user identified by the parameter ID
function remove_user_address(address_id, callback) {
    call_billing_api('DELETE', '/user/address/' + address_id + '/', {}, callback);
}

// Retrieve list of all orders from current user
function retrieve_all_user_orders(callback) {
    call_billing_api('GET', '/user/order/', {}, callback);
}

// Retrieve an order of the current user identified by the Order ID
function retrieve_user_order(order_id) {
    call_billing_api('GET', '/user/order/' + order_id + '/');
}

// Retrieve an order invoice of the current user identified by the Order ID
function retrieve_user_order_invoice(order_id, pdf, callback) {
    call_billing_api('GET', '/user/order/' + order_id + '/invoice/', {pdf: pdf}, callback);
}

// Renew an order by specifying the encrypted order ref
function renew_user_order(order_ref, callback) {
    call_billing_api('POST', '/user/order/renew/', {"order_ref": order_ref}, callback);
}


// ================================== WEBHOOKS ==================================

// This class serves as an endpoint to process callbacks from payment APIs. It will receive post data and dispatch the event to the appropriate PaymentGateway
function stripe_get_webhook() {
    call_billing_api('GET', '/webhooks/stripe/');
}

// This class serves as an endpoint to process callbacks from payment APIs. It will receive post data and dispatch the event to the appropriate PaymentGateway
function stripe_post_webhook(type, data) {
    call_billing_api('POST', '/webhooks/stripe/', {"type": type, "data": data});
}

// This class serves as an endpoint to process callbacks from payment APIs. It will receive post data and dispatch the event to the appropriate PaymentGateway
function paypal_post_webhook() {
    call_billing_api('POST', '/webhooks/paypal/');
}

// ??
function signifyd() {
    call_billing_api('POST', '/webhooks/signifyd/');
}


// Dictionaries
var API_billing = {
    //get list of countries
    get_countries: function(callback) {
        call_billing_api('GET', '/countries/', {}, callback);
    },
    get_location: function(callback) {
        // Check if we have cached information
        if ( APICache.is_valid('get_location') ) {
            callback.apply(this, APICache.get('get_location'));
        } else { // Otherwise, call the API again
            call_billing_api('GET', '/location/', {}, function(status, response, error_message, data) {
                if (status == 'success') {
                    APICache.set( 'get_location', arguments );
                }
                callback.apply( this, arguments );
            });
        }
    }
}
