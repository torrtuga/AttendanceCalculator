
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Galaxy1
 */
public  class JavaConnect {

    Connection conn = null;

    public static Connection ConnecrDB() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:E:\\NetBeansProject\\Attendance\\Attendance.sqlite");
            return conn;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
        

    }

}
