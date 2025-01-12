# Swagger generated server

# Running the application
1. Copy https://github.com/catenax/testdata into the `/src/main/resources` folder. You will need to request access to the testdata repository as it is private.
2. Run `docker-compose up`
3. Create a run configuration in your IDE for the Spring Boot Application with the following env vars set:

   | Name        | Value |
   | ----------- | ----------- |
   | DB_HOST     | localhost   |
   | DB_PORT     | 5432        |
   | DB_NAME     | postgres    |
   | DB_USER     | postgres    |
   | DB_PWD      | postgres    |
   | TDM_API_KEY | SPEEDBOAT   |
   | TDM_HOST_SECURE | false   |
   | TDM_HOST_NAME | localhost   |
   | TDM_HOST_PORT | 8080   |

3. Start the application from your IDE


## Overview  
This server was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.  
By using the [OpenAPI-Spec](https://github.com/swagger-api/swagger-core), you can easily generate a server stub.  
This is an example of building a swagger-enabled server in Java using the SpringBoot framework.

The underlying library integrating swagger to SpringBoot is [springdoc-openapi](https://github.com/springdoc/springdoc-openapi)

Start your server as an simple java application  

You can view the api documentation in swagger-ui by pointing to  
http://localhost:8080/  

Change default port value in application.properties