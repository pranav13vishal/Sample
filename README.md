# Pranav Redbus trave

> Redbus Travels (bus ticket reservation system) is an RESTful web service designed to provide customers with a personalized easy-to-utilize user experience for booking and purchasing tickets online. It stores customers' personal data records, scheduled routes, frequent trips, and other information.

> Redbus Travels (Bus ticket reservation system) application was developed as a casptone project at [GUVI](https://www.guvi.in/). Completed the project in eight days,

# 👉 [Click here](https://drive.google.com/drive/folders/1tQn3oJP_2FBNzV-GOHlN1JWGx-RyNB2f?usp=drive_link) to go through detail explanation of this application

# Features

- User and Admin authentication and validation 
- Admin can provide details like Bus Name,Bus Number, Bus Route, seats, date, time, price
- Admin can provide details of route
- Admim has a sepeate dashboard to add buses, delete buses, edit buses, view registered users 
- User can register by giving all the details
- User can book ticket by selecting Source and destination and date
- User on succesfull booking will receive a pdf
- User has a sepeate dashboard to view his booking and edit his details 

# Technology used 

- Java
- MySQL
- Spring Boot
- Spring data JPA
- RESTful api
- Hibernate
- Swagger
- Lombok
- Maven
- Postman
- GitHub

# Modules

- Login Logout Module
- Admin Module
- User Module
- Bus Route Module
- Reservation Module

# Lessons Learned

- Gain excessive knowledge on application of Java, MySQL and SpringBoot.
- Gain knowledge on creating RESTful API.
- Gain knowledge on creating thymleaf based frontend.
- Got to know how to decode the errors and testing.
- Enjoyed the process of learning and creating the application.

# Overview of Our work


## **All Modules** 
*All modules of our project*
</br>
![Er diagram](https://github.com/pranav13vishal/Sample/blob/7202389a44e92b6619e204b3602cec779f04bca6/assets/user.png)

## **Admin Module** 
*Admin can login by using username (admin) and password (admin1234)*
</br>
![Admin Module](https://github.com/mayurisamanta/Masai-Travels-RESTful-API/blob/main/Assets/Admin_Module.jpg?raw=true)


## **User Module**
*Customer can signup first if not registered earlier*
</br>
*Customer can login with earlier provided username and password*
</br>
![User Module](https://github.com/mayurisamanta/Masai-Travels-RESTful-API/blob/main/Assets/User_Module.jpg?raw=true)

## **Bus Module** 
*Admin can add Bus by providing neccessary details*
</br>
![Bus Module*](https://github.com/mayurisamanta/Masai-Travels-RESTful-API/blob/main/Assets/Bus_Module.jpg?raw=true)

## **Route Module**
*Admin can add Route by providing neccessary details*
</br>
![Route Module](https://github.com/mayurisamanta/Masai-Travels-RESTful-API/blob/main/Assets/Route_Module.jpg?raw=true)

## **Reservation Module**
*User can book Reservation by selecting Source and destination*
</br>
![Reservation Module](https://github.com/mayurisamanta/Masai-Travels-RESTful-API/blob/main/Assets/Reservation_Module.jpg?raw=true)

## **Feedback Module**
*User can give feedback for bus experience*
</br>
![Feedback Module](https://github.com/mayurisamanta/Masai-Travels-RESTful-API/blob/main/Assets/Feedback_Module.jpg?raw=true)

# How To Run Our Project In Your Machine

1. Clone our Project into your system
    - Go to the folder location you want to clone
    - Open terminal 
    - Run command ``` git clone https://github.com/mayurisamanta/Masai-Travels-RESTful-API.git ```
2. Open your preferred Integrated Development Environment (IDE) such as Spring Tool Suite (STS) or IntelliJ IDEA.
3. Import the cloned project into your IDE:
   - In STS, click on "File" in the top menu, then select "Import"
   - In IntelliJ IDEA, click on "File" in the top menu, then select "Open"
4. Select the project directory where you cloned the repository ```RedBus``` and click "OK" or "Open" to import the project.
5. You can run this project with MySQL db 
    - For MySQL, replace all the values under ```db specific properties``` and comment all specifications under ```H2 db``` in ```application.properties```
6. Build the project and run ```RedBus```
7. To access database
    - For MySQL, you can use ```terminal``` as shown in explanation video or ```MySQL Workbench```
8. Open Swagger UI ```http://localhost:8008/swagger-ui/#/``` and execute the end points as in explanation video
    - comment all the clases under the folder 




