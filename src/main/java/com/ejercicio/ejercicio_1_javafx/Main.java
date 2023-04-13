package com.ejercicio.ejercicio_1_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Main extends Application implements Initializable {
	@Override
	public void initialize (URL location, ResourceBundle resources) {
	
	}
	
	@Override
	public void start (Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader (Main.class.getResource ("view/Login_view.fxml"));
		stage.initStyle (StageStyle.UNDECORATED);
		Scene scene = new Scene (fxmlLoader.load ());
		stage.setTitle ("Hello!");
		stage.setScene (scene);
		stage.show ();
	}
	
	public static void main (String[] args) {launch ();}
	
	
}