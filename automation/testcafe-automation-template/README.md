# testcafe-automation-template

#After pull the template project, run the command below

**npm install**

#Then run the tests with following command to run automation locally

**./node_modules/.bin/cucumber-js --world-parameters {\\"browser\\":\\"chrome\\"} -f json:./report/cucumber_report.json**

#At last, run following command to generate a HTML report

**node ./report_chrome.js**
or
**node ./report_firefox.js**

This repo is based on https://github.com/rquellh/testcafe-cucumber
