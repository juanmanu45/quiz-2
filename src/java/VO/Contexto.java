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
public class Contexto {
    private int id_contexto;
   private int link;
   private int id_modelo;

    public Contexto(int id_contexto, int link, int id_modelo) {
        this.id_contexto = id_contexto;
        this.link = link;
        this.id_modelo = id_modelo;
    }

    public Contexto() {
    }

    public int getId_contexto() {
        return id_contexto;
    }

    public void setId_contexto(int id_contexto) {
        this.id_contexto = id_contexto;
    }

    public int getLink() {
        return link;
    }

    public void setLink(int link) {
        this.link = link;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public void getId_contexto(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
