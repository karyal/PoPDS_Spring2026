package day17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
	
	public static void main(String[] args) {
		launch(args); //call start method indirectly
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//primaryStage.setHeight(250);
		//primaryStage.setWidth(450);
		primaryStage.setTitle("My First Window");
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 250, 450);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
