/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankit pandey
 */
import java.awt.HeadlessException;
import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
public class javaconnect 
{
    Connection conn=null;
    public static Connection ConnecrDb()
    {
    try
    {
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ankit pandey\\Documents\\NetBeansProjects\\MallManagement\\MallManagement.sqlite");
        JOptionPane.showMessageDialog(null,"Connection Established");
        return conn;
    }
    catch (Exception  e)
    {
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
    }

}