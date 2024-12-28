package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;

public class MainController implements Initializable{
	
	@FXML
	private ListView<String> listView;
	
	@FXML
	private Label label;
	
	String[] food = {"pizza", "sushi", "patees"}; 
	String currentFood;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listView.getItems().addAll(food);
		
		listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				currentFood = listView.getSelectionModel().getSelectedItem();
				label.setText(currentFood);
				
			}
			
		});
		
	}

	
}	
