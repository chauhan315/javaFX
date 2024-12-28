package application;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class MainController implements Initializable{
	
	@FXML
	private ProgressBar progressBar;
	
	@FXML
	private Button btn;
	
	@FXML
	private Label label;
	
	BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		progressBar.setStyle("-fx-accent: red;");
		
	}
	
	public void clickBtn() {
		if(progress.doubleValue() <1 ) {
			progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
			System.out.println(progress.doubleValue());
			progressBar.setProgress(progress.doubleValue());
			label.setText(Integer.toString((int)Math.round(progress.doubleValue() * 100)) +"%");
		}
	}

	
}	
