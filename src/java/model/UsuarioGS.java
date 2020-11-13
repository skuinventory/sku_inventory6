/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ALEXANDER PENAGOS
 */
public class UsuarioGS {

    private String documento;
    private String usuario;
    private String contraseña;

    public UsuarioGS() {
    }
    
    public UsuarioGS(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public UsuarioGS(String documento, String usuario, String contraseña) {
        this.documento = documento;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
