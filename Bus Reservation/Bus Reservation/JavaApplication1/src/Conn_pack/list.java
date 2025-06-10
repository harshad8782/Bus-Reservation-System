/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conn_pack;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class list{

        // creates Connection object
          private final Connection conn1 = null;
          private final String url1 = "jdbc:mysql://localhost:3306/Bus";
          private final String user = "root";
          private final String password = "";
          public String result;
          String _Name;
          public String element;
          int count = 1;
          
    public list(JList list,String Name){
        try {
            _Name = Name;
            DefaultListModel model = new DefaultListModel();
            // connect way #1
            Connection conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database ecommerce");
                
                Statement stmt = conn1.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM `"+_Name+"`;");
                while(rs.next()){
                    int seat_no = Integer.parseInt(rs.getString("seat_no"));
                    String Source = rs.getString("source");
                    String Destination = rs.getString("Destination");
                    int Amount = Integer.parseInt(rs.getString("amount"));
                    element = count+" "+seat_no+" "+Source+" "+Destination+" "+Amount;
                    model.addElement(element);
                    list.setModel(model);
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
