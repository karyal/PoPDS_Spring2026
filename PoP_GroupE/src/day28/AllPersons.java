package day28;

import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AllPersons extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TableView tableView;
		Label lblTitle;
		Button btnRefresh, btnClose;

		lblTitle = new Label("ALL PERSONS");
		lblTitle.relocate(100, 20);
		// Change FontSize

		tableView = new TableView();
		tableView.setPrefHeight(200);
		tableView.setPrefWidth(650);
		tableView.relocate(20, 60);

		// Table Columns
		TableColumn<Person, Integer> column1 = new TableColumn<>("PID");
		TableColumn<Person, String> column2 = new TableColumn<>("NAME");
		TableColumn<Person, String> column3 = new TableColumn<>("ADDRESS");
		TableColumn<Person, String> column4 = new TableColumn<>("EMAIL");
		TableColumn<Person, String> column5 = new TableColumn<>("PHONE");
		TableColumn<Person, String> column6 = new TableColumn<>("GENDER");
		TableColumn<Person, String> column7 = new TableColumn<>("DOB");
		TableColumn<Person, String> column8 = new TableColumn<>("QUALIFICATION");

		//Mapping field with column
		column1.setCellValueFactory(new PropertyValueFactory<>("pid"));
		column1.setPrefWidth(50); // Set a fixed width of 50 pixels
		column1.setResizable(false); // Prevent user resizing

		column2.setCellValueFactory(new PropertyValueFactory<>("fullName"));
		column2.setPrefWidth(150); // Set a fixed width of 150 pixels
		column2.setResizable(false); // Prevent user resizing

		column3.setCellValueFactory(new PropertyValueFactory<>("address"));
		column3.setPrefWidth(50); // Set a fixed width of 150 pixels
		column3.setResizable(false); // Prevent user resizing

		column4.setCellValueFactory(new PropertyValueFactory<>("email"));
		column4.setPrefWidth(50); // Set a fixed width of 150 pixels
		column4.setResizable(false); // Prevent user resizing

		column5.setCellValueFactory(new PropertyValueFactory<>("phone"));
		column5.setPrefWidth(50); // Set a fixed width of 150 pixels
		column5.setResizable(false); // Prevent user resizing

		column6.setCellValueFactory(new PropertyValueFactory<>("gender"));
		column6.setPrefWidth(100); // Set a fixed width of 150 pixels
		column6.setResizable(false); // Prevent user resizing

		column7.setCellValueFactory(new PropertyValueFactory<>("dob"));
		column7.setPrefWidth(100); // Set a fixed width of 150 pixels
		column7.setResizable(false); // Prevent user resizing

		column8.setCellValueFactory(new PropertyValueFactory<>("qualification"));
		column8.setPrefWidth(100); // Set a fixed width of 150 pixels
		column8.setResizable(false); // Prevent user resizing
		
		tableView.getColumns().addAll(column1, column2, column3, column4, column5, column6, column7, column8);
		
		//Person person = new PersonDatabase().search(2);
		List<Person> persons = new PersonDatabase().all();
		
		for(Person person: persons) {
			tableView.getItems().add(person);
		}
		
		// Person person=new PersonDatabase().all();
		btnClose = new Button("CLOSE");
		btnClose.relocate(150, 290);
		btnClose.setOnAction(event -> {
			primaryStage.close();// Close the stage
		});

		btnRefresh = new Button("REFRESH");
		btnRefresh.relocate(20, 290);

		Pane pane = new Pane();
		Scene scene = new Scene(pane, 700, 350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("All Persons");
		pane.getChildren().add(lblTitle);
		pane.getChildren().add(tableView);
		pane.getChildren().addAll(btnRefresh, btnClose);
		primaryStage.show();
	}

}
