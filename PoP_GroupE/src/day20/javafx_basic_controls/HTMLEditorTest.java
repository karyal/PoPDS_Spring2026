package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class HTMLEditorTest extends Application {

	public static void main(String[] args) {
		//call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//HTML Editor
		HTMLEditor htmlEditor = new HTMLEditor();
		
		AnchorPane anchorPane = new AnchorPane(htmlEditor);
		anchorPane.setTopAnchor(htmlEditor, 10.0);
		anchorPane.setBottomAnchor(htmlEditor, 10.0);		
		anchorPane.setLeftAnchor(htmlEditor, 10.0);
		anchorPane.setRightAnchor(htmlEditor, 10.0);
		
		//Application, Layout, Scene, and Stage		
		Scene scene=new Scene(anchorPane, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("HTMLEditor Control");
		primaryStage.show();
	}
}