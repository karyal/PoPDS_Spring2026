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

public class PasswordFieldTest extends Application {

	public static void main(String[] args) {
		//call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {		
		//Password Box
		//Class - PasswordField
		PasswordField txt2=new PasswordField();
		
		//Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene=new Scene(flowPane, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("PasswordField Control");
		
		//Add Controls
		flowPane.getChildren().add(txt2);
		
		primaryStage.show();
	}
}