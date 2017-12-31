# Serenity BDD on the Device Farm using the Tractor Plugin

This is an example project for running Serenity BDD tests on the Amazon Device Farm using Tractor Plugin.

A good place to start is the projects [pom.xml](https://github.com/metalmynds/tractor-maven-serenity/blob/master/pom.xml) its based upon the Amazon prescribed approach, the added ingredient is the [Tractor Plugin](https://github.com/metalmynds/tractor-maven-plugin).

Test Execution

Local (Appium Server)
	
	mvn integration-test -P local
	
Remote (Device Farm)

	mvn integration-test -P remote