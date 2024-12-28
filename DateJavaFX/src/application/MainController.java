package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private DatePicker myDatePicker;
	
	@FXML
	private Label dateLabel;
	
	public void getDate(ActionEvent event) {
		LocalDate myDate = myDatePicker.getValue();
		String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		System.out.println(myFormattedDate);
	}
}
