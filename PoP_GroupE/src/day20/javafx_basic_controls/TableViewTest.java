package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TableViewTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		// TableView
		TableView tableView = new TableView();
		tableView.setPrefHeight(250);
		tableView.setPrefWidth(370);
		
		//Table Columns
		TableColumn<Person, Integer> column1 = new TableColumn<>("PID");
		TableColumn<Person, String> column2 = new TableColumn<>("FULLNAME");
		TableColumn<Person, String> column3 = new TableColumn<>("ADDRESS");
				
		 column1.setCellValueFactory(new PropertyValueFactory<>("pid"));
		 column1.setPrefWidth(50); // Set a fixed width of 50 pixels
		 column1.setResizable(false); // Prevent user resizing
		 
		 column2.setCellValueFactory(new PropertyValueFactory<>("fullName"));
		 column2.setPrefWidth(150); // Set a fixed width of 150 pixels
		 column2.setResizable(false); // Prevent user resizing
		 
		 column3.setCellValueFactory(new PropertyValueFactory<>("address"));
		 column3.setPrefWidth(150); // Set a fixed width of 150 pixels
		 column3.setResizable(false); // Prevent user resizing
		 
		 tableView.getColumns().add(column1);
		 tableView.getColumns().add(column2);
		 tableView.getColumns().add(column3);
		 
		 tableView.getItems().add(new Person(1, "Raj Rai", "Kalanki, Kathmandu"));
		 tableView.getItems().add(new Person(2, "Sita Shrestha", "Patan, Lalitpur"));
		 tableView.getItems().add(new Person(3, "Bikash Gurung", "Lakeside, Pokhara"));
		 tableView.getItems().add(new Person(4, "Anita Koirala", "Biratnagar, Morang"));
		 tableView.getItems().add(new Person(5, "Ramesh Thapa", "Butwal, Rupandehi"));
		 tableView.getItems().add(new Person(6, "Pooja Tamang", "Hetauda, Makwanpur"));
		 tableView.getItems().add(new Person(7, "Sunil Bhandari", "Dharan, Sunsari"));
		 tableView.getItems().add(new Person(8, "Nisha Magar", "Bharatpur, Chitwan"));
		 tableView.getItems().add(new Person(9, "Dipesh Adhikari", "Nepalgunj, Banke"));
		 tableView.getItems().add(new Person(10, "Manisha KC", "Janakpur, Dhanusha"));
		 
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TableView Control");
		
		flowPane.getChildren().add(tableView);
		
		// Add Controls		
		primaryStage.show();
	}
}
