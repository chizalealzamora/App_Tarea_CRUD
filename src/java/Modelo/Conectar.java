package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
        private Connection connection;
        private final String urlDatabase = "jdbc:postgresql://localhost:5432/db-sistema";
        private final String user = "postgres";
        private final String password = "12345";
        //private static String message;

        public Connection getConnection() {
            return connection;
        }

        public void setConnection(Connection connection) {
            this.connection = connection;
        }

        public void createConnection() {
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(urlDatabase, user, password);
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println(ex.getMessage());
            } finally {
                System.out.println("Conexión creada correctamente");
            }
        }

        public void closeConnection() {
            try {
                connection.close();
                System.out.println("Conexión cerrada correctamente");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }