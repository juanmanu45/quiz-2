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
public class Tabla {
    
    private int id_esquema;
    private int id_tabla;
    private String  nombre_Tabla;

    public Tabla(int id_esquema, int id_tabla, String nombre_Tabla) {
        this.id_esquema = id_esquema;
        this.id_tabla = id_tabla;
        this.nombre_Tabla = nombre_Tabla;
    }
    
    public Tabla (){}

    public int getId_esquema() {
        return id_esquema;
    }

    public void setId_esquema(int id_esquema) {
        this.id_esquema = id_esquema;
    }

    public int getId_tabla() {
        return id_tabla;
    }

    public void setId_tabla(int id_tabla) {
        this.id_tabla = id_tabla;
    }

    public String getNombre_Tabla() {
        return nombre_Tabla;
    }

    public void setNombre_Tabla(String nombre_Tabla) {
        this.nombre_Tabla = nombre_Tabla;
    }

    
    
    
}
