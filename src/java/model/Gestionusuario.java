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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEXANDER PENAGOS
 */
public class Gestionusuario {

    Conexion con = new Conexion();
    Connection cnn = con.conexiondb();
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ArrayList<AprendizGS> listaapr(AprendizGS objugs) {
        ArrayList<AprendizGS> listaapr = new ArrayList<>();

        try {
            ps = cnn.prepareStatement("SELECT aps_di FROM tb_aprendizsofia "
                    + "WHERE aps_di='" + objugs.getDocumento() + "'");

            rs = ps.executeQuery();

            while (rs.next()) {
                AprendizGS us = new AprendizGS(rs.getString(1));
                listaapr.add(us);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la consulta " + ex);
        }
        return listaapr;

    }

    public ArrayList<InstructorGS> listains(InstructorGS objugs) {
        ArrayList<InstructorGS> listains = new ArrayList<>();

        try {
            ps = cnn.prepareStatement("SELECT ins_di FROM tb_instructorsofia "
                    + "WHERE ins_di='" + objugs.getDocumento() + "'");

            rs = ps.executeQuery();

            while (rs.next()) {
                InstructorGS us = new InstructorGS(rs.getString(1));
                listains.add(us);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la consulta " + ex);
        }
        return listains;

    }

    public boolean insertusuario(UsuarioGS objin) {
        int dat;
        boolean x = false;
        try {
            ps = cnn.prepareStatement("INSERT INTO tb_usuario VALUES(?,?,?)");
            ps.setString(1, objin.getDocumento());
            ps.setString(2, objin.getUsuario());
            ps.setString(3, objin.getContraseña());

            dat = ps.executeUpdate();
            if (dat > 0) {
                x = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Gestionusuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

}
