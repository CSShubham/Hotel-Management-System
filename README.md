# Hotel Management System

A comprehensive Java-based desktop application for managing hotel operations, built using Java Swing for the GUI and MySQL for database management.

## 📋 Table of Contents
- [Features](#features)
- [System Requirements](#system-requirements)
- [Installation](#installation)
- [Database Setup](#database-setup)
- [Usage](#usage)
- [System Architecture](#system-architecture)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)

## ✨ Features

### Admin Panel
- **Employee Management**: Add, view, and manage hotel staff information
- **Room Management**: Add new rooms, set pricing, and configure room types
- **Driver Management**: Manage pickup service drivers and their details
- **Secure Authentication**: Admin login with password protection

### Reception Panel
- **Customer Registration**: Add new customer details and check-in information
- **Room Operations**: 
  - Check-in/Check-out processes
  - Room status updates
  - Room search and availability checking
- **Customer Management**: View customer information and history
- **Department Information**: Access department details and budgets
- **Employee Information**: View all employee details
- **Pickup Service**: Manage car rental and driver services

### Key Functionalities
- Real-time room availability tracking
- Customer check-in/check-out processing
- Payment and deposit management
- Room cleaning status management
- Comprehensive reporting system
- User-friendly graphical interface

## 🖥️ System Requirements

- **Java**: JDK 8 or higher
- **Database**: MySQL 5.7 or higher
- **Memory**: Minimum 2GB RAM
- **Storage**: At least 100MB free space
- **Operating System**: Windows, macOS, or Linux

### Required Libraries
- MySQL Connector/J
- rs2xml.jar (for table display functionality)

## 🚀 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/hotel-management-system.git
   cd hotel-management-system
   ```

2. **Download required JAR files**
   - Download MySQL Connector/J from [MySQL official site](https://dev.mysql.com/downloads/connector/j/)
   - Download rs2xml.jar for table functionality

3. **Add libraries to classpath**
   - Add mysql-connector-java-x.x.x.jar to your project classpath
   - Add rs2xml.jar to your project classpath

4. **Compile the project**
   ```bash
   javac -cp ".:mysql-connector-java-x.x.x.jar:rs2xml.jar" *.java
   ```

## 🗄️ Database Setup

1. **Install MySQL** and create a new database:
   ```sql
   CREATE DATABASE hotelMs;
   USE hotelMs;
   ```

2. **Create required tables**:

   ```sql
   -- Login tables
   CREATE TABLE login (
       username VARCHAR(50) PRIMARY KEY,
       password VARCHAR(50) NOT NULL
   );

   CREATE TABLE login2 (
       username VARCHAR(50) PRIMARY KEY,
       password VARCHAR(50) NOT NULL
   );

   -- Employee table
   CREATE TABLE employee (
       Name VARCHAR(100) NOT NULL,
       Age INT,
       Gender VARCHAR(10),
       Job VARCHAR(50),
       Salary DECIMAL(10,2),
       Phone VARCHAR(15),
       Email VARCHAR(100),
       Adhar VARCHAR(20)
   );

   -- Room table
   CREATE TABLE room (
       RoomNo VARCHAR(10) PRIMARY KEY,
       Available VARCHAR(20) DEFAULT 'Available',
       Price DECIMAL(10,2),
       CleanStatus VARCHAR(20) DEFAULT 'Cleaned',
       BedType VARCHAR(50)
   );

   -- Customer table
   CREATE TABLE customer (
       Document VARCHAR(50),
       Number VARCHAR(50) PRIMARY KEY,
       Name VARCHAR(100),
       Gender VARCHAR(10),
       Country VARCHAR(50),
       Alocatedroom VARCHAR(10),
       Check_in DATETIME,
       Deposite DECIMAL(10,2)
   );

   -- Driver table
   CREATE TABLE driver (
       Name VARCHAR(100),
       Age INT,
       Gender VARCHAR(10),
       Company VARCHAR(100),
       Car_Name VARCHAR(100),
       Available VARCHAR(20),
       Location VARCHAR(100)
   );

   -- Department table
   CREATE TABLE department (
       Department VARCHAR(100),
       Budget DECIMAL(12,2)
   );
   ```

3. **Insert default login credentials**:
   ```sql
   -- Reception login
   INSERT INTO login VALUES ('reception', 'password123');
   
   -- Admin login  
   INSERT INTO login2 VALUES ('admin', 'admin123');

   -- Sample department data
   INSERT INTO department VALUES 
   ('Front Desk', 50000.00),
   ('Housekeeping', 40000.00),
   ('Kitchen', 60000.00),
   ('Maintenance', 35000.00);
   ```

4. **Update database connection**:
   Edit the `conn.java` file to match your database configuration:
   ```java
   connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelMs", "your_username", "your_password");
   ```

## 📖 Usage

### Starting the Application
1. **Run the main application**:
   ```bash
   java -cp ".:mysql-connector-java-x.x.x.jar:rs2xml.jar" Splash
   ```

2. **Login Options**:
   - **Reception**: Use reception credentials for front desk operations
   - **Admin**: Use admin credentials for management functions

### Main Workflows

#### For Reception Staff:
1. **Customer Check-in**:
   - Click "New Customer Form"
   - Fill in customer details
   - Select available room
   - Process deposit payment

2. **Room Management**:
   - Use "Search Room" to find available rooms
   - Update room status after cleaning
   - Check room availability in real-time

3. **Customer Check-out**:
   - Select customer from dropdown
   - Review check-out details
   - Process final payment
   - Update room availability

#### For Admin:
1. **Staff Management**:
   - Add new employees with complete details
   - View employee information
   - Manage employee records

2. **Room Setup**:
   - Add new rooms with pricing
   - Configure room types and amenities
   - Set initial room status

3. **Service Management**:
   - Add drivers for pickup service
   - Manage vehicle information

## 🏗️ System Architecture

### Core Classes:
- **`Splash.java`**: Application entry point with splash screen
- **`Login.java`** / **`Login2.java`**: Authentication systems for reception/admin
- **`Dashboard.java`**: Main navigation hub
- **`Reception.java`**: Reception panel with all customer operations
- **`Admin.java`**: Administrative panel for management functions

### Feature Modules:
- **Customer Management**: `Customer.java`, `CustomerInfo.java`, `Check_in.java`, `Check_out.java`
- **Room Management**: `Room.java`, `Rooms.java`, `Room_search.java`, `Update_room.java`
- **Staff Management**: `Employee.java`, `EmployeeInfo.java`
- **Services**: `Driver.java`, `Pick_up_service.java`, `Dep.java`
- **Database**: `conn.java`

### Design Patterns Used:
- **Singleton**: Database connection management
- **Observer**: GUI event handling
- **MVC**: Separation of data, view, and control logic

## 🎯 Key Features Explained

### Room Management
- Real-time availability tracking
- Multiple bed types (Single, Double, AC variants)
- Price management per room type
- Cleaning status tracking

### Customer Operations
- Multiple ID types supported (Aadhar, Passport, etc.)
- Automatic room allocation
- Deposit and payment tracking
- Check-in/out timestamp management

### Reporting
- Employee information reports
- Room availability reports
- Customer information tracking
- Department budget overview

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Development Guidelines:
- Follow Java naming conventions
- Add comments for complex business logic
- Test database operations thoroughly
- Ensure GUI responsiveness

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🐛 Troubleshooting

### Common Issues:

1. **Database Connection Failed**:
   - Verify MySQL is running
   - Check connection credentials in `conn.java`
   - Ensure database `hotelMs` exists

2. **ClassNotFoundException**:
   - Verify MySQL connector JAR is in classpath
   - Check rs2xml.jar is available

3. **GUI Not Displaying**:
   - Ensure proper Java version (8+)
   - Check if all image resources are in the correct path

4. **Login Issues**:
   - Verify login credentials in database
   - Check if login/login2 tables have data

## 📞 Support

For support and questions, please:
1. Check the troubleshooting section
2. Review the database setup instructions
3. Create an issue in the GitHub repository

## 🙏 Acknowledgments

- Java Swing documentation and community
- MySQL documentation
- rs2xml library developers
- Contributors to the project

---

**Note**: Remember to update database credentials and file paths according to your system configuration before running the application.