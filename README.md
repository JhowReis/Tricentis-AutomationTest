
# Tricentis - cucumber-java-example

This is an example BDD test automation project for Java using the Cucumber framework. It contains a simple behavior scenario that fills forms and sends emails within the Tricentis platform.
Purpose

This project was developed to demonstrate how to use Cucumber and Java with a BDD test framework.
Version

This project uses Cucumber-Java 7.9.0. If using IntelliJ IDEA, be sure to update to that version of the Cucumber for Java plugin. Delete all old run configurations if upgrading as well.
Web driver setup

This project uses Selenium WebDriver (version:4.6.0) to interact with the Chrome browser. This version of Selenium uses the drivers within its library, it does not need to be installed on your machine.
To use another version of Selenium Webdriver the ChromeDriver must be installed on the test machine and accessible from the system PATH. (That means it must be accessible from the command line.)

The source code can easily be changed to work with any other web browser.
Execution tests

This project uses Maven . To run the tests, just run "mvn clean test".