**DEVELOPER WORKPLACE SETUP**
---

*[REQUIRED] SapMachine 11 (Java Development Kit)*
* Download latest version of SapMachine 11 JDK from [sapmachine.io](https://sap.github.io/SapMachine/#download) and install in your dedicated development folder
* Follow the instructions on [github.com: SAP/SapMachine (Installation)](https://github.com/SAP/SapMachine/wiki/Installation) for installation.
* Please note that you may need to switch the used JDK depending on the JDK version the project has been built with and change the *PATH* and/or *JAVA_HOME* environment variable.

*[REQUIRED] Maven*
* Download latest Maven version via: [download](https://maven.apache.org/download.cgi) and install in your dedicated development folder
* Installation hints: [see](https://maven.apache.org/install.html)
* Add the path to the /bin folder of your maven installation to your *PATH* variable
> (OPTIONAL configuration for SAP projects only) In the .m2 directory of your user home directory (e.g. C:\Users\C0123456\.m2), store the settings.xml file. It will configure Maven from where (i.e. from which Repository Manager, in our case Artifactory - [settings.xml](https://markdowntohtml.com)) to fetch the Java dependencies listed in the pom.xml of your project.

*[REQUIRED] Node/npm*
* Download the NodeJS LTS Installation v12 for 64 bit (-x64) from [nodejs.org](https://nodejs.org/dist/v12.19.1/) and install in your dedicated development folder
> Note: @sap/hana-client or other libraries could not support NodeJS v14

*[REQUIRED] mbt (Cloud MTA Build Tool)*
* Install Node/npm as described above 
* Install GNU Make according to this [documentation](https://sap.github.io/cloud-mta-build-tool/makefile/)
* Open a command prompt/terminal and install mbt using the command `npm install -g mbt`

*[REQUIRED] Cloud Foundry CLI incl. deploy plugin*
* Check the official [documentation](https://github.com/cloudfoundry/cli#downloads) for download links and installation guide
* In addition, you need the [MTA plugin for Cloud Foundry](https://help.sap.com/docs/BTP/65de2977205c403bbc107264b8eccf4b/27f3af39c2584d4ea8c15ba8c282fd75.html):
* Make sure that you have the Cloud Foundry community repository in your Cloud Foundry command line interface. If it is not available there, add it by executing the following command:

`cf add-plugin-repo CF-Community https://plugins.cloudfoundry.org`

* To install the plugin, enter the following command:

`cf install-plugin multiapps -f`

*[REQUIRED] „mbt build“ requires „grunt“*
* Open a command prompt/terminal and install grunt via

`npm install -g grunt-cli`
