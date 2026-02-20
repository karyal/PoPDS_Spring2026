package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RadioButtonTest extends Application {

	public static void main(String[] args) {
		//call start method
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {		
		//Radio Button
		//Class-RadioButton
		RadioButton rb1=new RadioButton("Yes");
		RadioButton rb2=new RadioButton("No");
		rb2.setSelected(true);//set default
		ToggleGroup tg1=new ToggleGroup();
		rb1.setToggleGroup(tg1);
		rb2.setToggleGroup(tg1);
				
		//Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene=new Scene(flowPane, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("RadioButton Control");
		//Add Controls
		
		flowPane.getChildren().add(rb1);
		flowPane.getChildren().add(rb2);
		
		primaryStage.show();
	}
}