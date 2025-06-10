/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conn_pack;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert_db{

        // creates Connection object
          private final Connection conn1 = null;
          private final String url1 = "jdbc:mysql://localhost:3306/bus";
          private final String user = "root";
          private final String password = "";

    public insert_db(String name, String email_id, int age, String gender, String _Password){
        try {
            // connect way #1
            String Name = name;
            String Email_id = email_id;
            int Age = age;
            String Gender = gender;
            String Password = _Password;
            
            Connection conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database ecommerce");
                
                Statement stmt = conn1.createStatement();   //Creating Statement.
                stmt.executeUpdate("CREATE TABLE `bus`.`"+Name+"` ( `Sr_no` INT NOT NULL AUTO_INCREMENT , `seat_no` INT NOT NULL , `source` VARCHAR(40) NOT NULL , `Destination` VARCHAR(40) NOT NULL , `amount` INT NOT NULL , PRIMARY KEY (`Sr_no`)) ENGINE = InnoDB;");
                stmt.executeUpdate("INSERT INTO `login` (`ID`, `Name`, `Email_id`, `Age`, `Gender`, `Password`) VALUES (NULL, '"+Name+"', '"+Email_id+"', '"+Age+"', '"+Gender+"', '"+Password+"');"); 
                stmt.executeUpdate("INSERT INTO `amount_bal` (`Sr_no`, `Name`, `bal`) VALUES (NULL, '"+name+"', '0');");
            }
            
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid"+ex);

        }
        finally {
            if (conn1 != null) {
                try {
                    conn1.close();
                }
                catch(Exception ex) {
                    System.out.println(ex);
                }
            }
}
        
}
}

