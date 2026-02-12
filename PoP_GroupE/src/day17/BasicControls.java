package day17;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BasicControls extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Basic Controls");
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 550, 150);
		primaryStage.setScene(scene);
		
		Label lblHello = new Label("Hello, JavaFX!");
		TextField txt1 = new TextField();
		Button btnClose = new Button("Click Me");
		
		//How to close application when button clicked?
		btnClose.setOnAction(event->{
			primaryStage.close();
		});
		
		flowPane.getChildren().add(lblHello);
		flowPane.getChildren().add(txt1);
		flowPane.getChildren().add(btnClose);
		primaryStage.show();
		
	}

}
