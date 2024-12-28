package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Main.fxml"));
			Parent root = loader.load();
			
			MainController controller = loader.getController();
			Scene scene = new Scene(root);
			
			scene.setOnKeyPressed(event -> {
					
					switch(event.getCode()) {
					case W:
						controller.moveUp();
						break;
						
					case S:
						controller.moveDown();
						break;
						
					case A:
						controller.moveLeft();
						break;
						
					case D:
						controller.moveRight();
						break;
						
						default:
							break;
					}
					
				}
				
			);
			
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
