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
public class LoginGS {
    
    private String usu;
    private String cont;
    private String rol;
    private String documento;

    public LoginGS() {
    }

    public LoginGS(String usu, String cont, String documento) {
        this.usu = usu;
        this.cont = cont;
        this.documento = documento;
    }

    public LoginGS(String usu, String cont) {
        this.usu = usu;
        this.cont = cont;
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
}
