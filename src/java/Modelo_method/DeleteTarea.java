package Modelo_method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTarea {
    public static int delete(Connection connection,int id_tarea){
        int result=0;
        try{
            String sql="DELETE FROM tarea WHERE id_tarea= ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id_tarea);
            
            result= preparedStatement.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
