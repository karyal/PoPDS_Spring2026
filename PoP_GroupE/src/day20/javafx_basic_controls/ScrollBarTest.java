package day20.javafx_basic_controls;

import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ScrollBarTest extends Application {

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
        Pane paneImage=new Pane();
        paneImage.getChildren().add(imageView);
        
        ScrollBar sbHorizontal = new ScrollBar();
        ScrollBar sbVertical = new ScrollBar();
        sbVertical.setOrientation(Orientation.VERTICAL);
        
        sbHorizontal.valueProperty().addListener(ov -> 
        	imageView.setX(sbHorizontal.getValue() * paneImage.getWidth() /sbHorizontal.getMax())
        );
        
        sbVertical.valueProperty().addListener(ov -> 
        	imageView.setY(sbVertical.getValue() * paneImage.getHeight() /sbVertical.getMax())
        );
        
		// Application, Layout, Scene, and Stage
        BorderPane borderPane = new BorderPane();
		Scene scene = new Scene(borderPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ScrollBar Control");
		
		borderPane.setCenter(paneImage);
		borderPane.setRight(sbHorizontal);
		borderPane.setBottom(sbVertical);
		primaryStage.show();
	}
}
