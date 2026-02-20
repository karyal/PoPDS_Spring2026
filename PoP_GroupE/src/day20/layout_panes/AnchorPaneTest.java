package day20.layout_panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneTest extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Controls		
		TextField txtID =new TextField();
		
		AnchorPane anchorPane=new AnchorPane(txtID);		
		anchorPane.setTopAnchor(txtID, 10.0);
		anchorPane.setBottomAnchor(txtID, 10.0);		
		anchorPane.setLeftAnchor(txtID, 10.0);
		anchorPane.setRightAnchor(txtID, 10.0);
		
		Scene scene = new Scene(anchorPane, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("AnchorPane Layout");		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}