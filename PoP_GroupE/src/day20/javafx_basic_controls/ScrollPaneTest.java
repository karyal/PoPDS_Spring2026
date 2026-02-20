package day20.javafx_basic_controls;

import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ScrollPaneTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		// ProgressBar
		InputStream input = getClass().getResourceAsStream("/images/image1.jpg");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		//imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);
        
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(imageView);
        scrollPane.setPrefSize(250, 250);
        scrollPane.pannableProperty().set(true);
        scrollPane.fitToWidthProperty().set(true);
        scrollPane.fitToHeightProperty().set(true);
        scrollPane.hbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.vbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.ALWAYS);
        
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ScrollPane Control");
		
		flowPane.getChildren().add(scrollPane);
		
		// Add Controls		
		primaryStage.show();
	}
}
