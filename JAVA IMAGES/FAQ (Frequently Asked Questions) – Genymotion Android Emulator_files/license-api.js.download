/* global License, licenseApi, Promise, list_licenses */


/* 
 * functions to manipulate licenses
 */

var License = {
    isIndie: function (license) {
        return license.type__category === "CATEGORY_INDIE";
    },
    isBusiness: function (license) {
        return license.type__category === "CATEGORY_BUSINESS";
    },
    isTrial: function (license) {
        // seems we have no category for TRIAL licenses
        return (license.type__name === "TRIAL") || (!!license.type__is_trial);
    },
    isPaying: function (license) {
        return !License.isTrial(license);
    }, 
}

/* wrap license api */

licenseApi = {
    getAll: function () {
        /* 
         * This function returns the licenses of the user (bought and registered).
         * The function removes duplicates (if a license is bought and registered).
         * The function also flatten returned licenses (extract licenses from orders).
         */
        
        return new Promise(function (resolve, reject) {
            list_licenses(function (text_status, response, license_api_response, data) {
                if (text_status !== "success") {
                    reject(text_status);
                    return;
                }

                var bought = data.bought || {};
                var orders = Object.keys(bought);
                var licenses = [];
                orders.forEach(function (order) {
                    bought[order].licenses.forEach(function (license) {
                        licenses.push(license);
                    });
                });

                if (data.registered) {
                    var licenseAlreadyKnown = false;

                    licenses.forEach(function (license) {
                        if (license.serial === data.registered.serial) {
                            licenseAlreadyKnown = true;
                        }
                    })

                    if (!licenseAlreadyKnown) {
                        licenses.push(data.registered);
                    }
                }

                resolve(licenses);
            });
        });
    }
}
