package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class MainController implements Initializable{
	
	@FXML
	private Label label;
	
	@FXML
	private ChoiceBox<String> choiceBox;
	
	private String[] food = {"pizza","patees","burger","roll"};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		choiceBox.getItems().addAll(food);
		choiceBox.setOnAction(this::getFood);
	}
	
	public void getFood(ActionEvent event) {
		String myFood = choiceBox.getValue();
		label.setText(myFood);
	}
	
}	
