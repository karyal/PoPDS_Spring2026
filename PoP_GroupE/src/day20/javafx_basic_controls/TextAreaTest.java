package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class TextAreaTest extends Application {

	public static void main(String[] args) {
		//call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Basic Controls
		//Text Area - Comment Box
		//TextArea - Class
		TextArea txt3=new TextArea();
		//width, and height
			
		//Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene=new Scene(flowPane, 500, 350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TextArea Control");
		
		//Add Controls		
		flowPane.getChildren().add(txt3);
		
		primaryStage.show();
	}
}








