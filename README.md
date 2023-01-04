# gateway-microservice
This repository contains a docekr compose fule at when run will create a micro service that is connected to a postgres database and will be accessable through a Kong gateway.

* To deploy the application behind the Kong gateway clone this repository into the directory of your choising.
* Ensure that Docker desktop is running on your device. 
* In CMD run the commanad `docker-compose up --build`, this will take around 4 minutes to run.
* To see that all containers are running in the Docker desktop window naviagte to the containers section. the running containers should include:
    - hello-world
    - kong: with ports 8000, 8001, 8001, 8433, and 8444 exposed.
    - kong-database 
    - db

TESTING in Postman
* Import the JSON file named `postman-test.postman_collection.json` into Postman 
* Run the GetAllUsers request, the response should be an empty list [], with a status code of 200 OK.
* Run the AddNewUser request, there should be no response, and a status code of 201 CREATED.
* Run the GetAllUsers request again to confirm the users was added to the data base take note of the ID.
* Run the UpdateUserById request using the id shown in the GetAllUsers output in the id path varible, add the updated information to the raw jason body of the request, this should only return a 200 OK status code  
* Run the GetAllUsers request again to confirm the users information was updated.
* Run the DeleteUserByID request with the id of the user you just updated in the value column in path varibles, there shoud be no response and a status code of 204 NO CONTENT.
* To confirm the user has been deleted run the GetAllUsers, the list should once again be empty 

