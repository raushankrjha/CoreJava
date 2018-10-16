/* eslint-env browser */
/* global $, signals, crossroads, URI, wp_env, wp_vars */

// configure url redirections via the global crossroads object
(function(){
    // Aliases
    var genymotion = wp_env.BASE_URL || '//www.genymotion.com';
    var documentation = '//doc.genymotion.com';

    // Create routers
    
    // Angular hashbang
    window.hashbangRouter = crossroads.create();
    // other routes
    window.regularRouter = crossroads.create();

    // Configure URL patterns & their handlers

    window.hashbangRouter.addRoute('/support', supportHandler);
    window.hashbangRouter.addRoute('/support{?query}', supportQueryHandler);
    window.hashbangRouter.addRoute('/contact', contactHandler);
    window.hashbangRouter.addRoute('/store', storeHandler);
    window.hashbangRouter.addRoute('/release-notes/:releaseId:', releaseNotesHandler);
    window.hashbangRouter.addRoute('/developers', developersHandler);
    window.hashbangRouter.addRoute('/developers/user-guide', userGuideHandler);
    window.hashbangRouter.addRoute('/developers/java-api', javaApiHandler);
    window.hashbangRouter.addRoute('/developers/gm-tool', gmToolHandler);
    window.hashbangRouter.addRoute('/developers/gradle-plugin', gradlePluginHandler);
    window.hashbangRouter.addRoute('/auth/signin', signinHandler);
    window.hashbangRouter.addRoute('/auth/account-creation', accountCreationHandler);
    window.hashbangRouter.addRoute('/auth/account-created', accountCreatedHandler);
    window.hashbangRouter.addRoute('/auth/account-activated', accountActivatedHandler);
    window.hashbangRouter.addRoute('/auth/account-not-activated', accountNotActivatedHandler);
    window.hashbangRouter.addRoute('/auth/account-activation/:hash:', accountActivationHandler);
    window.hashbangRouter.addRoute('/auth/reset-password-procedure', resetPasswordHandler);

    // no use of :optionnal: to avoid crossroads /thing/one-two-three-boom bug
    //crossroads.addRoute('/auth/reset-password/:email:', resetPasswordEmailHandler);
    window.hashbangRouter.addRoute('/auth/reset-password/{email}', resetPasswordEmailHandler)
    window.hashbangRouter.addRoute('/auth/reset-password-confirm/{token}', resetPasswordConfirmHandler);
    window.hashbangRouter.addRoute('/auth/reset-password-failure', resetPasswordFailureHandler);
    window.hashbangRouter.addRoute('/auth/reset-password-complete', resetPasswordSuccessHandler);
    window.hashbangRouter.addRoute('/user', userHandler);
    window.hashbangRouter.addRoute('/download', downloadHandler);
    window.hashbangRouter.addRoute('/download/business', downloadBusinessHandler);
    window.hashbangRouter.addRoute('/download/indie', downloadIndieHandler);
    window.hashbangRouter.addRoute('/renewal-key-invalid', renewalKeyInvalidHandler);
    window.hashbangRouter.addRoute('/legal/legal-notices', legalNoticesHandler);
    window.hashbangRouter.addRoute('/legal/privacy-statement', privacyStatementHandler);
    window.hashbangRouter.addRoute('/legal/terms-and-conditions', termsAndConditionsHandler);
    window.hashbangRouter.addRoute('/legal/secure-payments', securePaymentsHandler);
    window.hashbangRouter.addRoute('/404', notFoundHandler);

    // Not hashbangs URLs

    window.regularRouter.addRoute('/assets/doc/Genymotion-2.6.0-User-Guide.pdf', userGuidePdfHandler);
    window.regularRouter.addRoute('/?controller=order-opc&renewal=:order_ref:', renewalHandler);

    // Handlers

    function supportHandler () {
        var target = genymotion + wp_vars.links['faq'];
        redirect(target);
    }

    function supportQueryHandler (query) {
        var target = genymotion + wp_vars.links['faq'] + '#' + query.chapter;
        redirect(target);
    }

    function contactHandler () {
        var target = genymotion + wp_vars.links['contact'];
        redirect(target);
    }

    function storeHandler () {
        var target = genymotion + wp_vars.links['pricing-and-licensing'];
        redirect(target);
    }

    function renewalHandler (order_ref) {
        var target = genymotion + wp_vars.links['account'] + '?order_ref=' + order_ref;
        redirect(target);
    }

    function accountActivationHandler (hash) {
        var target = genymotion + wp_vars.links['account-activation'];
        if (hash)
            target += '?token=' + hash;
        redirect(target);
    }

    function releaseNotesHandler (releaseId) {
        var target = genymotion + wp_vars.links['release-notes'];
        if (releaseId)
            target += '#' + releaseId;
        redirect(target);
    }

    function developersHandler () {
        var target = documentation;
        redirect(target);
    }

    function userGuideHandler () {
        var mapping = {
            '': '/Home',
            'overview': '/Home',
            'requirements': '/01_Get_Started/Requirements',
            'installing-genymotion': '/01_Get_Started/Installation',
            'license': '/01_Get_Started/License/License',
            'getting-started': '/Content/01_Get_Started/Basic_steps',
            'genymotion-application': '/02_Application/Application',
            'virtual-devices': '/03_Virtual_Devices/Virtual_Devices',
            'genymotion-plugin-for-eclipse': '/04_Tools/Genymotion_Plugin_for_Eclipse/Genymotion_Plugin_for_Eclipse',
            'genymotion-plugin-for-android-studio': '/04_Tools/Genymotion_Plugin_for_Android_Studio/Genymotion_Plugin_for_Android_Studio',
            'genymotion-shell': '/04_Tools/Genymotion_Shell/Genymotion_Shell',
            'keyboard-shortcuts': '/03_Virtual_Devices/Virtual_device_shortcuts'
        };

        var hash = getHash();
        var page = mapping[hash] || mapping[''];
        var target = documentation + '/Content' + page + '.htm';
        redirect(target);
    }

    function javaApiHandler () {
        var target = documentation + '/Content/04_Tools/Genymotion_Java_API/Genymotion_Java%20API.htm';
        redirect(target);
    }

    function gmToolHandler () {
        var target = documentation + '/Content/04_Tools/GMTool/GMTool.htm';
        redirect(target);
    }

    function gradlePluginHandler () {
        var target = documentation + '/Content/04_Tools/Genymotion_Plugin_for_Gradle/Gradle_Plugin_for_Genymotion.htm';
        redirect(target);
    }

    function signinHandler () {
        var target = genymotion + wp_vars.links['sign-in'];
        redirect(target);
    }

    function accountCreationHandler () {
        var target = genymotion + wp_vars.links['sign-up'];
        redirect(target);
    }

    function accountCreatedHandler () {
        var target = genymotion + wp_vars.links['account-created'];
        redirect(target);
    }

    function accountActivatedHandler () {
        var target = genymotion + wp_vars.links['account-activated'];
        redirect(target);
    }

    function accountNotActivatedHandler () {
        var target = genymotion + wp_vars.links['account-not-activated'];
        redirect(target);
    }

    function resetPasswordHandler () {
        var target = genymotion + wp_vars.links['reset-password'];
        redirect(target);
    }

    function resetPasswordEmailHandler (email) {
        var target = genymotion + wp_vars.links['reset-password'];
        if (email)
            target += '/' + email;
        redirect(target);
    }

    // FIXME : remove slash before "?" ?
    function resetPasswordConfirmHandler (token) {
        var target = genymotion + wp_vars.links['reset-password-confirm'] + '?token=' + token;
        redirect(target);
    }

    function resetPasswordFailureHandler () {
        var target = genymotion + wp_vars.links['reset-password-failure'];
        redirect(target);
    }

    function resetPasswordSuccessHandler () {
        var target = genymotion + wp_vars.links['reset-password-complete'];
        redirect(target);
    }

    function userHandler () {
        var mapping = {
            '': wp_vars.links['account'] + '#account-info',
            'account': wp_vars.links['account'] + '#account-info',
            'licenses': wp_vars.links['account'] + '#account-orders'
        };

        var hash = getHash();
        var page = mapping[hash] || mapping[''];
        var target = genymotion + page;
        redirect(target);
    }

    function downloadHandler () {
        var target = genymotion + wp_vars.links['download'];
        redirect(target);
    }

    function downloadBusinessHandler () {
        var target = genymotion + wp_vars.links['download'];
        redirect(target);
    }

    function downloadIndieHandler () {
        var target = genymotion + wp_vars.links['download'];
        redirect(target);
    }

    function renewalKeyInvalidHandler () {
        var target = genymotion + wp_vars.links['page-account-licenses-renewal-key-invalid'];
        redirect(target);
    }

    function legalNoticesHandler () {
        var target = genymotion + wp_vars.links[297];
        alert(target);
        redirect(target);
    }

    function privacyStatementHandler () {
        var target = genymotion + wp_vars.links[220];
        redirect(target);
    }

    function termsAndConditionsHandler () {
        var target = genymotion + wp_vars.links[299];
        redirect(target);
    }

    function securePaymentsHandler () {
        var target = genymotion + wp_vars.links[422];
        redirect(target);
    }

    function notFoundHandler () {
        var target = genymotion + '/404';
        redirect(target);
    }

    function userGuidePdfHandler () {
        var target = documentation + '/user-guide/Genymotion-2.6.0-instruction-book.pdf';
        redirect(target);
    }

    // Utils

    function redirect (target) {
        window.location = target;
    }

    function getHash () {
        var uri = URI(window.location.href);
        return uri.fragment(true).fragment();
    }
})();

// trigger redirections
(function () {
    // trying to trigger a redirection immediately (if needed)
    redirect();

    // on url change, we redirect (if needed) the user to the new doc
    window.addEventListener("hashchange", redirect);

    function redirect () {
        // get decoded current url
        var url1 = decodeURIComponent(window.location.href);
        var url2 = decodeURIComponent(window.location.href);

        // get urijs objects, to manipulate urls
        // this lib mutate objects, so making copies for manips
        var uri1 = URI(url1);
        var uri2 = URI(url2);

        // parse url & redirect if needed, try without & with hashbang
        // we use hash('') to remove it. otherwise crossroads don't know
        // what to do.
        var regularPath = uri1.hash('').resource();
        var angularPath = uri2.fragment(true).hash('').resource();

        window.regularRouter.parse(regularPath);
        window.hashbangRouter.parse(angularPath);
    }
})();

