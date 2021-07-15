package Modelo_method;

import Modelo.Tarea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTarea {
    public static int save(Connection connection, Tarea obj){
        int result=0;
        
        try{
            String sql="INSERT INTO Tarea(nombre_tarea, tarea_realizado, fecha_hora, eliminar_tarea)"
                    +"VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, obj.getNombre_tarea());
            preparedStatement.setBoolean(2, obj.isTarea_realizado());
            preparedStatement.setString(3, obj.getFecha_hora());
            preparedStatement.setBoolean(4, obj.isEliminar_tarea());
            
            result = preparedStatement.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            /*
            if (ex.getMessage().contains("llave duplicada")&& ex.getMessage().contains("u_nombre_tarea")) result=-1;
            if (ex.getMessage().contains("llave duplicada")&& ex.getMessage().contains("u_tarea_realizado")) result=-2;
            if (ex.getMessage().contains("llave duplicada")&& ex.getMessage().contains("u_fecha_hora")) result=-3;    
            */
        }
        return result;
    }
}
