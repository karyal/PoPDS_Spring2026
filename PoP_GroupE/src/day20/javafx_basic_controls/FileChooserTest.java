package day20.javafx_basic_controls;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileChooserTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//ComboBox
		FileChooser fileChooser = new FileChooser();
		DirectoryChooser directoryChooser = new DirectoryChooser();
		
		//Button
		Button btnOpenFile = new Button("Choose File");
		Button btnOpenDir = new Button("Choose Directory");
		
		btnOpenFile.setOnAction(event->{
			File selectedFile = fileChooser.showOpenDialog(primaryStage);
			System.out.println(selectedFile.getName());
		});
		
		btnOpenDir.setOnAction(event->{
			File selectedFolder= directoryChooser.showDialog(primaryStage);
			System.out.println(selectedFolder.getName());
		});
		
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("File Chooser");

		// Add Controls
		flowPane.getChildren().addAll(btnOpenFile, btnOpenDir);
		
		primaryStage.show();
	}
}
