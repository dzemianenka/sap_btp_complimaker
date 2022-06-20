# sap_btp_complimaker

___

###**DEVELOPER WORKPLACE SETUP**

*[REQUIRED] SapMachine 11 (Java Development Kit)*
* Download latest version of SapMachine 11 JDK from sapmachine.io and install in your dedicated development folder
* Follow the instructions on github.com: SAP/SapMachine (Installation) for installation.
  More information (also where to open an issue) can be found on github.com: SAP/SapMachine
  Please note that you may need to switch the used JDK depending on the JDK version the project has been built with and change the PATH and/or JAVA_HOME environment variable.

*[REQUIRED] Maven*
* Download latest Maven version via: https://maven.apache.org/download.cgi and install in your dedicated development folder
* Installation hints: see https://maven.apache.org/install.html.
* Add the path to the /bin folder of your maven installation to your PATH variable
* (OPTIONAL configuration for SAP projects only) In the .m2 directory of your user home directory (e.g. C:\Users\C0123456\.m2), store the settings.xml file. It will configure Maven from where (i.e. from which Repository Manager, in our case Artifactory - [settings.xml](https://markdowntohtml.com)) to fetch the Java dependencies listed in the pom.xml of your project.

*[REQUIRED] Node/npm*
* Download the NodeJS LTS Installation v12 for 64 bit (-x64) from nodejs.org (@sap/hana-client does not yet support NodeJS v14) and install in your dedicated development folder

*[REQUIRED] mbt (Cloud MTA Build Tool)*
* Prerequisite: o Install Node/npm as described above o Install GNU Make according to this documentation
* Open a command prompt/terminal and install mbt using the command “npm install -g mbt”

*[REQUIRED] Cloud Foundry CLI incl. deploy plugin*
* Check the official documentation for download links and installation guide
* In addition, you need the MTA plugin for Cloud Foundry:
* Make sure that you have the Cloud Foundry community repository in your Cloud Foundry command line interface. If it is not available there, add it by executing the following command:

`cf add-plugin-repo CF-Community https://plugins.cloudfoundry.org`

* To install the plugin, enter the following command:

`cf install-plugin multiapps -f`

*[REQUIRED] „mbt build“ requires „grunt“*
* Open a command prompt/terminal and install grunt via

`npm install -g grunt-cli`

___

###**BUILD THE APPLICATION**

* Clone the project
* Navigate to root of the project (folder with mta.yaml file)
* Execute
`mbt build`
The result should appear in *mta_archives* folder
___

###**PREPARE BTP ACCOUNT**

* Create the trial account [BTP trial](https://cockpit.hanatrial.ondemand.com/trial)
* Navigate to space and go to SAP HANA CLOUD
* Create the database instance

___

###**DEPLOY THE APPLICATION**

* Login to the space using
`cf login`
* Insert API from BTP
* Insert email and password
* Execute `cf deploy mta_archives/complimaker-application_1.0.0.mtar`
___

###**CHECK THE APPLICATION**

* Login to the Applications
* Select *complimaker_srv*
* Use route in the top section
