package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ComboBoxTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//ComboBox
		ComboBox comboBox = new ComboBox();
		comboBox.getItems().add("Choice 1");
		comboBox.getItems().add("Choice 2");
		comboBox.getItems().add("Choice 3");
		
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ComboBox Control");

		// Add Controls
		flowPane.getChildren().addAll(comboBox);		
		primaryStage.show();
	}
}
