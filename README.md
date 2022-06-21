# sap_btp_complimaker

## Prerequisites
___
Ensure that you have setup a development environment as described [here](.docs/prerequisites.md)

## Build the application
___
* Clone the project
* Navigate to root of the project (folder with mta.yaml file)
* Execute
`mbt build`
The result should appear in *mta_archives* folder

## Setup BTP account
___
* Create the trial account [BTP trial](https://cockpit.hanatrial.ondemand.com/trial)
* Navigate to space and go to SAP HANA CLOUD
* Create the database instance

## Deploy to Cloud Foundry
___
* Login to the space using
`cf login`
* Insert API from BTP
* Insert email and password
* Execute `cf deploy mta_archives/complimaker-application_1.0.0.mtar`

## Check the application
___
* Login to the Applications
* Select *complimaker_srv*
* Use route in the top section
