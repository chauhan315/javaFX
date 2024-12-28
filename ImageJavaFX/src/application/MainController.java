package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {
	
	@FXML
	ImageView myImageView;
	
	@FXML
	Button myBtn;
	
	Image myImage = new Image(getClass().getResourceAsStream("th1.jpg"));
	
	public void displayImage() {
		myImageView.setImage(myImage);
	}
}
