/* eslint-env browser */
/* eslint-disable no-console */
/* global storageAvailable  */

//
// APICache
// Author: Alan Sikora
//
(function(){
    var APICache = {};

    // Check if browser supports
    // *************************
    APICache._storageEnabled = storageAvailable('localStorage');
    
    if (!APICache._storageEnabled) {
        console.log('LocalStorage either not defined or not enabled')
    }

    APICache.supports = function supports() {
        return APICache._storageEnabled;
    };

// Check if cached info is valid
// *****************************
    APICache.is_valid = function is_valid(name) {
        if ( ! this.supports() ) {
            return false;
        }

        var updated_at = this.get_updated_at(name);
        var current_time = new Date().getTime();

        // If updated_at is less than an hour
        return updated_at && current_time - updated_at <= 3600000;
    };

// Get cached user updated date (unix time)
// ****************************************
    APICache.get_updated_at = function get_updated_at(name) {
        if ( this.supports() )
            return JSON.parse( window.localStorage.getItem( 'geny_api_' + name ) || '{}' ).updated_at || {};
        else
            return {};
    };

// Get cached user
// ***************
    APICache.get = function get(name) {
        if ( this.supports() )
            return JSON.parse( window.localStorage.getItem( 'geny_api_' + name ) || '{}' ).data || {};
        else
            return {};
    };

// Set cached user
// ***************
    APICache.set = function set( name, data ) {
        if ( ! this.supports() ) {
            return false;
        }

        var input_data = data;
        if(data.length != undefined){//convert arguments object to array
            input_data = Array.prototype.slice.call(data);
        }
        window.localStorage.setItem( 'geny_api_' + name, JSON.stringify( {data: input_data, updated_at: new Date().getTime()} ) );
    };

// Clear cache
// ***********
    APICache.clear = function clear(name) {
        if ( this.supports() )
            window.localStorage.removeItem('geny_api_' + name);
    };

    window.APICache = APICache;
})();
