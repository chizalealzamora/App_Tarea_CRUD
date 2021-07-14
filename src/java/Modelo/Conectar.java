package Modelo;

import java.sql.Connection;
import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conectar {
        Connection conn = null;
        public DataSource conect;
   
    
public DriverManagerDataSource conectar(){
        DriverManagerDataSource DS=new DriverManagerDataSource();
        DS.setDriverClassName("org.postgresql.Driver");
        DS.setUrl("jdbc:postgresql://localhost:5432/db-sistema");
        DS.setUsername("postgres");
        DS.setPassword("bowie139");
        return DS;
   }    
}
