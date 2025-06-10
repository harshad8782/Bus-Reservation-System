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

public class Booking{

        // creates Connection object
          private final Connection conn1 = null;
          private final String url1 = "jdbc:mysql://localhost:3306/Bus";
          private final String user = "root";
          private final String password = "";
          public String result;
          String Src;
          String Dest;
          int _price;
          int SeatNO;
          String _Name;
          public int confirm;
          int _balance;
          
    public Booking(String Name,String source,String destination,int seat_no,int price){
        try {
            // connect way #1
            _Name = Name;
            SeatNO = seat_no;
            Src = source;
            Dest = destination;
            _price = price;
            String Src_dest = "";
            
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
                ResultSet rs = stmt.executeQuery("SELECT * FROM `"+Src_dest+"` WHERE `seat_no` = "+seat_no+" AND `status` LIKE 'empty'");
                if(rs.next()){
                    stmt.executeUpdate("INSERT INTO `"+_Name+"` (`Sr_no`, `seat_no`, `source`, `Destination`, `amount`) VALUES (NULL, '"+SeatNO+"', '"+Src+"', '"+Dest+"', '"+_price+"');");
                    stmt.executeUpdate("UPDATE `"+Src_dest+"` SET `status` = 'full' WHERE `seat_no` = "+SeatNO+";");
                    ResultSet rsb = stmt.executeQuery("SELECT * FROM `amount_bal` WHERE `Name` LIKE '"+Name+"';");
                    if(rsb.next()){
                        _balance = Integer.parseInt(rsb.getString("bal")) - 250;
                        System.out.println(_balance);
                        stmt.executeUpdate("UPDATE `amount_bal` SET `bal` = '"+_balance+"' WHERE `Name` = '"+Name+"';");
                    }
                    confirm = 1;
                }
                else{
                    confirm = 0;
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
    
    public int check(){
    if(confirm == 1)
    {
        return 0;
    }
    else
    {
        return 0;
    }
    }
}
