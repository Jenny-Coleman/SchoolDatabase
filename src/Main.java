
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Main {
    // allows con to be used across the project
    public static Connection con;

    public static void main(String[] args) {
        Main pro = new Main();
        pro.createConnection();

        // displayes the login form
        new Login().setVisible(true);
    }

    // creating a connection to the database
    void createConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb", "root", "root");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
