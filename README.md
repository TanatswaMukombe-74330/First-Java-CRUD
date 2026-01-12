This API project is built using Spring boot

The application follows a layered architecture:
Controller
Service
Repository
Database

The products are managed through the CREATE, READ, UPDATE AND DELETE operations

Product Controller
-Operates the HTTP requests and responses
-To create a product,the user sends a JSON object.JSON is received using the @RequestBody


POST /api/v1/products 
postman<img width="877" height="824" alt="Screenshot 2026-01-12 122320" src="https://github.com/user-attachments/assets/bf6cd5f3-0f67-4188-9549-53e9c96a2471" />
Swagger ui


GET /api/v1/products
postman<img width="879" height="830" alt="Screenshot 2026-01-12 122654" src="https://github.com/user-attachments/assets/165d21b1-153a-43ba-8c01-6bf6c1e2950c" />

swagger
GET /api/v1/products/{id}
postman <img width="896" height="809" alt="Screenshot 2026-01-12 122746" src="https://github.com/user-attachments/assets/e00b6818-c507-4781-b950-7145ac6d09d6" />

swagger
PUT /api/v1/products/{id}
postman <img width="887" height="819" alt="Screenshot 2026-01-12 122900" src="https://github.com/user-attachments/assets/beafdc17-a8a6-492d-9701-84abf2608e0e" />

swagger
DELETE /api/v1/products/{id}
postman <img width="881" height="818" alt="Screenshot 2026-01-12 122941" src="https://github.com/user-attachments/assets/c7135772-6d8c-4bcf-8299-135a7f7c0c01" />

swagger

The database is created upon execution of the main code and is accessed using the link http://localhost:8080/h2-console
CREATION OF PRODUCTS
<img width="1081" height="630" alt="Screenshot 2026-01-12 122543" src="https://github.com/user-attachments/assets/c79f067b-0f66-4ea5-9589-b2896caf1b3a" />

UPDATING PRODUCT WITH ID 1
<img width="938" height="650" alt="Screenshot 2026-01-12 122916" src="https://github.com/user-attachments/assets/d1ac0a7f-b1dd-4897-ba05-803c2623c5e6" />

DELETING PRODUCT WITH ID 4
<img width="990" height="757" alt="Screenshot 2026-01-12 122953" src="https://github.com/user-attachments/assets/3110f64a-1870-4027-8b18-6571b9401568" />




Product Service 
-calls the repository methods and validates the product's existence.

Repository layer 
- Extends Spring Data JPA repository
- Communicates directly with the database
- Saves the entity into the database


