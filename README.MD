
## README SERENITY TEST

A project that exemplifies the use of the serenity screenplay pattern with cucumber and gradle.

The tests in this example are run in the Automation Practice Store website and as a technical test for the company Choucair.

By default, the tests run in Chrome, so it is necessary to have the latest version of the chrome driver installed and to have it added as a variable in the system path.

## Recomendations to run the test:
- When running the complete test, some functionality may fail due to the instability that the page has had, appearing server errors and not allowing the DOM elements to load correctly. However, all tests pass correctly.

- Every time the test is going to be run, the email that is being passed through the "email" variable in the following file must be changed, so that it does not mark an error due to already registered email.

```
java/starter/stepdefinitions/RegisterStepDefinitions.java
```

## Requirements:

To run the project you need Java JDK 1.8 and Gradle preferably with version 4.7.


**Run tests with gradle on chrome:**

```
gradlew clean test -Pwebdriver.driver=chrome -Denvironment=prod
```

If shows the term 'gradlew' is not recognized as a cmdlet name:

```
.\gradlew
```



