package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DialogTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Dialog Controls
		Button btnClickMe = new Button("Click Me");
		
		btnClickMe.setOnAction(event->{
			Dialog<String> dialog = new Dialog<>();
			dialog.showAndWait();
		});
		
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Dialog Control");

		// Add Controls
		flowPane.getChildren().addAll(btnClickMe);		
		primaryStage.show();
	}
}
