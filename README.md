# gateway-microservice
This repository contains a docker compose file at when run will create a micro service that is connected to a postgres database and will be accessible through a Kong gateway.

* To deploy the application behind the Kong gateway clone this repository into the directory of your choosing.
* Ensure that Docker desktop is running on your device. 
* In CMD run the command `docker-compose up --build`, this will take around 4 minutes to run.
* To see that all containers are running in the Docker desktop window navigate to the containers section. the running containers should include:
    - hello-world
    - kong: with ports 8000, 8001, 8002, 8433, and 8444 exposed.
    - kong-database 
    - db
* Open a new CMD window and cd into the curl folder.
* Run the `docker-compose up --build` command 
TESTING in Postman
* Import the JSON file named `postman-test.postman_collection.json` into Postman 
* Run the GetAllUsers request, the response should be an empty list [], with a status code of 200 OK.
* Run the AddNewUser request, there should be no response, and a status code of 201 CREATED.
* Run the GetAllUsers request again to confirm the users was added to the data base take note of the ID.
* Run the UpdateUserById request using the id shown in the GetAllUsers output in the id path variable, add the updated information to the raw JSON body of the request, this should only return a 200 OK status code  
* Run the GetUser request with the id if the User that you were updating to view the updated details. This should also return a 200 OK status code. 
* Run the DeleteUserByID request with the id of the user you just updated in the value column in path variables, there should be no response and a status code of 204 NO CONTENT.
* To confirm the user has been deleted run the GetAllUsers, the list should once again be empty 

