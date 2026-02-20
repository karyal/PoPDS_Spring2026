package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ProgressBarTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//ProgressBar
		ProgressBar progressBar = new ProgressBar(0);
		progressBar.setProgress(0.5);
		
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 350, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ProgressBar Control");

		// Add Controls
		flowPane.getChildren().addAll(progressBar);		
		primaryStage.show();
	}
}
