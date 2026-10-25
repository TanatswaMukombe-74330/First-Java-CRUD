This API project is built using Spring boot system

The application follows a layered architecture:
Controller
Service
Repository
Database

The products are managed through the CREATE, READ, UPDATE AND DELETE operations

Product Controller :

Operates the HTTP requests and responses

POST /api/v1/products 
postman(screenshots/swagger.png)

GET /api/v1/products
GET /api/v1/products/{id}
PUT /api/v1/products/{id}
DELETE /api/v1/products/{id}

Product Service :

calls the repository methods and validates the product's existence.


