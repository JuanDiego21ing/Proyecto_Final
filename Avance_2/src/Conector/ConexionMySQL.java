package Conector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
	 private static final String URL = "jdbc:mysql://localhost:3306/sistema_escolar";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "";

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_escolar", "root","");
	    }
	}