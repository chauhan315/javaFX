package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class MainController implements Initializable {

	@FXML
	private ImageView image;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		// translate
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(image);
		translate.setDuration(Duration.millis(1000));
		translate.setCycleCount(TranslateTransition.INDEFINITE);
		translate.setByX(300);
		translate.setByY(100);
		translate.setAutoReverse(true);
		translate.play();

		// rotate
		RotateTransition rotate = new RotateTransition();
		rotate.setNode(image);
		rotate.setDuration(Duration.millis(500));
		rotate.setCycleCount(TranslateTransition.INDEFINITE);
		rotate.setByAngle(360);
		rotate.setInterpolator(Interpolator.LINEAR);
		rotate.setAxis(Rotate.Y_AXIS);
		rotate.setAutoReverse(true);
		rotate.play();
		
		//fade
		FadeTransition fade = new FadeTransition();
		fade.setNode(image);
		fade.setDuration(Duration.millis(5000));
		fade.setCycleCount(TranslateTransition.INDEFINITE);
		fade.setInterpolator(Interpolator.LINEAR);
		fade.setFromValue(1);
		fade.setToValue(0);
		fade.setAutoReverse(true);
		fade.play();
		
		//scale
		ScaleTransition scale = new ScaleTransition();
		scale.setNode(image);
		scale.setCycleCount(ScaleTransition.INDEFINITE);
		scale.setDuration(Duration.millis(1000));
		scale.setInterpolator(Interpolator.LINEAR);
		scale.setByX(2.0);
		scale.setByY(2.0);
		scale.setAutoReverse(true);
		scale.play();
	}

}
