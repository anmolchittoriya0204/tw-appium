# TrustWallet Android Application Automation

## Overview
This project showcases an automation suite

## Framework Enhancements
- Utilization of TestNG annotations and listeners for enhanced test management.
- Dynamic sourcing of configuration data from JSON and property files.
- Adoption of the Page Object Model for improved maintainability.
- Integration of Extent reports to provide comprehensive testing insights.
- Automated initialization of the Appium server for seamless CI/CD integration.

## Automated Test Scenarios
- Testing the backup process of secret phrase verification.
- Testing negative scenarios in the new wallet creation process.
- Testing the creation of a new wallet with manual backup verification.
- Testing the selection of an incorrect secret phrase during backup verification.
- Testing the creation of a new wallet with the option to skip backup.


## Requirements
- Java 11
- Appium v2.0
- Maven v3.9 
- Node.js
- Android SDK
- Ensure Java, Maven, and Android are added to the Environmental Path.

## Execution Commands
To execute the tests, run one of the following commands in your terminal:

To perform a clean installation and execute the specified TestNG suite:

```bash
mvn clean install -Dtestngfile={testng}
```

To perform a clean installation, execute the specified TestNG suite, and retry failed tests up to a maximum count:

```bash
mvn clean install -Dtestngfile={testng} -DmaxRetryCount=2
```

Feel free to use these commands as per your testing requirements.
