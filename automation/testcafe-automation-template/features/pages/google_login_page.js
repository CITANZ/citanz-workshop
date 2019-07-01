const {
    Selector
} = require('testcafe');

function select(selector) {
    return Selector(selector).with({
        boundTestRun: testController
    });
}

exports.login = {
    emailField: function () {
        return select('input').withAttribute('type','email');
    },
};