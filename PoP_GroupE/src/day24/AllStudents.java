package day24;

import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class AllStudents extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Declare Table View
		TableView tableView = new TableView();
		tableView.setPrefHeight(250);
		tableView.setPrefWidth(650);

		// Table Columns
		TableColumn<Student, Integer> column1 = new TableColumn<>("SID");
		TableColumn<Student, String> column2 = new TableColumn<>("NAME");
		TableColumn<Student, Double> column3 = new TableColumn<>("POP");
		TableColumn<Student, Double> column4 = new TableColumn<>("DB");
		TableColumn<Student, Double> column5 = new TableColumn<>("CN");
		TableColumn<Student, Double> column6 = new TableColumn<>("TOTAL");
		TableColumn<Student, Double> column7 = new TableColumn<>("AVERAGE");
		TableColumn<Student, String> column8 = new TableColumn<>("RESULT");

		//Mapping field with column
		column1.setCellValueFactory(new PropertyValueFactory<>("sid"));
		column1.setPrefWidth(50); // Set a fixed width of 50 pixels
		column1.setResizable(false); // Prevent user resizing

		column2.setCellValueFactory(new PropertyValueFactory<>("fullName"));
		column2.setPrefWidth(150); // Set a fixed width of 150 pixels
		column2.setResizable(false); // Prevent user resizing

		column3.setCellValueFactory(new PropertyValueFactory<>("pop"));
		column3.setPrefWidth(50); // Set a fixed width of 150 pixels
		column3.setResizable(false); // Prevent user resizing

		column4.setCellValueFactory(new PropertyValueFactory<>("db"));
		column4.setPrefWidth(50); // Set a fixed width of 150 pixels
		column4.setResizable(false); // Prevent user resizing

		column5.setCellValueFactory(new PropertyValueFactory<>("cn"));
		column5.setPrefWidth(50); // Set a fixed width of 150 pixels
		column5.setResizable(false); // Prevent user resizing

		column6.setCellValueFactory(new PropertyValueFactory<>("total"));
		column6.setPrefWidth(100); // Set a fixed width of 150 pixels
		column6.setResizable(false); // Prevent user resizing

		column7.setCellValueFactory(new PropertyValueFactory<>("average"));
		column7.setPrefWidth(100); // Set a fixed width of 150 pixels
		column7.setResizable(false); // Prevent user resizing

		column8.setCellValueFactory(new PropertyValueFactory<>("result"));
		column8.setPrefWidth(100); // Set a fixed width of 150 pixels
		column8.setResizable(false); // Prevent user resizing

		tableView.getColumns().addAll(column1, column2, column3, column4, column5, column6, column7, column8);

		List<Student> students = new StudentCRUDImplement().all();
		for(Student student: students) {
			new CalculateResultImplement(student).calculateTotal();
			new CalculateResultImplement(student).calculateAverage();
			new CalculateResultImplement(student).calculateResult();
			tableView.getItems().add(student);
		}
		FlowPane pane = new FlowPane();
		Scene scene = new Scene(pane, 750, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("All Students");

		pane.getChildren().add(tableView);
		
		primaryStage.show();
	}

}
