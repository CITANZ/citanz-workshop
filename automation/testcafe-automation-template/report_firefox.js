var reporter = require('cucumber-html-reporter');
var reporter = require('cucumber-html-reporter');

var options = {
    theme: 'bootstrap',
    jsonFile: 'report/cucumber_report.json',
    output: 'report/cucumber_report.html',
    reportSuiteAsScenarios: true,
    launchReport: true,
    metadata: {
        "Test Environment": "STAGING",
        "Browser": "Firefox Latest",
        "Platform": "Ubuntu 18.04",
        "Parallel": "Scenarios",
        "Executed": "Remote"
    }
};

reporter.generate(options);