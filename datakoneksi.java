/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class datakoneksi {
    private Connection cn;
    public static Connection BukaKoneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/datastok", "root", "");
            return cn;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
