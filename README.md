Project Description
------------------------------------------------------------
This project is a Java-based desktop Point of Sale (POS) 
application developed for a small retail shop in Sri Lanka.

The system supports:
• User authentication (cashier login)
• Product management (Add/View products)
• Sales transaction processing
• Automatic bill calculation
• Bill generation
• Database record storage using SQL

The application demonstrates:
• Object-Oriented Programming (OOP)
• JDBC database connectivity
• SQL relational database design
• CRUD operations
• Basic transaction handling
• Exception handling and input validation

------------------------------------------------------------
Technologies Used
------------------------------------------------------------
• Java (Swing / JavaFX)
• MySQL (Relational Database)
• JDBC

------------------------------------------------------------
Database Driver (JAR File Used)
------------------------------------------------------------
mysql-connector-j-8.0.xx.jar

(Note: The JAR file is NOT included in the submission as instructed.)

------------------------------------------------------------
Database Setup Instructions
------------------------------------------------------------
1. Install MySQL Server.
2. Open MySQL Workbench or Command Line.
3. Create a new database:
      CREATE DATABASE pos_system;
4. Select the database:
      USE pos_system;
5. Run the provided database.sql file to create tables:
      Users
      Products
      Sales
      Sale_Items

------------------------------------------------------------
How to Run the Application
------------------------------------------------------------
1. Install JDK 17 or above.
2. Add the JDBC driver (mysql-connector-j-8.0.xx.jar) to the project library.
3. Open the project in IntelliJ IDEA / Eclipse.
4. Configure database connection details in DBConnection.java:
      - Database URL
      - Username
      - Password
5. Run Main.java.
6. Login using a valid username and password stored in the database.

------------------------------------------------------------
System Functionalities
------------------------------------------------------------
1. User Authentication
   - Validates username and password from database.

2. Product Management
   - Add new products.
   - View product list.

3. Sales Processing
   - Select product and quantity.
   - Calculate total automatically.
   - Reduce stock quantity after successful sale.

4. Bill Generation
   - Displays product details and total amount.
   - Stores transaction with date and time in database.

