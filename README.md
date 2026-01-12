FIRST REST API SRING BOOT 


DESCRIPTION

Execution of JSON requests and responses

Accessing the database and modifying it(adding,deleting,updating)

Error handling of requests

RESOURCES 

-Spring boot for application configuration

-Spring Data JPA for database accessibility

-H2 database for testing 

-Swagger for API documentation and tesing 

-Jackson for automatic JSON serialization 



The products are managed through the CREATE, READ, UPDATE AND DELETE operations
<img width="759" height="897" alt="Screenshot 2026-01-12 165505" src="https://github.com/user-attachments/assets/904e60f2-07b8-444c-b6ed-dd648eb38d1f" />


The application follows a layered architecture:
Controller

Service

Repository

Database

Product Controller
-Operates the HTTP requests and responses
-To create a product,the user sends a JSON object.JSON is received using the @RequestBody


POST /api/v1/products 
postman<img width="877" height="824" alt="Screenshot 2026-01-12 122320" src="https://github.com/user-attachments/assets/bf6cd5f3-0f67-4188-9549-53e9c96a2471" />

Swagger <img width="1743" height="645" alt="Screenshot 2026-01-12 181021" src="https://github.com/user-attachments/assets/0c2e776e-c410-4e63-a693-7a21b2d42c3b" />
<img width="1752" height="523" alt="Screenshot 2026-01-12 181052" src="https://github.com/user-attachments/assets/1a557be3-2c6f-48a6-a4db-0a313543dda1" />




GET /api/v1/products
postman<img width="879" height="830" alt="Screenshot 2026-01-12 122654" src="https://github.com/user-attachments/assets/165d21b1-153a-43ba-8c01-6bf6c1e2950c" />

swagger<img width="1789" height="584" alt="Screenshot 2026-01-12 182600" src="https://github.com/user-attachments/assets/e5d18c83-df6a-4266-9ccb-c783857e0d50" />


GET /api/v1/products/{id}
postman <img width="896" height="809" alt="Screenshot 2026-01-12 122746" src="https://github.com/user-attachments/assets/e00b6818-c507-4781-b950-7145ac6d09d6" />

swagger <img width="1752" height="488" alt="Screenshot 2026-01-12 182805" src="https://github.com/user-attachments/assets/bbf3f8b2-a905-4884-8de4-6180f927a709" />




PUT /api/v1/products/{id}
postman <img width="887" height="819" alt="Screenshot 2026-01-12 122900" src="https://github.com/user-attachments/assets/beafdc17-a8a6-492d-9701-84abf2608e0e" />

swagger<img width="1780" height="767" alt="Screenshot 2026-01-12 181143" src="https://github.com/user-attachments/assets/523e1b37-ddf7-44d7-9d42-f24afa7cff7c" />

swagger
DELETE /api/v1/products/{id}
postman <img width="881" height="818" alt="Screenshot 2026-01-12 122941" src="https://github.com/user-attachments/assets/c7135772-6d8c-4bcf-8299-135a7f7c0c01" />

swagger 

Product Service 
-calls the repository methods and validates the product's existence.

Repository layer 
- Extends Spring Data JPA repository
- Communicates directly with the database
- Saves the entity into the database
  
Database

The database is created upon execution of the main code and is accessed using the link http://localhost:8080/h2-console

CREATION OF PRODUCTS
<img width="1081" height="630" alt="Screenshot 2026-01-12 122543" src="https://github.com/user-attachments/assets/c79f067b-0f66-4ea5-9589-b2896caf1b3a" />

UPDATING PRODUCT WITH ID 1
<img width="938" height="650" alt="Screenshot 2026-01-12 122916" src="https://github.com/user-attachments/assets/d1ac0a7f-b1dd-4897-ba05-803c2623c5e6" />

DELETING PRODUCT WITH ID 4
<img width="990" height="757" alt="Screenshot 2026-01-12 122953" src="https://github.com/user-attachments/assets/3110f64a-1870-4027-8b18-6571b9401568" />

ERROR HANDLING
The project includes error handling operations 
when an invalid input is entered a bad request error code 400 is given 
<img width="1775" height="656" alt="Screenshot 2026-01-12 183111" src="https://github.com/user-attachments/assets/44608404-3de0-4171-8d92-6878e52fc20d" />
<img width="1748" height="519" alt="Screenshot 2026-01-12 183101" src="https://github.com/user-attachments/assets/9f006078-40ed-4d55-998a-ccf57de31aae" />



when a certain product is not in the database, the 404 error code is given
<img width="1764" height="503" alt="Screenshot 2026-01-12 182914" src="https://github.com/user-attachments/assets/d712f596-6432-4776-afce-e982757c61d6" />

when the serve cannot be accesses, an error code of 500 is given






