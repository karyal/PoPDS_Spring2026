package day28;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SearchPerson extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label lblTitle, lblPid, lblName, lblAddress, lblEmail, lblPhone, lblGender, lblDob, lblQuf;
		TextField txtPid, txtName, txtAddress, txtEmail, txtPhone;
		RadioButton rbMale, rbFemale;
		DatePicker dobPicker;
		ComboBox cmbQuf;
		Button btnSearch, btnClose;
		
		lblTitle=new Label("PERSON ENTRY FORM");
		lblTitle.relocate(100, 20);
		//Change FontSize
		
		lblPid=new Label("PID");
		lblPid.relocate(50, 70);
		
		txtPid = new TextField();
		txtPid.relocate(150, 70);
		
		lblName = new Label("NAME");
		lblName.relocate(50, 110);
		
		txtName= new TextField();
		txtName.relocate(150, 110);
		
		lblAddress = new Label("ADDRESS");
		lblAddress.relocate(50, 150);
		
		txtAddress= new TextField();
		txtAddress.relocate(150, 150);
		
		lblEmail = new Label("EMAIL");
		lblEmail.relocate(50, 190);
		
		txtEmail= new TextField();
		txtEmail.relocate(150, 190);
		
		lblPhone = new Label("PHONE");
		lblPhone.relocate(50, 230);
		
		txtPhone= new TextField();
		txtPhone.relocate(150, 230);
		
		lblGender = new Label("GENDER");
		lblGender.relocate(50, 270);
		
		rbMale=new RadioButton("Male");
		rbMale.relocate(150, 270);
		
		rbFemale=new RadioButton("Female");
		rbFemale.relocate(250, 270);
		rbFemale.setSelected(true);
		
		ToggleGroup tg=new ToggleGroup();
		rbMale.setToggleGroup(tg);
		rbFemale.setToggleGroup(tg);
		
		lblDob = new Label("Date of Birth");
		lblDob.relocate(50, 310);
		
		dobPicker=new DatePicker();
		dobPicker.relocate(150, 310);
		

		lblQuf = new Label("Qualification");
		lblQuf.relocate(50, 350);
		
		cmbQuf=new ComboBox();
		cmbQuf.relocate(150, 350);
		cmbQuf.getItems().add("SEE");
		
		btnSearch=new Button("SEARCH");
		btnSearch.relocate(320, 70);
		btnSearch.setOnAction(event->{
			int pid= Integer.parseInt(txtPid.getText()); // value is 1
			Person person=new PersonDatabase().search(pid); //send 1
			txtName.setText(person.getFullName()); //Display name
			
		});
		
		btnClose=new Button("CLOSE");
		btnClose.relocate(150, 390);
		btnClose.setOnAction(event->{
			primaryStage.close();//Close the stage
		});
	
		Pane pane =new Pane();
		Scene scene = new Scene(pane, 450, 450);
		primaryStage.setScene(scene);
		primaryStage.setTitle("New Person Entry Form");
		pane.getChildren().add(lblTitle);
		pane.getChildren().addAll(lblPid, txtPid);
		pane.getChildren().addAll(lblName, txtName);
		pane.getChildren().addAll(lblAddress, txtAddress);
		pane.getChildren().addAll(lblEmail, txtEmail);
		pane.getChildren().addAll(lblPhone, txtPhone);
		pane.getChildren().addAll(lblGender, rbMale, rbFemale);
		pane.getChildren().addAll(lblDob, dobPicker);
		pane.getChildren().addAll(lblQuf, cmbQuf);
		pane.getChildren().addAll(btnSearch, btnClose);
		primaryStage.show();
	}

}
