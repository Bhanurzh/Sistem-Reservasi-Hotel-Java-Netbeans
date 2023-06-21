/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aswan
 */
public class MyConnection {
    public static Connection getConnection() throws SQLException{
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/hotels", "root", "");
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
