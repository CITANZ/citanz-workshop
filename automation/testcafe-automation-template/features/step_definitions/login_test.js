//import minimist from 'minimist';
const {
    Given,
    When,
    Then
} = require('cucumber');

const googleHomePage = require('../pages/google_home_page');
const googleLoginPage = require('../pages/google_login_page');

Given(/^user is on the login page$/, async function () {
    // Write code here that turns the phrase above into concrete actions
    await testController.navigateTo('https://www.google.com');
});


When(/^user wants to login$/, async function () {
    await testController.click(googleHomePage.home.signInButton());
});


Then(/^user should be on sign in page$/, async function () {
    await testController.expect(googleLoginPage.login.emailField().exists).eql(true);
});