
package tiketpesawat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    Connection koneksi;
    public static Connection Koneksi(){  
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/newdbpesawat","root","");
            return koneksi;
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    
    }
    
}
