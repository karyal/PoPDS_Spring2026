package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuBarTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//MenuItem, Menu, MenuBar
		MenuItem menuItem1= new MenuItem("New");		
		MenuItem menuItem2= new MenuItem("Save");
		MenuItem menuItem3= new MenuItem("Save As");
		MenuItem menuItem4= new MenuItem("Close");
		MenuItem menuItem5= new MenuItem("Open");
		MenuItem menuItem6= new MenuItem("Exit");
		MenuItem menuItem7= new MenuItem("Context");
		
		//Menu
		Menu menu1 = new Menu("File");							
		menu1.getItems().add(menuItem1);
		menu1.getItems().add(new SeparatorMenuItem());
		menu1.getItems().addAll(menuItem5, menuItem2, menuItem3, menuItem4, menuItem6);
		MenuBar menuBar1=new MenuBar();
		menuBar1.getMenus().add(menu1);
		
		//ContextMenu
		ToolBar toolbar1=new ToolBar();
		
		ContextMenu contextMenu = new ContextMenu();
		MenuItem mi1=new MenuItem("Option-1");
		MenuItem mi2=new MenuItem("Option-2");
		MenuItem mi3=new MenuItem("Option-3");
		
		contextMenu.getItems().addAll(mi1, mi2, mi3);
		
		Button button1 = new Button("Context Test");
		button1.setContextMenu(contextMenu);
		
		toolbar1.getItems().add(button1);
		
		//Events
		menuItem6.setOnAction(event->{
			//primaryStage.close();
			Platform.exit();
		});
		
		// Application, Layout, Scene, and Stage
		BorderPane borderPane = new BorderPane();
		Scene scene = new Scene(borderPane, 350, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("MenuBar Control");

		// Add Controls
		borderPane.setTop(menuBar1);	
		borderPane.setCenter(toolbar1);
		primaryStage.show();
	}
}
