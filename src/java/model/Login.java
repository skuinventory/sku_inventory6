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
import javax.swing.JOptionPane;

/**
 *
 * @author ALEXANDER PENAGOS
 */
public class Login {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null; 
    
     public ArrayList<LoginGS> loginap(LoginGS objugs){
            ArrayList<LoginGS> listaap=new ArrayList<>();
            
            try {
                ps=cnn.prepareStatement("SELECT apr_usuario, apr_password, apr_di FROM tb_aprendiz "
                        +"WHERE apr_usuario='"+objugs.getUsu()+"'"
                        +"AND apr_password='"+objugs.getCont()+"'");
                rs=ps.executeQuery();
                
                while(rs.next()){    
                    LoginGS us=new LoginGS(rs.getString(1), rs.getString(2),rs.getString(3));
                    
                    listaap.add(us);
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error en la consulta "+ex);
            }
            return listaap;
            
        }
     
     public ArrayList<LoginGS> loginin(LoginGS objugs){
            ArrayList<LoginGS> listain=new ArrayList<>();
            
            try {
                ps=cnn.prepareStatement("SELECT in_usuario, in_password, in_di FROM tb_instructor "
                        +"WHERE in_usuario='"+objugs.getUsu()+"'"
                        +"AND in_password='"+objugs.getCont()+"'");
                rs=ps.executeQuery();
                while(rs.next()){
                    LoginGS us=new LoginGS(rs.getString(1), rs.getString(2),rs.getString(3));
                    listain.add(us);
                    
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"No se puede ingresar "+ex);
            }
            return listain;
            
        }
    
}
