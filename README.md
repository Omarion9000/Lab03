Lab03: JavaFX Input Validator
This is a simple JavaFX application that accepts a user's name, contact number, and postal code. It validates these inputs based on predefined criteria.

Requirements
Username:

The first character must be an uppercase letter ([A-Z]).
All subsequent characters can be either uppercase or lowercase letters.
Contact Number:

The contact number must be exactly 10 digits long and contain only numeric characters.
Acceptable formats:
XXX XXX XXXX
(XXX) XXX XXXX
Postal Code:

Acceptable formats for Canadian postal code:
P6R 2V8
P6r-2V8
p6r 2v8
p6r-2v8
Project Structure
css
Copy code
Lab03
├── .idea
├── .mvn
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org
│   │   │       └── example
│   │   │           └── lab03
│   │   │               ├── Controller.java
│   │   │               ├── Main.java
│   │   │               └── module-info.java
│   │   └── resources
│   │       └── org
│   │           └── example
│   │               └── lab03
│   │                   └── sample.fxml
├── target
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
Getting Started
Prerequisites
Java Development Kit (JDK) 21 or later
Maven
IntelliJ IDEA (or any other Java IDE)
JavaFX SDK
Setup
Clone the repository:

bash
Copy code
git clone <repository-url>
cd Lab03
Open the project in IntelliJ IDEA:

Open IntelliJ IDEA.
Select File -> Open and choose the Lab03 directory.
Configure JavaFX:

Ensure JavaFX libraries are added to your project. You can configure this in the pom.xml.
Build and Run
Build the project:

In IntelliJ IDEA, go to Build -> Rebuild Project.
Run the application:

Right-click on the Main class and select Run 'Main'.
Files
Controller.java: Contains the logic for validating the user input.
Main.java: The entry point of the application.
module-info.java: Defines the module and required dependencies.
sample.fxml: Defines the UI layout for the application.
Validation Logic
Username:

Regex: ^[A-Z][a-zA-Z]*$
Contact Number:

Regex: ^\d{10}$
Regex: ^\d{3} \d{3} \d{4}$
Regex: ^\(\d{3}\) \d{3} \d{4}$
Postal Code:

Regex: ^[A-Za-z]\d[A-Za-z][ -]?\d[A-Za-z]\d$
