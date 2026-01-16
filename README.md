# Student Portal – Java Web Application

## 📌 Project Description
Student Portal is a Java-based web application developed using **Servlets, Maven, and Apache Tomcat**.  
The objective of this project is to demonstrate the complete lifecycle of a Java web application — from project setup and build to WAR packaging and deployment on Tomcat.

The application provides basic student management features using **in-memory storage**.

---

## 🛠️ Technologies Used
- Java 17
- Java Servlets (Servlet API 3.x)
- Apache Maven
- Apache Tomcat 9.x
- HTML & CSS
- Git & GitHub

---

## ✅ Prerequisites
Ensure the following tools are installed on your system:

- Java JDK 8 or higher (Java 17 used)
- Apache Maven
- Apache Tomcat 9.x
- Git

Verify installations using:
```bash
java -version
mvn -version
git --version
```
---
## 📂 Project Structure  
```text
student-portal/
├── pom.xml
├── README.md
├── .gitignore
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/blackngreen/studentportal/
│   │   │       ├── model/
│   │   │       │   └── Student.java
│   │   │       ├── service/
│   │   │       │   └── StudentService.java
│   │   │       └── servlet/
│   │   │           ├── HelloServlet.java
│   │   │           ├── StudentListServlet.java
│   │   │           └── AddStudentServlet.java
│   │   ├── webapp/
│   │   │   ├── WEB-INF/
│   │   │   │   └── web.xml
│   │   │   ├── css/
│   │   │   │   └── style.css
│   │   │   └── index.html
│   └── test/
└── target/


```
---
## ⚙️ Build Instructions (Maven)
```bash
mvn clean
mvn compile
mvn test
mvn clean package


```
---
## 🚀 Deployment Steps (Apache Tomcat)
```text
-Set the CATALINA_HOME environment variable to your Tomcat installation directory.

-Copy the generated WAR file to the Tomcat webapps directory:

-cp target/student-portal-1.0.0.war $CATALINA_HOME/webapps/


Start Tomcat:

-$CATALINA_HOME/bin/startup.sh


Open the application in your browser:

http://localhost:9090/student-portal-1.0.0/
```