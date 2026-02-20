package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//ComboBox
		ListView listView = new ListView();		
		listView.getItems().add("Item-1");
		listView.getItems().add("Item-2");
		listView.getItems().add("Item-3");
		listView.getItems().add("Item-4");
		listView.getItems().add("Item-5");
		listView.setPrefHeight(50);
		
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 350, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ListView Control");

		// Add Controls
		flowPane.getChildren().addAll(listView);		
		primaryStage.show();
	}
}
