/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conn_pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TUF
 */
public class add_bal {
    private final Connection conn1 = null;
          private final String url1 = "jdbc:mysql://localhost:3306/bus";
          private final String user = "root";
          private final String password = "";
          public int _balance;
          public String  Name;

    public add_bal(int balance,String name){
        try {
            // connect way #1
            Name = name;
            _balance = balance;
            Connection conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database ecommerce");
                
                Statement stmt = conn1.createStatement();   //Creating Statement.
                ResultSet rsb = stmt.executeQuery("SELECT * FROM `amount_bal` WHERE `Name` LIKE '"+Name+"';");
                if(rsb.next()){
                    _balance = _balance + Integer.parseInt(rsb.getString("bal"));
                    System.out.println(_balance);
                    stmt.executeUpdate("UPDATE `amount_bal` SET `bal` = '"+_balance+"' WHERE `Name` = '"+Name+"';");
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
