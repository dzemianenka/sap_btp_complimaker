**DEVELOPER WORKPLACE SETUP**
---

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
