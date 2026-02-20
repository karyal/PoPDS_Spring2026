package day20.layout_panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Controls
		
		TextField txt1, txt2, txt3;
		Button btn1, btn2;
		
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
		BorderPane borderPane = new BorderPane();
		Scene scene = new Scene(borderPane, 250, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("BorderPane Layout");
		
		// Add Controls
		borderPane.setTop(txt1);
		borderPane.setLeft(txt2);
		borderPane.setCenter(btn1);
		borderPane.setRight(txt3);
		borderPane.setBottom(btn2);
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
