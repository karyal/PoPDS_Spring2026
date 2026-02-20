package day20.layout_panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class NullLayout extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label lblHello = new Label("Hello JavaFX Label");
		lblHello.relocate(50, 50);
		
		Pane pane=new Pane();
		pane.setPrefSize(350, 250);
		Scene scene=new Scene(pane);
		primaryStage.setScene(scene);
		
		pane.getChildren().add(lblHello);
		primaryStage.show();
	}
}