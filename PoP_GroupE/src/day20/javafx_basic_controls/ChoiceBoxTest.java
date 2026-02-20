package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ChoiceBoxTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// ChoiceBox
		ChoiceBox cb = new ChoiceBox();
		cb.getItems().addAll("item1", "item2", "item3");
		
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ChoiceBox Control");

		// Add Controls
		flowPane.getChildren().add(cb);
		primaryStage.show();
	}
}
