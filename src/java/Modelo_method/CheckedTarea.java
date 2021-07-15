package Modelo_method;

import Modelo.Tarea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CheckedTarea {
    public static int checked(Connection connection, Tarea obj){
        int result=0;
        
        try{
            
        String sql="UPDATE tarea set tarea_realizado= ?, ::boolean "+"WHERE id_tarea=? ";
        PreparedStatement ps = connection.prepareStatement(sql);
        
        ps.setBoolean(1, obj.isEliminar_tarea());
        ps.setInt(2, obj.getId_tarea());
        
        result = ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
