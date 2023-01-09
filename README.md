# gateway-microservice
This repository contains a docker compose file at when run will create a micro service that is connected to a postgres database and will be accessible through a Kong gateway.

* To deploy the application behind the Kong gateway clone this repository into the directory of your choosing.
* Ensure that Docker desktop is running on your device. 
* In CMD run the command `docker-compose up --build`, this will take around 4 minutes to run.
* To see that all containers are running in the Docker desktop window navigate to the containers section. the running containers should include:
    - hello-world
    - kong: with ports 8000, 8001, 8001, 8433, and 8444 exposed.
    - kong-database 
    - db

Setting up API services and routes.
* In a new CMD window cd into the curl folder and run the `docker-compose up --build` command.
* If the container exits with code 0 the services and routes have been created successfully.
* To further test this, we can go to `localhost:8002` to access the kong gateway manager here we could see 5 services each with their own route. 

Confirming the database is set up correctly.
* In CMD run the command `docker exec -it db psql -U compose-postgres`.
* This will put you inside a terminal of the db container and run the psql command line tool. 
* Run the `SELECT * FROM users_table;` query, the output should be a 5 column by 0 row table with all attributes of the user model as the headers for the columns.

Populate the base.
* Run the command `docker exec -it db psql -U compose-postgres -d compose-postgres -f /tmp/init.sql`
* This command populates the database with 1000 unique rows.

TESTING in Postman
* Import the JSON file named `postman-test.postman_collection.json` into Postman 
* Run the GetAllUsers request, the response should be a list of 1000 users in JSON format, with a status code of 200 OK.
* Run the AddNewUser request, there should be no response, and a status code of 201 CREATED.
* Run the UpdateUserById request using an id in the range of 1-1000 and add the updated information to the raw JSON body of the request, this should only return a 200 OK status code  
* Run the GetUser request with the id chosen in the previous step. we should see the updated user and also a 200 OK status code.  
* Run the DeleteUserByID request with the id of the user you just updated in the value column in path variables, there should be no response and a status code of 204 NO CONTENT.
* To confirm the user has been deleted run the GetUser request with the same id, we should get a 500 internal server error, and at the bottom of the error should be the message `user not found`.


