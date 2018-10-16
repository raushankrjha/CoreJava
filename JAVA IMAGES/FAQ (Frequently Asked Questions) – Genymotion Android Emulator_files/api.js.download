/* eslint-env browser */
/* eslint-disable no-console */
/* global jQuery, geny_settings_object, APICache, $, Promise */


/* License API helper methods */

function call_api(method, endpoint, payload, callback) {
    var license_api_response = '';
    var xhr = jQuery.ajax({
        headers: {
            "X-Requested-With": "XMLHttpRequest"
        },
        xhrFields: {
            withCredentials: true
        },
        contentType: "application/json;charset=UTF-8",
        url: geny_settings_object.license_api_url + endpoint,
        dataType: 'json',
        data: JSON.stringify(payload),
        method: method
    })
    .done(function(data, text_status, response) {
        if (typeof(callback) == "function") {
            callback(text_status, response, license_api_response, data);
        }
    })
    .fail(function(response, text_status, text_error) {
        if (xhr.status == 401) {
            //sign-out unauthorized user
            sign_out(function() {
                window.location = '/';
            });
            return;
        }
        if (typeof response.responseJSON !== 'undefined' && response.responseJSON !== null) {
            if (typeof geny_settings_object["license_api_code_" + response.responseJSON.code] !== 'undefined' && geny_settings_object["license_api_code_" + response.responseJSON.code] !== null && geny_settings_object["license_api_code_" + response.responseJSON.code] !== '') {
                license_api_response = geny_settings_object["license_api_code_" + response.responseJSON.code];
            } else {
                license_api_response = response.responseJSON.desc;
            }
        } else {
            license_api_response = "Something went wrong, please try again.";
        }

        if (typeof(callback) == "function") {
            callback(text_status, response, license_api_response);
        }
    });

}


// Sign up
function sign_up(email, username, password, enterprise_name, enterprise_size, language, newsletter, next_page, usage_misc, usage_type, country, enterprise_type, callback) {
    call_api('POST', '/customer/register/', {
        email: email,
        username: username,
        password: password.trim(),
        enterprise_name: enterprise_name,
        enterprise_size: enterprise_size,
        language: language,
        newsletter: newsletter,
        next_page: next_page,
        usage_type: usage_type,
        usage_misc: usage_misc,
        country: country,
        enterprise_type: enterprise_type
    }, function(status) {
        if (status == 'success') {
            //clear user cache
            APICache.clear('get_current_user_info');
        }

        callback.apply(this, arguments);
    });
}

// Activate account
function activate_account(activation_key, callback) {
    call_api('GET', '/customer/activate/' + activation_key + '/', {}, callback);
}

// Resend activation email
function resend_activation_email(email, callback) {
    call_api('POST', '/customer/resend_activation_email/', { email: email }, callback);
}

// Sign in
function sign_in(username, password, remember, callback) {
    call_api('POST', '/customer/signin/', { username: username, password: password.trim(), remember: remember }, function(status) {
        if (status == 'success') {
            //clear user cache
            APICache.clear('get_current_user_info');
        }

        callback.apply(this, arguments);
    });
}

// Sign out
function sign_out(callback) {
    call_api('POST', '/customer/signout/', {}, function(status) {
        if (status == 'success') {
            APICache.clear('get_current_user_info');
            $(".userIsLogged").hide();
            $(".userIsNotLogged").show();
        }

        callback.apply(this, arguments);
    });
}

// Get current user info
function get_current_user_info(callback) {
    // Check if we have cached information
    if (APICache.is_valid('get_current_user_info')) {
        callback.apply(this, APICache.get('get_current_user_info'));
        $(".userIsLogged").show();
        $(".userIsNotLogged").hide();
    } else { // Otherwise, call the API again
        call_api('GET', '/customer/me/', {}, function(status, response, error_message, data) {
            if (status == 'success' && response.responseText !== '{}') {
                APICache.set('get_current_user_info', arguments);
                $(".userIsLogged").show();
                $(".userIsNotLogged").hide();
            }

            callback.apply(this, arguments);
        });
    }
}

// Edit user
function edit_user(username, email, newsletter, callback) {
    var payload = { newsletter: newsletter, email: email };
    if (username != '') {
        payload['username'] = username;
    }
    call_api('POST', '/customer/edit/', payload, callback);
}

// Change password
function change_password(oldPassword, newPassword, callback) {
    call_api('POST', '/customer/change_password/', { oldPassword: oldPassword, newPassword: newPassword }, callback);
}

// Reset password (accepts username or email)
function reset_password(login, callback) {
    call_api('POST', '/customer/password_reset/', { login: login }, callback);
}

// Reset password confirmation
function reset_password_confirmation(token, new_password, callback) {
    call_api('POST', '/customer/password_reset/confirm/' + token + '/', { password: new_password }, callback);
}

// Delete account
function delete_account(callback) {
    call_api('GET', '/customer/delete/', {}, function(status) {
        if (status == 'success') {
            APICache.clear('get_current_user_info');
        }

        callback.apply(this, arguments);
    });
}

// List licenses
function list_licenses(callback) {
    call_api('GET', '/licenses/list/', {}, callback);
}

// Contact support
function contact_support(data, callback) {
    call_api('POST', '/support/report/', data, callback);
}

// Support attach a file
function attach_file(file) {
    call_api('POST', '/support/file/upload/', file);
}

// Remove attached file
function remove_attached_file(callback) {
    call_api('POST', '/support/file/delete/', {}, callback);
}

// Sends request for extension of current license to the buyer
function current_license_extend_request(callback) {
    call_api('GET', '/renewal/contactbuyer/', {}, callback);
}

// Request trial license

function request_trial_license (callback) {
    call_api('POST', '/licenses/requesttrial/', {}, callback);
}

