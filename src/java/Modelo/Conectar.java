package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
        private Connection connection;
        private final String urlDatabase="jdbc:postgresql://localhost:5432/db-sistema";
        private final String usuario="postgres";
        private final String password="bowie139";
        
        public Connection getConnection(){
            return connection;
        }
        
        public void setConnection(Connection connection){
            this.connection=connection;
        }
       
        public void createConnection(){
            try{
                Class.forName("org.postgres.Driver");
                connection = DriverManager.getConnection(urlDatabase, usuario, password);
                
            } catch(ClassNotFoundException | SQLException ex){
                System.out.println(ex.getMessage());
                
            }finally{
                System.out.println("Conexion creada correctamente");
            }
        }
        
        public void closeConnection(){
            try{
                connection.close();
                System.out.println("Conexion cerrada correctamente");
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }