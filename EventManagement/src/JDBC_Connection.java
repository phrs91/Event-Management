/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sonu
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement; 
public class JDBC_Connection {
    static Connection con;
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonupmandal","root","");  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from users");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3) );  
 con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}