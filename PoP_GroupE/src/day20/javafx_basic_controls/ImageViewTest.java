package day20.javafx_basic_controls;

import java.io.FileInputStream;
import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ImageViewTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//ComboBox
		//FileInputStream input = new FileInputStream("/images/image1.jpg");	
		//Image image = new Image(input);
		
		InputStream input = getClass().getResourceAsStream("/images/image1.jpg");
		Image image = new Image(input);		
		ImageView imageView = new ImageView(image);
		
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ImageView Control");

		// Add Controls
		flowPane.getChildren().addAll(imageView);		
		primaryStage.show();
	}
}
