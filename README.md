# Car Services Center

Car Services Center allows your to build new Car centers with some functions in it such as Checking oil or changing color or simply adding cars , car centers and owners and retrieve them !


# Class Diagram 

![CarCenterClassDiagaram](https://github.com/MemZhr/CarCenterBE/assets/72718294/60cfde5b-3cd4-4065-b0cf-6d8715dd92c5)


##  Setup
### What you need ? 
- [IntelliJ IDEA](https://www.jetbrains.com/idea/): A powerful integrated development environment (IDE) for Java development.
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html): Java development tools and libraries.
-  [Postman API](https://www.postman.com/downloads/): API platform for building and using APIs.

1. **Clone the repo**
   ```sh
   https://github.com/MemZhr/CarCenterBE.git
   ```
2. **Navigate to CenterApplicaton and run the program**
3. **Use Postman for one of the routes mentioned in Controllers Section**

##   Technologies Used

- [Spring Boot](https://spring.io/projects/spring-boot/)
- [Postman](https://www.postman.com/downloads/)
- [Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok)



##    Controllers and Routes structure

| HTTP Method | Endpoint                    | Description                          | Request Body (JSON)  | Response (JSON)              |
|-------------|-----------------------------|--------------------------------------|----------------------|------------------------------|
| GET         | /centers                    | Get all car service centers          | None                 | List of CarCenter objects    |
| GET         | /centers/{centerId}         | Get car service center by ID         | None                 | CarCenter object             |
| POST        | /centers                    | Add a new car service center         | CarCenter object     | None (Status 201 Created)    |
| PUT         | /centers/{centerId}         | Update a car service center          | CarCenter object     | None (Status 204 No Content) |
| PATCH       | /centers/name/{centerId}    | Update a car service center's name   | {"name": "New Name"} | None (Status 204 No Content) |
| DELETE      | /centers/{centerId}         | Delete a car service center by ID    | None                 | None (Status 204 No Content) |
|      --     |              --             |                  --                  |          --          |              --              |
| GET         | /owners                     | Get all owners                       | None                 | List of Owner objects        |
| GET         | /owners/{ownerId}           | Get owner by ID                      | None                 | Owner object                 |
| GET         | /owners/carCenter/{ownerId} | Get car center by owner ID           | None                 | CarCenter object or Object   |
| POST        | /owners                     | Add a new owner                      | Owner object         | None (Status 201 Created)    |
| PUT         | /owners/{ownerId}           | Update an owner                      | Owner object         | None (Status 204 No Content) |
| PATCH       | /owners/name/{ownerId}      | Update owner's name                  | {"name": "New Name"} | None (Status 204 No Content) |
| DELETE      | /owners/{ownerId}           | Delete an owner by ID                | None                 | None (Status 204 No Content) |
|      --     |              --             |                  --                  |          --          |              --              |
| GET         | /sedan                      | Get all sedans                       | None                 | List of Sedan objects        |
| GET         | /sedan/{vin}                | Get sedan by VIN                     | None                 | Sedan object                 |
| PATCH       | /sedan/transfer/{vin}       | Transfer ownership of a sedan by VIN | SedanOwnerDTO JSON   | None (Status 204 No Content) |


## Extra links

-  [Presentation](https://www.canva.com/design/DAFyl3q_2EE/LKRCsucYs3vdAj7WSoh6wA/edit?utm_content=DAFyl3q_2EE&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton): Make sure to check this out.

##    Future Work

1. Adding more functions to the CarCenter.
2. more routes for advanced requests.
3. Creating employee class.
4. Implementing authentication and authorization.
5. more exception handling.


##   Resources

[Spring Boot documents](https://spring.io/projects/spring-boot/)
[Telusko youtube channel](https://www.youtube.com/@Telusko)
[stackoverflow](https://stackoverflow.com/)



#    Team members

Me.

