package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ColorPickerTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// ChoiceBox
		Label lblInfo = new Label("College Picker Test");
		lblInfo.setFont(Font.font("Arial", FontWeight.BOLD, 25));
		ColorPicker colorPicker = new ColorPicker();
		Button btnSet = new Button("Set");
		
		btnSet.setOnMouseClicked(event->{
			Color color=colorPicker.getValue();
			lblInfo.setTextFill(color);
		});				
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ColorPicker Control");

		// Add Controls
		flowPane.getChildren().addAll(lblInfo, colorPicker, btnSet);		
		primaryStage.show();
	}
}
