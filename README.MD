
## README SERENITY TEST

A project that exemplifies the use of the serenity screenplay pattern with cucumber and gradle.

The tests in this example are run in the Automation Practice Store website and as a technical test for the company Choucair.

By default, the tests run in Chrome, so it is necessary to have the latest version of the chrome driver installed and to have it added as a variable in the system path.

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
## Recommendations for running the tests:




