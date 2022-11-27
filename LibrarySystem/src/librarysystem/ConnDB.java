
package librarysystem;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConnDB {
    Connection conn = null;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_library?useSSL=true","root","Just1ne7180314");
            
            return conn;
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            return null;
        }
    }
    }

