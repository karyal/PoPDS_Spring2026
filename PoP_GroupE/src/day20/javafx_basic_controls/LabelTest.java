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

public class LabelTest extends Application {

	public static void main(String[] args) {
		//call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Basic Controls
		
		//a. Label
		Label lbl1 = new Label();
		Label lbl2;
		lbl1.setText("Basic Controls");
		lbl2=new Label("Basic Controls-2");
		//Color - Set Color on Label
		lbl2.setTextFill(Color.RED);
		//Font - Set Font name, style, and size
		lbl2.setFont(Font.font("ARIAL", FontWeight.BOLD, 34));
				
		//Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene=new Scene(flowPane, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Label Control");
		
		//Add Controls
		flowPane.getChildren().addAll(lbl1, lbl2);		
		primaryStage.show();
	}
}