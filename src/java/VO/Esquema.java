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
public class Esquema {
   
    private int id_esquema;
    private String nombre_es;

    public Esquema(int id_esquema, String varchar) {
        this.id_esquema = id_esquema;
        this.nombre_es = varchar;
    }
    public Esquema(){}

    public int getId_esquema() {
        return id_esquema;
    }

    public void setId_esquema(int id_esquema) {
        this.id_esquema = id_esquema;
    }

    public String getVarchar() {
        return nombre_es;
    }

    public void setVarchar(String varchar) {
        this.nombre_es = varchar;
    }
    
   
    
}
