package Modelo_method;

import Interfaces.CRD;
import Modelo.Conectar;
import Modelo.Tarea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Tarea_m implements CRD{
    Conectar cn= new Conectar();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    Tarea t = new Tarea();
    
    @Override
    public List listar() {
        ArrayList <Tarea> list = new ArrayList <>();
        String sql= "select * from AppTareas";
        try{
            conn= (Connection) cn.conectar();
            ps=conn.prepareStatement(sql);
            rs= ps.executeQuery();
            while (rs.next()) {
               Tarea tar = new Tarea();
               tar.setId_tarea(rs.getInt("id_tarea"));
               tar.setNombre_tarea(rs.getString("nombre_tarea"));
               tar.setTarea_realizado(rs.getBoolean("tarea_realizado"));
               tar.setFecha_hora(rs.getString("fecha_hora"));
               tar.setEliminar(rs.getBoolean("eliminar_tarea"));
               list.add(tar);
           }
       }catch(Exception e){
       }
       return list;
    }

    @Override
    public Tarea list(int id) {
        return null;
    }

    @Override
    public boolean add(Tarea tar) {
        String sql="insert into AppTareas(id_tarea, nombre_tarea) values ('"+tar.getId_tarea()+"','"+tar.getNombre_tarea()+"')";
        try{
            conn=(Connection) cn.conectar();
            ps=conn.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
        }
        return false;
    }

    
    public boolean edit(Tarea tar) {
       String sql= "update tarea set nombre_tarea= '"+tar.getNombre_tarea()+"' where id_tarea="+tar.getId_tarea();
       return false;
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }

    @Override
    public boolean edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
