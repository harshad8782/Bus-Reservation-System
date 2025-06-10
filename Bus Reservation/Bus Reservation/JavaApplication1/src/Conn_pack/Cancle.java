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
import Conn_pack.*;
import javax.swing.JList;

public class Cancle{

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
          String Src_dest = "";
          int _balance;
          
    public Cancle(String Name,int seat_no,String Source,String Destination,JList jlist){
        try {
            _Name = Name;
            SeatNO = seat_no;
            Src = Source;
            Dest = Destination;
            String check1 = "Mumbai";
            String check2 = "Pune";
            String check3 = "Gujarat";
            String check4 = "Goa";
            String check5 = "Kolhapur";
            
            System.out.println(Src);
            if(Src.equals(check1) && Dest.equals(check2))
            {
                Src_dest = "mum_pune";
            }
            if(Src.equals(check1) && Dest.equals(check3))
            {
                Src_dest = "mum_guj";
            }
            if(Src.equals(check1) && Dest.equals(check4))
            {
                Src_dest = "mum_goa";
            }
            if(Src.equals(check1) && Dest.equals(check5))
            {
                Src_dest = "mum_kolh";
            }
            System.out.println(Src_dest);
            
            Connection conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database ecommerce");
                
                Statement stmt = conn1.createStatement();  
                ResultSet rs = stmt.executeQuery("SELECT * FROM `"+_Name+"` WHERE `seat_no` = '"+SeatNO+"' AND `source` LIKE '"+Src+"' AND `Destination` LIKE '"+Dest+"';");
                if(rs.next()){
                    int Sr_NO = Integer.parseInt(rs.getString("Sr_no"));
                    System.out.println("OK");
                    stmt.executeUpdate("DELETE FROM `"+_Name+"` WHERE `"+_Name+"`.`Sr_no` = '"+Sr_NO+"';");
                    stmt.executeUpdate("UPDATE `"+Src_dest+"` SET `status` = 'empty' WHERE `seat_no` = '"+SeatNO+"';p");
                    ResultSet rsb = stmt.executeQuery("SELECT * FROM `amount_bal` WHERE `Name` LIKE '"+Name+"';");
                    if(rsb.next()){
                        _balance = Integer.parseInt(rsb.getString("bal")) + 250;
                        stmt.executeUpdate("UPDATE `amount_bal` SET `bal` = '"+_balance+"' WHERE `Name` = '"+Name+"';");
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

