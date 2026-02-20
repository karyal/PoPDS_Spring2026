package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ToolBarTest extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		//Button
		Button button1 = new Button("Button-1");
		Button button2 = new Button("Button-2");
		Button button3 = new Button("Button-3");
		
		//ToolTip
		Tooltip tooltip1 = new Tooltip("Creates a new file");
		button1.setTooltip(tooltip1);
		
		// ToolBar
		ToolBar toolBar = new ToolBar();						
		toolBar.getItems().add(button1);
		toolBar.getItems().add(new Separator());
		toolBar.getItems().add(button2);
		toolBar.getItems().add(new Separator());
		toolBar.getItems().add(button3);
		
		// Application, Layout, Scene, and Stage
		BorderPane borderPane = new BorderPane();
		Scene scene = new Scene(borderPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ToolBar Control");
		
		borderPane.setTop(toolBar);
		
		// Add Controls		
		primaryStage.show();
	}
}
