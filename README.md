# sap_btp_complimaker

## Prerequisites
Ensure that you have setup a development environment as described [here](.docs/prerequisites.md)

## Build the application
* Clone the project
* Navigate to root of the project (folder with mta.yaml file)
* Execute
`mbt build`
The result should appear in *mta_archives* folder

## Setup BTP account
* Create the trial account [BTP trial](https://cockpit.hanatrial.ondemand.com/trial)
* Navigate to space `dev` and go to `SAP HANA CLOUD`
* Create the database instance
![image](.docs/images/SAP_HANA_CLOUD.png)

## Deploy to Cloud Foundry
* Login to the space from terminal using
`cf login`
* Insert API from BTP
* Insert email and password
* Execute `cf deploy mta_archives/complimaker-application_1.0.0.mtar`
![image](.docs/images/API_EXAMPLE.png)

## Check the application
* Login to the Applications
* Select *complimaker_srv*
* Use route in the top section
* ![image](.docs/images/DEPLOYED_APPLICATION.png)
