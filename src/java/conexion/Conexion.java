package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection cnn;
    
    public Connection conexiondb(){
        
          //controlarcontroladores
        try {
           Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        try{
        
            cnn= DriverManager.getConnection("jdbc:mysql://localhost/db_sku_inventory","alexandertamer","AlexanderTamer");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"NO SE PUEDE CONECTAR"+ex);
        }
        return cnn;
        
    }
    public static void main(String[]args){
        Conexion cc=new Conexion();
        cc.conexiondb();
    }
    
}
