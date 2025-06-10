/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conn_pack;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class User_val{

        // creates Connection object
          private final Connection conn1 = null;
          private final String url1 = "jdbc:mysql://localhost:3306/Bus";
          private final String user = "root";
          private final String password = "";
          public String result;
          public String Name;
          public String Email_id;
          public String Age;
          public String Gender;
          public String balance;
          
          
    public User_val(String _Email){
        try {
            // connect way #1
            String Email = _Email;
            Connection conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database ecommerce");
                
                Statement stmt = conn1.createStatement();  
                ResultSet rs = stmt.executeQuery("SELECT * FROM `login` WHERE `Email_id` LIKE '"+Email+"';");
                
                if(rs.next()){
                    Name = rs.getString("Name");
                    Email_id = rs.getString("Email_id");
                    Age = rs.getString("Age");
                    Gender = rs.getString("Gender");
                    ResultSet rsb = stmt.executeQuery("SELECT * FROM `amount_bal` WHERE `Name` LIKE '"+Name+"';");
                    if (rsb.next())
                    {
                        balance=rsb.getString("bal");
                    }
                }
                
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
