package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DatePickerTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//ComboBox
		DatePicker datePicker = new DatePicker();		
		
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("DatePicker Control");

		// Add Controls
		flowPane.getChildren().addAll(datePicker);		
		primaryStage.show();
	}
}
