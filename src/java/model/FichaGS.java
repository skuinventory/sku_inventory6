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
public class FichaGS {
    
    private String codigo;
    private String programa;
    private String nivel;
    private String inicio;
    private String ffinal;
    private String instructor;
    

    public FichaGS() {
    }
    
    
    public FichaGS(String codigo, String programa, String nivel, String inicio, String ffinal, String instructor) {
        this.codigo = codigo;
        this.programa = programa;
        this.nivel = nivel;
        this.inicio = inicio;
        this.ffinal = ffinal;
        this.instructor = instructor;
    }

    public FichaGS(String codigo) {
        this.codigo = codigo;
    }
    
    
    
    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFfinal() {
        return ffinal;
    }

    public void setFfinal(String ffinal) {
        this.ffinal = ffinal;
    }
    
    
    
    
    
}
