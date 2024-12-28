package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class MainController implements Initializable{
	@FXML
	private Label label;
	
	@FXML
	private Slider slider;
	
	int temperature;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		temperature = (int)slider.getValue();
		label.setText(Integer.toString(temperature)+" *C");
		
		slider.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				temperature = (int)slider.getValue();
				label.setText(Integer.toString(temperature)+" *C");
			};
		});
		
	}
	
}	
