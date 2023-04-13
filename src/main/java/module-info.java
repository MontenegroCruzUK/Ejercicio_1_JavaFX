module com.ejercicio.ejercicio_1_javafx {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	//requires java.sql;
	//requires mysql.connector.java;
	
	
	opens com.ejercicio.ejercicio_1_javafx to javafx.fxml;
	exports com.ejercicio.ejercicio_1_javafx;
	exports com.ejercicio.ejercicio_1_javafx.controller;
	opens com.ejercicio.ejercicio_1_javafx.controller to javafx.fxml;
}