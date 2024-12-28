package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondController {
	@FXML
	private Label nameLabel;
	
	public void displayName(String userName) {
		nameLabel.setText("Hello".concat(userName));
	}
}
