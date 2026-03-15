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

public class DashBoard extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btnNew, btnSearch, btnAll, btnUpdate, btnDelete, btnClose;
		
		btnNew = new Button("NEW");
		btnNew.relocate(150, 20);
		btnNew.setOnAction(event->{
			//display new person entry form
			new NewPerson();
		});
		btnSearch = new Button("SEARCH");
		btnSearch.relocate(150, 60);
		btnAll = new Button("ALL");
		btnAll.relocate(150, 100);
		btnUpdate = new Button("UPDATE");
		btnUpdate.relocate(150, 140);
		btnDelete = new Button("DELETE");
		btnDelete.relocate(150, 180);
		btnClose = new Button("CLOSE");
		btnClose.relocate(150, 220);
		btnClose.setOnAction(event -> {
			primaryStage.close();// Close the stage
		});
		
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 700, 350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("All Persons");
		pane.getChildren().addAll(btnNew, btnSearch, btnAll, btnUpdate, btnDelete, btnClose);
		primaryStage.show();
	}

}
