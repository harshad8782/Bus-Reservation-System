# Bus Reservation System

A comprehensive Bus Reservation System built in Core Java with GUI using Java Swing. This desktop application allows users to book, cancel, and manage bus tickets with an intuitive interface, efficient thread management for processing bookings, and real-time seat availability management.

## 🚌 Problem Statement

**Problem Identified**: When traveling by bus, it's often very hectic to buy tickets/reserve seats at the time of departure. Long queues, time wastage, and inconvenience are common issues faced by passengers.

**Solution Proposed**: To overcome this problem, we have developed the Bus Seat Reservation System, which helps users book seats at their comfort without having to stand in long queues, saving users valuable time.

## 🚀 Features

- **User-Friendly GUI**: Interactive Java Swing interface for easy navigation
- **Seat Booking**: Real-time seat selection and booking system
- **Ticket Cancellation**: Cancel existing bookings with refund processing
- **Seat Management**: Dynamic seat availability tracking
- **Multi-threading**: Efficient thread management for concurrent bookings
- **Database Integration**: MySQL database for persistent data storage
- **Passenger Management**: Add, edit, and manage passenger information
- **Booking History**: View past and current bookings
- **Route Management**: Manage bus routes and schedules
- **Payment Processing**: Handle booking payments and refunds
- **Report Generation**: Generate booking reports and statistics

## 🛠️ Technology Stack

- **Programming Language**: Java (Core Java)
- **GUI Framework**: Java Swing
- **Database**: MySQL
- **Platform**: Java JDK 19
- **IDE**: NetBeans
- **Threading**: Java Thread Management
- **Architecture**: Desktop Application

## 📋 System Requirements

### Hardware Requirements:
- **Processor**: Intel Core i3 or equivalent
- **RAM**: 4GB minimum (8GB recommended)
- **Storage**: 1GB free disk space
- **Display**: 1024x768 resolution minimum

### Software Requirements:
- **Operating System**: Windows 8/10/11
- **Java Runtime Environment**: JRE 8 or higher
- **Java Development Kit**: JDK 19
- **Database**: MySQL 5.7 or higher
- **IDE**: NetBeans (recommended)

## 🚀 Installation & Setup

