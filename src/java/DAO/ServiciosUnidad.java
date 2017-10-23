/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.DbUtil;
import VO.Tabla;
import VO.Unidad;
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
public class ServiciosUnidad {
   
    private Connection connection;
    
    public ServiciosUnidad() {
        connection = DbUtil.getConnection();
    }

    public void agragarUnidad(Unidad  u) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into Tabla(id_Unidad,idContexto,idTabla) values (?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setInt(1, u.getId_unidad());
            preparedStatement.setInt(2, u.getId_contexto());
            preparedStatement.setInt(3, u.getId_tabla());
          

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Unidad> listarUnidad() {
        ArrayList<Unidad> unidades = new ArrayList<Unidad>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from Tabla");
            while (rs.next()) {
               Unidad t = new Unidad();

                t.setId_contexto(rs.getInt("id_contexto"));
               t.setId_unidad(rs.getInt("id_unidad"));
               t.setId_tabla(rs.getInt("id_Tabla"));
               

                unidades.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return unidades;
    }
}

    