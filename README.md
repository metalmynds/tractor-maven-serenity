# Tractor-Maven-Serenity
This is an example project for running Serenity BDD tests on the Amazon Device Farm using Tractor Plugin.

The best place to start is to look at the pom.xml its based upon the Amazon prescribed approach.

If your new to the device farm I recommend reading [Setting Up JUnit Project](https://docs.aws.amazon.com/devicefarm/latest/developerguide/test-types-android-appium-java-junit.html) don't worry most of the steps in setup guide are already done in this project.

The added ingredient is the [Tractor Plugin](https://github.com/metalmynds/tractor-maven-plugin) which automates the uploading of the application, test framework plus manages test run configuration and result download.
