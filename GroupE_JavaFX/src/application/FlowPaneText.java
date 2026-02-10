package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneText extends Application {

	public static void main(String[] args) {
		launch(args);		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label lblHello = new Label("Hello from PCPS");		
		TextField txtId=new TextField();
		txtId.setMaxWidth(150);		
		FlowPane flowPane = new FlowPane();
		flowPane.getChildren().add(lblHello);
		flowPane.getChildren().add(txtId);
		Scene Scene=new Scene(flowPane, 250, 250);
		primaryStage.setScene(Scene);
		primaryStage.show();		
	}
}