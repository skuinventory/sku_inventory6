/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEXANDER PENAGOS
 */
public class Gestionficha {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null; 
    
    
    
    public ArrayList<FichaGS> listaficha(){
        ArrayList<FichaGS> lista=new ArrayList<>();
        try {
            ps=cnn.prepareStatement("SELECT * FROM tb_ficha");
            rs=ps.executeQuery();
            while(rs.next()){
                FichaGS us=new FichaGS(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6));
                lista.add(us);
            }  
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return lista;
    }
    
    public boolean insertficha (FichaGS objin){
        int dat;
        boolean x=false;
        try {
            ps=cnn.prepareStatement("INSERT INTO tb_ficha VALUES (?,?,?,?,?,?)");
            ps.setString(1, objin.getCodigo());
            ps.setString(2, objin.getPrograma());
            ps.setString(3, objin.getNivel());
            ps.setString(4, objin.getInicio());
            ps.setString(5, objin.getFfinal());
            ps.setString(6, objin.getInstructor());

            dat=ps.executeUpdate();
            if (dat>0){
                x=true;
            }
               
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el modelo");
        }
        return x;
    }
    
    public int eliminar(FichaGS eli){
    int x=0;
        try {
            ps=cnn.prepareStatement("Delete from tb_ficha where fic_codigo='"+eli.getCodigo()+"'");
            x=ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en el modelo");
        }
        return x;
    }
    
    public ArrayList<FichaGS> fichasinstructor(){
        ArrayList<FichaGS> lista=new ArrayList();
        
        try {
            ps=cnn.prepareStatement("select * from tb_ficha ");
            rs=ps.executeQuery();
            
            while (rs.next()) {                
                FichaGS f=new FichaGS(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                lista.add(f);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el modelo");
        }
        return lista;
    }
    
}
