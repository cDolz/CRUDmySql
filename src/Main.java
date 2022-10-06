import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/","root","carlos");
            JOptionPane.showMessageDialog(null, "Conexion establecida!");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"La conexion no funciona." );
        }
    }
}