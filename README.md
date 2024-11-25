# Airlines Flight Booking System

 
-Overview

The Airlines Flight Booking System is a web-based application designed to provide a seamless, efficient, and secure platform for users to search, book, and manage airline tickets. This system leverages modern technologies to deliver a user-friendly interface and robust backend functionality, ensuring high performance and scalability.

-Features
1-User Login
Secure user authentication.
getAllUsers() Method:
Fetches all users from the database using a SQL query.
Returns a list of User objects encapsulating user data.
Ensures proper handling of database connections and exceptions.
2- Flights

Centralized flight data management for easy manipulation.
Supports scheduling, seat availability, and booking status tracking.
Integration with related entities such as Passenger, Booking, Airport, and Airline.

3- Passenger Management

User-friendly GUI featuring:
Sidebar for easy navigation.
Input fields for passenger details.
Action buttons for saving, editing, and deleting records.
A passenger list table for displaying and managing data.
Enhances data integrity and user experience.

4- Booking Management

Efficient and intuitive GUI:
Input fields for managing booking details.
Action buttons for CRUD operations.
A table for real-time tracking and display of bookings.
Ensures usability, data integrity, and organized data management.
5- Plane Management

GUI for managing airline fleet details:
Input fields for plane data.
Buttons for saving, editing, and deleting records.
A fleet table to display plane information.
Supports operational efficiency and accurate record-keeping.

*Technical Details
Technology Stack
Programming Language: Java
Database: SQLite
Libraries: Various libraries were used to enhance functionality (details below).

*Database Structure
The SQLite database (flightbooking1) contains the following tables:

InternationalFlight
NationalFlight
Passenger
Plane
Seat
Ticket
User
Additionally, the database supports Views (though specifics are not listed).

