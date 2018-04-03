
# OpenBDT Web Testing Project (JUnit)

## Requirements

The Following dependencies must be installed before writing and running your tests:

- [OpenBDT Framework](https://github.com/FrameworkOpenBDT/OpenBDT)
- [OpenBDT Web](https://github.com/FrameworkOpenBDT/openbdt.web)

## Project Structure:

The project is initially composed by four packages. Considering this sample project has the root package equivalent to **io.openbdt.junit**, there are four other packages inside the root:

- io.openbdt.junit.**features:** Must contain all the feature classes to be tested.
- io.openbdt.junit.**model:** Inside this package, you should create the classes used by the business logic of your tests (e.g User, Account, ListItem, etc).
- io.openbdt.junit.**pages:** Classes that extend `PageObject` and actually are the pages that your test interact to.
- io.openbdt.junit.**steps:** In this package, the creation of classes that implements all the feature test steps.

## Execution
### Inside the project, type the command bellow in console:
```
mvn clean verify
```
### Report
The reports will be generated in `serenity-report` folder inside the project folder.