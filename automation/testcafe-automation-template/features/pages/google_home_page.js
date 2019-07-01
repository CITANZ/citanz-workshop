const {
    Selector
} = require('testcafe');

function select(selector) {
    return Selector(selector).with({
        boundTestRun: testController
    });
}

exports.home = {
    signInButton: function () {
        return select('a').withText('Sign in');
    },
};