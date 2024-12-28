package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	TextField nameTextField;
	
	@FXML
	private Button logoutBtn;
	
	@FXML
	private AnchorPane scenePane;

	public void login(ActionEvent event) throws IOException {

		String userName = nameTextField.getText();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Second.fxml"));
		root = loader.load();
		
		SecondController scene2 = loader.getController();
		
		scene2.displayName(userName);

		// root = FXMLLoader.load(getClass().getResource("/Second.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}
	
	public void logout(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You're about to Logout");
		alert.setContentText("Do you want to save before Exixsting");
		
		if(alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage)scenePane.getScene().getWindow();
			System.out.println("logout succesful");
			stage.close();
		}
	}
}
