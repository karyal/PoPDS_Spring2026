package day20.layout_panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Controls
		Label lbl1, lbl2, lbl3;		
		TextField txt1, txt2, txt3;
		Button btn1, btn2;
		
		lbl1=new Label("First Number : ");
		lbl2=new Label("Second Number : ");
		lbl3=new Label("Result : ");
		
		txt1=new TextField();
		txt2=new TextField();
		txt3=new TextField();
		
		btn1=new Button("+");
		btn1.setOnAction(event->{
			int num1= Integer.parseInt(txt1.getText());
			int num2= Integer.parseInt(txt2.getText());
			int num3= num1+num2;
			txt3.setText(Integer.toString(num3));
			
		});
		btn2=new Button("Close");
		btn2.setOnAction(event->{
			primaryStage.close();
		});
		
		// Application, Layout, Scene, and Stage
		GridPane gridPane= new GridPane();
		Scene scene = new Scene(gridPane, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Grid Layout");
		
		// Add Controls
		gridPane.add(lbl1, 0,0);
		gridPane.add(txt1, 1,0);
		
		gridPane.add(lbl2, 0,1);
		gridPane.add(txt2, 1,1);
		
		gridPane.add(btn1, 0,2);
		gridPane.add(new Label(), 1,2);
				
		gridPane.add(lbl3, 0,3);
		gridPane.add(txt3, 1,3);
				
		gridPane.add(btn2, 0,4);
		gridPane.add(new Label(), 1,4);
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
