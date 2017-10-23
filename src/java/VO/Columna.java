/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author Juan Manuel
 */
public class Columna {
    
    private int id_tabla;
    private int id_columna;
    private String nombre_col;
    private String tipo;
    private boolean foranea;

    public Columna(int id_tabla, int id_columna, String nombre_col, String tipo,boolean foranea) {
        this.id_tabla = id_tabla;
        this.id_columna = id_columna;
        this.nombre_col = nombre_col;
        this.tipo = tipo;
        this.foranea=foranea;
    }

    public Columna() {
       
    }

    public boolean isForanea() {
        return foranea;
    }

    public void setForanea(boolean foranea) {
        this.foranea = foranea;
    }

    public int getId_tabla() {
        return id_tabla;
    }

    public void setId_tabla(int id_tabla) {
        this.id_tabla = id_tabla;
    }

    public int getId_columna() {
        return id_columna;
    }

    public void setId_columna(int id_columna) {
        this.id_columna = id_columna;
    }

    public String getNombre_col() {
        return nombre_col;
    }

    public void setNombre_col(String nombre_col) {
        this.nombre_col = nombre_col;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
