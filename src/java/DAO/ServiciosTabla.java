/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.DbUtil;
import VO.Esquema;
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
public class ServiciosTabla {

    private Connection connection;

    public ServiciosTabla() {
        connection = DbUtil.getConnection();
    }

    public void agragarTabla(Tabla t) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into Tabla(id_Tabla,Nombre_tabla,id_esquema,) values (?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setInt(1, t.getId_tabla());
            preparedStatement.setString(2, t.getNombre_Tabla());
            preparedStatement.setInt(23, t.getId_esquema());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Tabla> listarEs() {
        ArrayList<Tabla> tablas = new ArrayList<Tabla>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from Tabla");
            while (rs.next()) {
                Tabla t = new Tabla();

                t.setId_tabla(rs.getInt("id_Esquema"));
                t.setNombre_Tabla(rs.getString("Nombre_tabla"));
                t.setId_esquema(rs.getInt("id_esquema"));

                tablas.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tablas;
    }

    public Tabla extraerTabla(String nombre) {
        Tabla t = new Tabla();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("'select id_Tabla from Tabla where Nombre_tabla=?");
            preparedStatement.setString(1, nombre);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                t.setId_esquema(rs.getInt("id_Esquema"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return t;

    }
}
