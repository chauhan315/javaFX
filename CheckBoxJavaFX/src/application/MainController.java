package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {
	
	@FXML
	private CheckBox myCheckBox;
	
	@FXML
	private Label myLabel;
	
	@FXML
	private ImageView myImageView;
	
	Image image1 = new Image(getClass().getResourceAsStream("off.jpg"));
	Image image2 = new Image(getClass().getResourceAsStream("on.jpg"));
	
	
	public void change(ActionEvent event) {
		if(myCheckBox.isSelected()) {
			myLabel.setText("ON");
			myImageView.setImage(image2);			
		}else {
			myLabel.setText("OFF");
			myImageView.setImage(image1);
		}
	}
}
