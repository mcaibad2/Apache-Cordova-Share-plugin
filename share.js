/**
 * @author Andreas Daskalopoulos
 * 
 * Usage: window.plugins.share.show('This is my subject', 'This is text to share');
 */
cordova.define("cordova/plugin/share", function (require, exports, module) {
    var exec = require("cordova/exec");

    function Share() {}

    Share.prototype.show = function (subject, text, successCallback, failureCallback) {
        exec(successCallback, failureCallback, 'SharePlugin', 'share', [subject, text]);
    };

    var share = new Share();
    module.exports = share;
});

if (!window.plugins) {
    window.plugins = {};
}

if (!window.plugins.Share) {
    window.plugins.share = cordova.require("cordova/plugin/share");
}