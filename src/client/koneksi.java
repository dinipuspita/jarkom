/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;
import static jdk.nashorn.internal.runtime.Debug.id;


/**
 *
 * @author Dini-PC
 */
public class koneksi {
    public static Connection con;
    public static Statement stm;
    void GetConnection(){
        try {
            String url ="jdbc:mysql://localhost:3306/infoti";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm = (Statement) con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }

    
   
    
}
