package day18;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BasicControls extends Application {

	public static void main(String[] args) {
		//call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Basic Controls
		
		//a. Label
		Label lbl1 = new Label();
		Label lbl2;
		lbl1.setText("Basic Controls");
		lbl2=new Label("Basic Controls-2");
		
		
		//Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene=new Scene(flowPane, 175, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Basic Controls");
		//Add Controls
		//flowPane.getChildren().add(lbl1);
		flowPane.getChildren().add(lbl2);
		
		
		primaryStage.show();
	}
}