### Step 1: Install Java JDK
1. Download Java JDK 19 from [Oracle Official Website](https://www.oracle.com/java/technologies/downloads/)
2. Install JDK on your system
3. Set JAVA_HOME environment variable

### Step 2: Install MySQL Database
1. Download MySQL from [MySQL Official Website](https://dev.mysql.com/downloads/)
2. Install MySQL Server and MySQL Workbench
3. Start MySQL service

### Step 3: Setup Database
1. Open MySQL Workbench or Command Line
2. Create database:
```sql
CREATE DATABASE bus_reservation_db;
USE bus_reservation_db;
```
3. Import the SQL schema file (if provided) or run the database scripts

### Step 4: Clone/Download Project
```bash
# Clone the repository
git clone https://github.com/harshad8782/Bus-Reservation-System.git

# Or download ZIP file and extract
```

### Step 5: Setup in NetBeans IDE
1. Open NetBeans IDE
2. Click on **File → Open Project**
3. Navigate to the project folder and select it
4. Right-click on project → **Properties**
5. Add MySQL JDBC driver to Libraries

### Step 6: Configure Database Connection
Edit the database configuration in your Java files:
```java
// Database Configuration
private static final String DB_URL = "jdbc:mysql://localhost:3306/bus_reservation_db";
private static final String DB_USER = "root";
private static final String DB_PASSWORD = "your_password";
```

### Step 7: Run the Application
1. Build the project in NetBeans
2. Run the main class file
3. The GUI application should launch successfully

## 📁 Project Structure

```
Bus-Reservation-System/
│
├── src/
│   ├── main/
│   │   ├── BusReservationMain.java    # Main application entry point
│   │   ├── LoginFrame.java            # User login interface
│   │   ├── BookingFrame.java          # Ticket booking interface
│   │   ├── CancelFrame.java           # Ticket cancellation
│   │   ├── SeatLayout.java            # Seat arrangement GUI
│   │   └── DatabaseConnection.java     # Database connectivity
│   │
│   ├── models/
│   │   ├── Bus.java                   # Bus entity class
│   │   ├── Passenger.java             # Passenger entity class
│   │   ├── Booking.java               # Booking entity class
│   │   └── Route.java                 # Route entity class
│   │
│   ├── dao/
│   │   ├── BusDAO.java                # Bus data access object
│   │   ├── PassengerDAO.java          # Passenger DAO
│   │   └── BookingDAO.java            # Booking DAO
│   │
│   ├── utils/
│   │   ├── ThreadManager.java         # Thread management utility
│   │   ├── ValidationUtils.java       # Input validation
│   │   └── ReportGenerator.java       # Report generation
│   │
│   └── resources/
│       ├── images/                    # GUI images and icons
│       └── sql/                       # Database schema files
│
├── lib/                               # External JAR files
├── dist/                              # Compiled application
├── build/                             # Build files
└── README.md
```


## 🧵 Threading Implementation

The application uses Java threading for:
- **Concurrent Bookings**: Handle multiple booking requests simultaneously
- **Real-time Updates**: Update seat availability in real-time
- **Background Tasks**: Process payments and database operations
- **GUI Responsiveness**: Maintain UI responsiveness during operations

```java
// Example Thread Implementation
public class BookingThread extends Thread {
    @Override
    public void run() {
        // Handle booking process in separate thread
        processBooking();
    }
}
```

## 📊 Database Schema

### Main Tables:
- **buses** - Bus information (bus_id, bus_name, capacity, route_id)
- **routes** - Route details (route_id, source, destination, distance, fare)
- **passengers** - Customer information (passenger_id, name, email, phone)
- **bookings** - Booking records (booking_id, passenger_id, bus_id, seat_no, date)
- **seats** - Seat management (seat_id, bus_id, seat_no, is_available)
- **payments** - Payment transactions (payment_id, booking_id, amount, status)

## 🔐 Security Features

- **Input Validation**: Comprehensive input validation and sanitization
- **SQL Injection Prevention**: Prepared statements for database queries
- **User Authentication**: Secure login system with password hashing
- **Session Management**: Proper session handling for user security
- **Data Encryption**: Sensitive data encryption where applicable

## 🐛 Troubleshooting

### Common Issues:

**Database Connection Error:**
- Verify MySQL server is running
- Check database credentials in configuration
- Ensure MySQL JDBC driver is added to classpath

**GUI Not Loading:**
- Check Java version compatibility
- Verify Swing components are properly imported
- Look for any missing resource files

**Booking Thread Issues:**
- Monitor thread synchronization
- Check for deadlock conditions
- Verify concurrent access handling

**Compilation Errors:**
- Ensure all dependencies are included
- Check Java version compatibility
- Verify classpath configuration

## 📱 Screenshots

*(Add screenshots of your application here)*

- Login Screen
- Main Dashboard  
- Seat Selection Interface
- Booking Confirmation
- Admin Panel

## 🔄 Future Enhancements

- **Web-based Version**: Convert to web application
- **Mobile App**: Develop mobile application
- **Payment Gateway**: Integration with real payment systems
- **GPS Tracking**: Real-time bus location tracking
- **SMS/Email Notifications**: Automated booking confirmations
- **Multi-language Support**: Support for multiple languages
- **Analytics Dashboard**: Advanced reporting and analytics

## 🤝 Contributing

1. Fork the repository
2. Create feature branch (`git checkout -b feature/new-feature`)
3. Commit changes (`git commit -m 'Add new feature'`)
4. Push to branch (`git push origin feature/new-feature`)
5. Open Pull Request

## 📄 License

This project is open source. Please check the repository for specific license terms.

## 📞 Support & Contact

- **GitHub Issues**: [Create an issue](https://github.com/harshad8782/Bus-Reservation-System/issues)
- **Email**: harshad8782@gmail.com
- **Developer Profile**: [GitHub Profile](https://github.com/harshad8782)

## 🌟 Acknowledgments

- Java Community for excellent documentation
- Oracle for Java Swing framework
- MySQL team for robust database system
- NetBeans IDE for development environment
- All contributors and testers

## 📈 Project Metrics

- **Language**: Java (100%)
- **GUI Components**: Java Swing
- **Database**: MySQL
- **Threading**: Multi-threaded application
- **Architecture**: MVC Pattern

---

**Developer**: Harshad  
**Repository**: [GitHub Link](https://github.com/harshad8782/Bus-Reservation-System)  
**Technology**: Core Java + MySQL + Swing  
**Version**: 1.0  
**Last Updated**: 2025  

For more Java projects and updates, visit the [developer's profile](https://github.com/harshad8782).
