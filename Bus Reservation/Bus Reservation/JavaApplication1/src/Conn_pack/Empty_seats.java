/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conn_pack;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.*;

public class Empty_seats{

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
          public String empty_seats1 = "";
          public String empty_seats2 = "";
          public String empty_seats3 = "";
          
          
    public Empty_seats(String source,String destination){
        try {
            // connect way #1
            String Src = source;
            String Dest = destination;
            String Src_dest = "";
            String seat = "";
            int count = 1;
            if(Src == "Mumbai" && Dest == "Pune")
            {
                Src_dest = "mum_pune";
            }
            if(Src == "Mumbai" && Dest == "Gujarat")
            {
                Src_dest = "mum_guj";
            }
            if(Src == "Mumbai" && Dest == "Goa")
            {
                Src_dest = "mum_goa";
            }
            if(Src == "Mumbai" && Dest == "Kolhapur")
            {
                Src_dest = "mum_kolh";
            }
            Connection conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database ecommerce");
                
                Statement stmt = conn1.createStatement();  
                ResultSet rs = stmt.executeQuery("SELECT * FROM `"+Src_dest+"` WHERE `status` LIKE 'empty'");
                while(rs.next()){
                    seat = rs.getString("seat_no");
                    
                    if(count < 10){
                    empty_seats1 = empty_seats1+"0"+seat+",";
                    }
                    
                    if(count == 10){
                    empty_seats1 = empty_seats1+ seat+",";
                    }
                    
                    if(count > 10 && count <= 20)
                    {
                    empty_seats2 = empty_seats2+seat+",";
                    }
                    
                    if(count > 20 && count <= 30)
                    {
                    empty_seats3 = empty_seats3+seat+",";
                    }
 
                    count++;
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
