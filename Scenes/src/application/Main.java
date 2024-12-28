package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Group root = new Group();
		Scene scene = new Scene(root,600,600,Color.SKYBLUE);
		Stage stage = new Stage();
		
		Text text = new Text("In the Constructor");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana", 50));
		text.setFill(Color.LIMEGREEN);
		
//		Line line = new Line();
//		line.setStartX(200);
//		line.setStartY(200);
//		line.setEndX(500);
//		line.setEndY(500);
//		line.setStrokeWidth(5);
//		line.setStroke(Color.RED);
//		line.setOpacity(0.5);
//		line.setRotate(90);
//		
//		root.getChildren().add(line);
		
//		Rectangle rectangle = new Rectangle();
//		rectangle.setX(100);
//		rectangle.setY(150);
//		rectangle.setFill(Color.PINK);
//		rectangle.setStrokeWidth(5);
//		rectangle.setStroke(Color.RED);
//		rectangle.setWidth(250);
//		rectangle.setHeight(150);
//		root.getChildren().add(rectangle);
		
//		Polygon triangle = new Polygon();
//		triangle.getPoints().setAll(200.0, 200.0,
//									300.0,300.0,
//									200.0,300.0);
//		triangle.setFill(Color.YELLOW);
//		root.getChildren().add(triangle);
//		
//		Circle circle = new Circle();
//		circle.setCenterX(350);
//		circle.setCenterY(350);
//		circle.setRadius(50);
//		circle.setFill(Color.VIOLET);
//		root.getChildren().add(circle);
		
//		Image image = new Image("sniper.jpg");
//		ImageView imgView = new ImageView(image);
//		imgView.setX(0);
//		imgView.setY(0);
//		root.getChildren().add(imgView);
		
		
		root.getChildren().add(text);		
		stage.setScene(scene);
		stage.show();
		
	}
}
