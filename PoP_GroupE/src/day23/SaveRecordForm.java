package day23;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SaveRecordForm extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Declare
		Label lbl1, lbl2, lbl3,lbl4, lbl5, lbl6, lbl7, lbl8;
		TextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8;
		Button btn1, btn2, btn3;
		
		//Initialize
		lbl1=new Label("SID : ");
		lbl1.relocate(20, 20); //set location
		lbl2=new Label("NAME : ");
		lbl2.relocate(20, 60); 
		lbl3=new Label("POP : ");
		lbl3.relocate(20, 100); 
		lbl4=new Label("CN : ");
		lbl4.relocate(20, 140); 
		lbl5=new Label("DB : ");
		lbl5.relocate(20, 180); 
		
		lbl6=new Label("TOTAL : ");
		lbl6.relocate(20, 220); 
		lbl7=new Label("AVERAGE : ");
		lbl7.relocate(20, 260); 
		lbl8=new Label("RESULT : ");
		lbl8.relocate(20, 300); 
		
		txt1= new TextField();
		txt1.relocate(100, 20);
		
		txt2= new TextField();
		txt2.relocate(100, 60);
		
		txt3= new TextField();
		txt3.relocate(100, 100);
		txt4= new TextField();
		txt4.relocate(100, 140);
		txt5= new TextField();
		txt5.relocate(100, 180);
		txt6= new TextField();
		
		txt6.relocate(100, 220);//Calculate
		txt7= new TextField();
		txt7.relocate(100, 260);
		txt8= new TextField();
		txt8.relocate(100, 300);
		
		btn1=new Button("Calculate");
		btn1.relocate(20, 340);
		btn1.setOnAction(event->{
			//Calculate
			//Set value on Student
			Student student=new Student();
			student.setSid(Integer.parseInt(txt1.getText()));//txt1
			student.setFullName(txt2.getText());//txt2
			student.setPop(Double.parseDouble(txt3.getText()));//txt3
			student.setCn(Double.parseDouble(txt4.getText())); //txt4
			student.setDb(Double.parseDouble(txt5.getText())); //txt5
			//Send to Calculate
			CalculateResultImplement cri = new CalculateResultImplement(student);
			cri.calculateTotal();
			cri.calculateAverage();
			cri.calculateResult();
			//Display Result
			txt6.setText(Double.toString(student.getTotal()));
			txt7.setText(Double.toString(student.getAverage()));
			txt8.setText(student.getResult());
		});
		
		btn2=new Button("Save");
		btn2.relocate(120, 340);
		btn2.setOnAction(event->{
			//Save
			Student student=new Student();
			student.setSid(Integer.parseInt(txt1.getText()));
			student.setFullName(txt2.getText());
			student.setPop(Double.parseDouble(txt3.getText()));
			student.setCn(Double.parseDouble(txt4.getText()));
			student.setDb(Double.parseDouble(txt5.getText()));
			student.setTotal(Double.parseDouble(txt6.getText()));
			student.setAverage(Double.parseDouble(txt7.getText()));
			student.setResult(txt8.getText());
			new StudentCRUDImplement().save(student);
		});
		
		
		btn3=new Button("Close");
		btn3.relocate(220, 340);
		
		Pane pane=new Pane();
		Scene scene=new Scene(pane, 350, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Save Record Form");
		
		pane.getChildren().addAll(lbl1, txt1);
		pane.getChildren().addAll(lbl2, txt2);
		pane.getChildren().addAll(lbl3, txt3);
		pane.getChildren().addAll(lbl4, txt4);
		pane.getChildren().addAll(lbl5, txt5);
		pane.getChildren().addAll(lbl6, txt6);
		pane.getChildren().addAll(lbl7, txt7);
		pane.getChildren().addAll(lbl8, txt8);
		pane.getChildren().addAll(btn1, btn2, btn3);
		primaryStage.show();
		
	}

}
