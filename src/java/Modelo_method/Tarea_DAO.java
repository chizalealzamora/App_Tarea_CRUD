/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_method;

import java.util.List;
import Modelo.Tarea;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
/*
 *
 * @author walmart
 */
public class Tarea_DAO {
    
    public static List <Tarea> getAllFalse(Connection connection){
        List <Tarea> list = new ArrayList<>();
        try{
            String sql ="SELECT id_tarea, nombre_tarea, tarea_realizado, fecha_hora, eliminar_tarea FROM tarea WHERE tarea_realizado = false";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet result = preparedStatement.executeQuery();
                
            while (result.next()) {
                Tarea obj = new Tarea();

                obj.setId_tarea(result.getInt("id_tarea"));
                obj.setNombre_tarea(result.getString("nombre_tarea"));
                obj.setTarea_realizado(result.getBoolean("tarea_realizado"));
                obj.setFecha_hora(result.getString("fecha_hora"));
                obj.setEliminar_tarea(result.getBoolean("eliminar_tarea"));
                
                list.add(obj);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return list;
    }
    
    public static List<Tarea> getAllTrue(Connection connection){
        List<Tarea> list = new ArrayList<>();
        try{
            String sql="SELECT id_tarea, nombre_tarea, tarea_realizado, fecha_hora, eliminar_tarea FROM tarea WHERE tarea_realizado= true";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet result = preparedStatement.executeQuery();
            
            while (result.next()) {
                Tarea obj= new Tarea();
                
                obj.setId_tarea(result.getInt("id_tarea"));
                obj.setNombre_tarea(result.getString("nombre_tarea"));
                obj.setTarea_realizado(result.getBoolean("tarea_realizado"));
                obj.setFecha_hora(result.getString("fecha_hora"));
                obj.setEliminar_tarea(result.getBoolean("eliminar_tarea"));
                
                list.add(obj);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return list;
    }
    
    public static int getCount(Connection connection){
        int contador=0;
        try{
            String sql="SELECT count(*) AS contador FROM tarea WHERE tarea_realizado= false";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet result = preparedStatement.executeQuery();
            
            if (result.next()) {
                contador=result.getInt("contador");
            }
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return contador;
    }
}
