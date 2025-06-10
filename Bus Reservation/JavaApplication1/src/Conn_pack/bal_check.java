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
public class bal_check {
    private final Connection conn1 = null;
          private final String url1 = "jdbc:mysql://localhost:3306/bus";
          private final String user = "root";
          private final String password = "";
          public int _balance;
          public String Name;
          public int confirm;

    public bal_check(String name){
        try {
            // connect way #1
            Name = name;
            
            Connection conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database ecommerce");
                
                Statement stmt = conn1.createStatement();   //Creating Statement.
                ResultSet rsb = stmt.executeQuery("SELECT * FROM `amount_bal` WHERE `Name` LIKE '"+Name+"';");
                if(rsb.next()){
                    _balance = Integer.parseInt(rsb.getString("bal"));
                    if(_balance <= 250)
                    {
                    confirm = 0;
                    }
                    else
                    {
                    confirm = 1;
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
    
//    public int check(){
//    if(confirm == 1)
//    {
//        return 1;
//    }
//    else{
//        return 0;
//    }
//    }
//   
}
    