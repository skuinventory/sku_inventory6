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
public class Gestioninstructor {
    
         Conexion con=new Conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null; 
    
    
    
    public ArrayList<InstructorGS> listinstructor(){
        ArrayList<InstructorGS> lista=new ArrayList<>();
        try {
            ps=cnn.prepareStatement("SELECT * FROM tb_instructor");
            rs=ps.executeQuery();
            while(rs.next()){
                InstructorGS us=new InstructorGS(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                 lista.add(us);
            }  
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return lista;
    }
    
    public boolean insertinstructor (InstructorGS objin){
        int dat;
        boolean x=false;
        try {
            ps=cnn.prepareStatement("INSERT INTO tb_instructor VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, objin.getDocumento());
            ps.setString(2, objin.getNombre());
            ps.setString(3, objin.getApellido());
            ps.setString(4, objin.getTelefono());
            ps.setString(5, objin.getCorreo());
            ps.setString(6, objin.getUsuario());
            ps.setString(7, objin.getContraseña());
            dat=ps.executeUpdate();
            if (dat>0){
                x=true;
            }
               
                
        } catch (SQLException ex) {
            Logger.getLogger(Gestioninstructor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
    
    
    public ArrayList<InstructorGS> listarInstructor(InstructorGS ins){
        ArrayList<InstructorGS> lista=new ArrayList<>();
        try {
            ps=cnn.prepareStatement("SELECT * FROM tb_instructor where in_di='"+ins.getDocumento()+"'");
            rs=ps.executeQuery();
            while(rs.next()){
                InstructorGS us=new InstructorGS(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                 lista.add(us);
            }  
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return lista;
    }
    
}
