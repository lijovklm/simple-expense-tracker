# Simple Expense Tracker (Backend) 

This is a simple expense tracker application to learn and understand the use of Rest web services in Spring.

This project was created based on steps outlined at below url with some modifications:
https://spring.io/guides/gs/multi-module/

## Usage and setup (Local machine)

Clone simple-boot-build-tools: <br>
```
git clone https://github.com/heartin/simple-boot-build-tools.git
cd simple-boot-build-tools
'./mvnw clean install' or 'mvn clean install'
cd ..
```

Clone simple-starter-parent-java: <br>
```
git clone https://github.com/heartin/simple-boot-parent-java.git
<cd> simple-boot-parent-java
'./mvnw clean install' or 'mvn clean install'
cd ..
```

Clone simple-boot-parent-rest-jpa: <br>
```
git clone https://github.com/heartin/simple-boot-parent-rest-jpa.git
cd simple-boot-parent-rest-jpa
'./mvnw clean install' or 'mvn clean install'
cd ..
```

Clone simple-expense-tracker: <br>
```
git clone https://github.com/lijovklm/simple-expense-tracker.git
cd simple-expense-tracker
'./mvnw clean install' or 'mvn clean install'
```

### Accessing H2 Console
After running the Main class, H2 console can be accessed at: <br>
http://localhost:8080/h2-console <br>
Driver class: org.h2.Driver <br>
JDBC URL: jdbc:h2:mem:testdb <br>
User Name: sa
