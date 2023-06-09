package com.ejercicio.ejercicio_1_javafx.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	// Detalles de la base de datos
	static final String DB_URL = "jdbc:mysql://localhost:3306/db_egg";
	static final String USER = "root";
	static final String PASS = "";
	
	public Connection getConnection () {
		Connection conn = null;
		try {
			// Registrar el driver JDBC
			Class.forName ("com.mysql.cj.jdbc.Driver");
			// Hacer la conexión a la base de datos
			System.out.println ("Conectando a la base de datos...");
			conn = DriverManager.getConnection (DB_URL, USER, PASS);
			// Si la conexión es exitosa, mostrar un mensaje
			System.out.println ("Conexión exitosa a la base de datos.");
		} catch (SQLException se) {
			// Manejar los errores de JDBC
			se.printStackTrace ();
		} catch (Exception e) {
			// Manejar los errores de clase.forName
			e.printStackTrace ();
		}
		return conn;
	}
}
