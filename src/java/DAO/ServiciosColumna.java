/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.DbUtil;
import VO.Columna;
import VO.Tabla;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Juan Manuel
 */
public class ServiciosColumna {
    
      private Connection connection;

    public  ServiciosColumna() {
        connection = DbUtil.getConnection();
    }

    public void agregarColumna(Columna c) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into Columna(id_Columna,id_tabla,Nombre_Columna,Tipo_Columna,Foranea) values (?, ?, ?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setInt(1, c.getId_columna());
            preparedStatement.setInt(2, c.getId_tabla());
            preparedStatement.setString(3, c.getNombre_col());
            preparedStatement.setString(4, c.getTipo());
             preparedStatement.setBoolean(3, c.isForanea());
          
           

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Columna> listarColumnas (){
        ArrayList<Columna> columnas = new ArrayList<Columna>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from Columna");
            while (rs.next()) {
                Columna c=new Columna();

                c.setId_tabla(rs.getInt("id_Columna"));
                c.setId_columna(rs.getInt("id_tabla"));
                c.setNombre_col(rs.getString("Nombre_Columna"));
                c.setTipo(rs.getString("Tipo_Columna"));
                c.setForanea(rs.getBoolean("Foranea"));
                
             
                

                columnas.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return columnas;
    }
    
    
    
}
