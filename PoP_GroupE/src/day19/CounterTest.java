package day19;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CounterTest extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Controls
		Label lblValue=new Label("0");
		Button btnClickMe=new Button("Click Me!");
		
		//Identify the Click event on Button
		btnClickMe.setOnAction(event->{
			//String to Integer
			int tmpNumber = Integer.parseInt(lblValue.getText());
			tmpNumber++; //Increase the value
			//Integer to String
			lblValue.setText(Integer.toString(tmpNumber));
		});
		
		//Application
		/*
		FlowPane flowPane=new FlowPane();
		Scene scene=new Scene(flowPane, 250, 150);
		primaryStage.setScene(scene);
		
		flowPane.getChildren().add(lblValue);
		flowPane.getChildren().add(btnClickMe);
		*/
		
		//Null Layout
		Pane pane=new Pane();
		Scene scene=new Scene(pane, 250, 150);
		primaryStage.setScene(scene);
		
		lblValue.relocate(125, 50);//position
		btnClickMe.relocate(100, 100);
		pane.getChildren().add(lblValue);//add
		pane.getChildren().add(btnClickMe);//add
		
		primaryStage.show();
	}
}







