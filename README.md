Person Registration and Login System
Overview
This Java Swing application allows users to register personal information and later log in using their details.
The system uses serialization to save and load user data, and it includes basic validation for name, IC number, and email address.

Features
User Registration: Users can enter their name, IC number, and email. The information is validated and saved into a file.
Login Functionality: Users can log in by entering their details. The system checks if the provided details match any saved records.
Data Persistence: User data is serialized and saved in a file (Person.dat), allowing the application to persist data between sessions.
Validation: Basic validation for name, IC number, and email is provided.

Requirements
Java Development Kit (JDK) 8 or higher
Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or NetBeans (optional but recommended for GUI design)

Usage
Launch the Application:

Run NewJFrame to start the GUI application.
Register a New User:
Enter the required details (Name, IC Number, and Email) into the respective fields.
Click the Save button to save the details. The information will be validated and saved to Person.dat.
Log In:
Enter your Name, IC Number, and Email into the fields.
Click the Login button to check if the entered details match any saved records. A message will indicate whether the login is successful or not.

File Format
Person.dat: Serialized file used to store user information. This file is created in the root directory of the project.
Validation Patterns
Name: Validates names with the pattern ^([a-zA-Z]+)((\\s[a-zA-Z]+)*)$, which ensures names are properly formatted.
IC Number: Validates IC numbers with the pattern ^(\\d{6})-(\\d{2})-(\\d{4})$, ensuring the format XXXXXX-XX-XXXX.
Email: Validates email addresses with the pattern ^(\\w+)((.\\w+)*)@(\\w+)((\\w+.)*)$.

Troubleshooting
FileNotFoundException: Ensure that the Person.dat file is accessible and located in the correct directory.
IOException: Check for issues related to file permissions or corruption.
ClassNotFoundException: Ensure that the Person class is correctly compiled and present.
