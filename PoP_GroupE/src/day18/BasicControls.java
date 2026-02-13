package day18;

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

public class BasicControls extends Application {

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
		
		//b. Text Box - Single Line Text Box
		//Class - TextField 
		TextField txt1 = new TextField();
		//width, height, font, color
		txt1.setPrefWidth(150);
		txt1.setPrefHeight(50);
		txt1.setFont(Font.font("ARIAL", FontWeight.BOLD, 34));
		txt1.setStyle("-fx-text-fill:RED;");
		
		//c. Password Box
		//Class - PasswordField
		PasswordField txt2=new PasswordField();
		
		//d. Text Area - Comment Box
		//TextArea - Class
		TextArea txt3=new TextArea();
		//width, and height
		
		//e. Radio Button
		//Class-RadioButton
		RadioButton rb1=new RadioButton("Yes");
		RadioButton rb2=new RadioButton("No");
		rb2.setSelected(true);//set default
		ToggleGroup tg1=new ToggleGroup();
		rb1.setToggleGroup(tg1);
		rb2.setToggleGroup(tg1);
		
		//f. Check Box
		//Class - CheckBox
		CheckBox chk1=new CheckBox("Reading");
		chk1.setSelected(true);
		CheckBox chk2=new CheckBox("Playing");
		CheckBox chk3=new CheckBox("Talking");
		CheckBox chk4=new CheckBox("Other");
		
		//g. Combo Box
		//Class - ComboBox
		ComboBox cmb1= new ComboBox();
		//1-14, 15-29, 30-45, 45-59, 60+ //Age Group
		cmb1.getItems().addAll("1-14", "15-29", "30-45", "45-59", "60+");
		cmb1.setValue("15-29");
		
		//h. Push-up Button
		//Class - Button
		Button btnClose =new Button("Close");
		//Close the Stage when button clicked
		btnClose.setOnAction(event->{ //button click event
			primaryStage.close(); //Close the primary stage
		});
		
		//Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene=new Scene(flowPane, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Basic Controls");
		//Add Controls
		//flowPane.getChildren().add(lbl1);
		//flowPane.getChildren().add(lbl2);
		//flowPane.getChildren().add(txt1);
		//flowPane.getChildren().add(txt2);
		//flowPane.getChildren().add(txt3);
		//flowPane.getChildren().add(rb1);
		//flowPane.getChildren().add(rb2);
		//flowPane.getChildren().add(chk1);
		//flowPane.getChildren().add(chk2);
		//flowPane.getChildren().add(chk3);
		//flowPane.getChildren().add(chk4);
		//flowPane.getChildren().add(cmb1);
		flowPane.getChildren().add(btnClose);
		primaryStage.show();
	}
}








