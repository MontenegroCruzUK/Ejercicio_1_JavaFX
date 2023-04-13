package com.ejercicio.ejercicio_1_javafx.controller;

import com.ejercicio.ejercicio_1_javafx.model.DataBaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Login_Controller {
	@FXML
	private TextField txt_Username;
	
	@FXML
	private PasswordField tps_Password;
	
	@FXML
	private Label lb_ErrorMesage;
	
	@FXML
	private Button btn_Login;
	
	@FXML
	private Button btn_Cancel;
	
	@FXML
	public void cancelar (ActionEvent event) {
		Stage stage = (Stage) btn_Cancel.getScene ().getWindow ();
		stage.close ();
		
	}
	
	/**
	 * Handle login button action event.
	 * <p>
	 * Validates user input, shows error message and sets focus to empty field if necessary.
	 * <p>
	 * Calls validateLogin() method if user input is valid.
	 *
	 * @param event The ActionEvent object that triggered this method.
	 */
	@FXML
	public void loginButtonAction (ActionEvent event) {
		// Get trimmed username and password strings from input fields
		String username = txt_Username.getText ().trim ();
		String password = tps_Password.getText ().trim ();
		// Check if username or password fields are empty
		if (username.isEmpty () || password.isEmpty ()) {
			// Show error message
			lb_ErrorMesage.setText ("Invalid login. Fields cannot be empty");
			// Set focus to empty field
			if (username.isEmpty ()) {
				txt_Username.requestFocus ();
			} else {
				// Call validateLogin method
				tps_Password.requestFocus ();
			}
		} else {
			validateLogin ();
		}
		
	}
	
	public void validateLogin () {
		lb_ErrorMesage.setText ("");
		System.out.println ("Todo bien");
		System.out.println ("Estoy haceindo la conexion");
		DataBaseConnection connection = new DataBaseConnection ();
		connection.getConnection ();
		
	}
	
}