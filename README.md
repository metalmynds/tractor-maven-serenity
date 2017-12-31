# Serenity BDD on the Device Farm using the Tractor Plugin

This is an example project for running Serenity BDD tests on the Amazon Device Farm using Tractor Plugin.

A good place to start is the projects [pom.xml](https://github.com/metalmynds/tractor-maven-serenity/blob/master/pom.xml) its based upon the Amazon prescribed approach, the added ingredient is the [Tractor Plugin](https://github.com/metalmynds/tractor)
## Test Execution

As the Tractor Plugin takes care of copying the test framework package, client application, test data and configures the run its a lot easier to execute a run on the Device Farm.

Test Results are automatically copied back to the local machine including logs, screenshots, movies and custom locations.

###Local
	
#####Default Device Name
	
	mvn integration-test -P local

**Important**
the
``deviceName``
must be set first.

See 
**Configuration**
to set the device name in the Serenity configuration file.

#####Specify Device Name
	
	mvn integration-test -P local -Dappium.deviceName="MyDeviceName"
###Remote

	mvn integration-test -P remote

To remotely execute the AWS CLI must be installed [Linux](https://docs.aws.amazon.com/cli/latest/userguide/awscli-install-linux.html) [Windows](https://docs.aws.amazon.com/cli/latest/userguide/awscli-install-windows.html) [macOS](https://docs.aws.amazon.com/cli/latest/userguide/cli-install-macos.html).

To setup authentication see [Setting Up AWS Device Farm](https://docs.aws.amazon.com/devicefarm/latest/developerguide/setting-up.html).
		
##Configuration

The
**src/test/resources**
folder is used to store configuration.

Serenity is managed using
**src/test/resources/serenity.conf**

	webdriver {
		remote.url="http://127.0.0.1:4723/wd/hub"
		timeouts.implicitlywait=30
		driver=appium
	}
	
	serenity {
		project.name = "Serenity on the Farm"
		test.root= "io.metalmynds.example.features.security"
		compress.filenames=false
		outputDirectory="${WORKING_DIRECTORY}/report"
		take.screenshots="FOR_EACH_ACTION"
		screenshots.copyDirectory="${appium.screenshots.dir}"
		driver.capabilities="unicodeKeyboard:true;resetKeyboard:true"
		#dry.run=true
	}
	
	appium {
		platformName: Android
		app="classpath:/app-debug.apk"
		deviceName = "MyDeviceName"
		appWaitActivity = ""
	}

To run locally set **deviceName** property to match your local device or emulator.