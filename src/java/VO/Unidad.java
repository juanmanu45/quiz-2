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
public class Unidad { private int id_unidad;
    private int id_contexto;
    private int id_tabla;

    public Unidad(int id_unidad, int id_contexto, int id_tabla) {
        this.id_unidad = id_unidad;
        this.id_contexto = id_contexto;
        this.id_tabla = id_tabla;
    }

    public Unidad() {
    }

    public int getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(int id_unidad) {
        this.id_unidad = id_unidad;
    }

    public int getId_contexto() {
        return id_contexto;
    }

    public void setId_contexto(int id_contexto) {
        this.id_contexto = id_contexto;
    }

    public int getId_tabla() {
        return id_tabla;
    }

    public void setId_tabla(int id_tabla) {
        this.id_tabla = id_tabla;
    }
}
