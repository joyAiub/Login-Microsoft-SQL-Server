/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_microsoft_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Joy
 */
public class Sql_Server_Connection {
    public static Connection ConnectDb(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Admin_Joy;integratedSecurity=true");
            System.out.println("Connected");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
        
    }
}
