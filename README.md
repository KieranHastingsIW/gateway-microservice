# gateway-microservice
A micro service tucked away behind a kong gateway, hooked up to a database, all wrapped up in docker containers 

*
* To deploy the application behind the Kong gateway clone this repository into the directory of your choising.
* In CMD run the commanad `docker-compose up --build`, this will take around 4 minutes to run so sit back and relax.
* Once all containers have started you can begin testing.

TESTING 
* import the JSON file into Postman 
* Run the GetAllUsers request, the response should be an empty list [], with a status code of 200 OK.
* Run the AddNewUser request, there should be no response, and a status code of 201 CREATED.
* Run the GetAllUSers request again to confirm the users was added to the data base take note of the ID.
* Run the DeleteUserByID request with the id of the user you just added in the value column in path varibles, there shoud be no response and a status code of 202 ACCEPTED.
