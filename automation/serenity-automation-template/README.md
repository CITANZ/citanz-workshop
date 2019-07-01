# CITNZ Automation Testing Template for New Project

This is an empty Maven project for Web functionality and API Automation testing. It's the place where you start your automation for a new project.

## Getting Started

**1.** Clone the template project to your local folder

```
git clone https://github.com/bingpple/serenity-automation-template.git
```
**2.** Modify the **'yourprojectname'** in **pom.xml**, **serenity.properties** to suit your new project

**3.** Modify the  <include>**/testsuites/*TestSuite.java</include> in the pom.xml to suit your runner or testsuite class

**4.** Modify the **'yourprojectname'** in the package path to suit your new project

**5.** Add new third party library dependencies to **pom.xml** if necessary

**6.** Run following command to download the dependencies to your local environment. *Note:* making sure you have Maven installed in your local environment
```
mvn install
```
