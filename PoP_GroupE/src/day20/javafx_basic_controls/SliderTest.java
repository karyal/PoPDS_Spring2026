package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class SliderTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		// Slider
		Slider slider = new Slider(0, 500, 0);
		
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Slider Control");
		
		flowPane.getChildren().add(slider);
		
		// Add Controls		
		primaryStage.show();
	}
}
