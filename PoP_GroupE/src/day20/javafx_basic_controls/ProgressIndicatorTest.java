package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ProgressIndicatorTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}

	static double count=10.00;
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//ProgressBar
		ProgressIndicator progressIndicator = new ProgressIndicator();
		Button btnIncrease = new Button("Increase");
		
		btnIncrease.setOnAction(event->{
			progressIndicator.setProgress(count);
			count+=10;
		});
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 350, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ProgressIndicator Control");

		// Add Controls
		flowPane.getChildren().addAll(progressIndicator, btnIncrease);		
		primaryStage.show();
	}
}
