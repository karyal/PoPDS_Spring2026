package day20.container_panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SplitPaneTest extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane leftPane = new StackPane();
		leftPane.getChildren().add(new Button("Button One (Left)"));
		
		StackPane rightPane = new StackPane();
		leftPane.getChildren().add(new Button("Button Two (Right)"));
		
		SplitPane splitPane = new SplitPane();
		
		splitPane.setPrefSize(550, 350);
		Scene scene=new Scene(splitPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("SplitPane Layout");
		
		splitPane.getItems().addAll(leftPane, rightPane);
		primaryStage.show();
	}
}