package day20.layout_panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BorderLayout2 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Controls			
		Button btn1, btn2;
		btn1=new Button("Button1");
		Pane pane1=new Pane();
		btn1.relocate(20, 10);
		pane1.getChildren().add(btn1);
		
		// Application, Layout, Scene, and Stage
		BorderPane borderPane = new BorderPane();
		Scene scene = new Scene(borderPane, 250, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("BorderPane Pane");
		
		// Add Controls
		borderPane.setTop(pane1);
		//borderPane.setLeft(txt2);
		//borderPane.setCenter(btn1);
		//borderPane.setRight(txt3);
		//borderPane.setBottom(btn2);
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
