/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conn_pack;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class login{

        // creates Connection object
          private final Connection conn1 = null;
          private final String url1 = "jdbc:mysql://localhost:3306/Bus";
          private final String user = "root";
          private final String password = "";
          public String result;
          
    public login(String _Name, String _Password){
        try {
            // connect way #1
            String Name = _Name;
            String Password = _Password;
            Connection conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database ecommerce");
                
                Statement stmt = conn1.createStatement();  
                ResultSet rs = stmt.executeQuery("SELECT * FROM `login` WHERE `Email_id` LIKE '"+Name+"' AND `Password` LIKE '"+Password+"';");
                if(rs.next()){
                    result = "true";
                System.out.print(rs.getString("Name"));
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
    public int resutl()
    {
        if(result == "true")
        {
        return 1;
        }
        else
        {
        return 0;
        }
    }
}
