/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.DbUtil;
import VO.Esquema;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Manuel
 */
public class ServiciosEsquema {

    private Connection connection;

    public ServiciosEsquema() {
        connection = DbUtil.getConnection();
    }

    public void agregarEsquema(Esquema es) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into Esquemas(id_esquema,nombre) values (?, ? )");
            // Parameters start with 1
            preparedStatement.setInt(1, es.getId_esquema());
            preparedStatement.setString(2, es.getVarchar());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Esquema> listarEs() {
        ArrayList<Esquema> esquemas = new ArrayList<Esquema>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from Esquemas");
            while (rs.next()) {
                Esquema es = new Esquema();

                es.setId_esquema(rs.getInt("id_Esquema"));
                es.setVarchar(rs.getString("nombre"));

                esquemas.add(es);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return esquemas;
    }

    public void deleteUser(int es_id) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from Esquemas where userid=?");
            // Parameters start with 1
            preparedStatement.setInt(1, es_id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(int id) {
        try {
            Esquema es=new Esquema();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update Esquemas set id_Esquema=?, nombre=?"
                            + "where userid=?");
            // Parameters start with 1

            preparedStatement.setInt(1, es.getId_esquema());
            preparedStatement.setString(2, es.getVarchar());
            preparedStatement.setInt(3, id);
           

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Esquema extraerEsquema(String nombre) {
		Esquema es=new Esquema();
		try {
			PreparedStatement preparedStatement = connection.
					prepareStatement("select id_Esquema from Esquemas where nombre = ? ");
			preparedStatement.setString(1, nombre);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				es.setId_esquema(rs.getInt("id_Esquema"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return es;
	}

}
