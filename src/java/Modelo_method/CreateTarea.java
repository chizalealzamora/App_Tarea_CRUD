package Modelo_method;

import Modelo.Tarea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTarea {
    public static int save(Connection connection, Tarea obj){
        int result=0;
        
        try{
            String sql="INSERT INTO Tarea(id_tarea, nombre_tarea, tarea_realizado, fecha_hora, eliminar_tarea)"
                    +"VALUES (DEFAULT, ?, ?, NOW(), ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, obj.getNombre_tarea());
            preparedStatement.setBoolean(2, obj.isTarea_realizado());
            preparedStatement.setBoolean(3, obj.isEliminar_tarea());
            
            result = preparedStatement.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            
        }
        return result;
    }
}
