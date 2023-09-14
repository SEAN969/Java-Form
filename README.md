 Customer Information Form Application

 Author
- Sean Manamela

 Description
This Java Swing application provides a user-friendly form for entering customer details and saves them in a SQL Server database. The application is designed to facilitate the storage of customer information efficiently.

 Date
- September 13, 2023

---

 Table of Contents

1. [Introduction](introduction)
2. [Usage](usage)
3. [Form Elements](form-elements)
4. [Inserting Customer Details](inserting-customer-details)
5. [Clearing Form Fields](clearing-form-fields)
6. [Troubleshooting](troubleshooting)
7. [Contributing](contributing)
8. [License](license)

---

 1. Introduction <a name="introduction"></a>
This Java Swing application, `GUI`, provides a graphical user interface for entering customer details. It connects to a SQL Server database using the `DatabaseConnection` class and inserts customer information into the database when the "Submit" button is clicked. The application aims to streamline the process of storing customer data efficiently.

 2. Usage <a name="usage"></a>
To use this application, follow these steps:

1. Ensure you have configured the `DatabaseConnection` class with your SQL Server database connection details. Refer to the [Database Connection](database-connection) section of the README for details.

2. Compile and run the `GUI` class. You will see a graphical form for entering customer details.

3. Fill in the customer information fields as required.

4. Click the "Submit" button to insert the customer details into the database.

 3. Form Elements <a name="form-elements"></a>
The application provides the following form elements for entering customer details:

- Customer Code (Text Field)
- First Name (Text Field)
- Last Name (Text Field)
- Unit Number (Text Field)
- Street Number (Text Field)
- Street Name (Text Field)
- Town (Text Field)
- City (Text Field)
- Submit Button

 4. Inserting Customer Details <a name="inserting-customer-details"></a>
When you click the "Submit" button, the `insertCustomer` method is invoked. This method retrieves the values entered into the form fields and inserts them into the SQL Server database using a prepared statement.

 5. Clearing Form Fields <a name="clearing-form-fields"></a>
After successfully inserting customer details into the database, the `clearFields` method is called to clear all form fields. This ensures that the form is ready for the next customer's information.

 6. Troubleshooting <a name="troubleshooting"></a>
If you encounter any issues or errors while using this application, consider the following troubleshooting steps:

- Verify that the `DatabaseConnection` class is correctly configured with your SQL Server database connection details.

- Ensure that you have the necessary SQL Server JDBC driver in your classpath.

- Check for any syntax errors in your SQL queries.

If problems persist, refer to the Java Swing documentation or seek assistance from the developer community.

 7. Contributing <a name="contributing"></a>
Contributions to this project are welcome! If you have suggestions for improvements, bug fixes, or feature additions, please submit a pull request. For significant changes, it is recommended to open an issue first to discuss your ideas.

 8. License <a name="license"></a>
This application is licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute this code as needed.

---

Thank you for using the `GUI` Customer Information Form application. If you have any questions or need further assistance, please don't hesitate to contact the author, Sean Manamela.
