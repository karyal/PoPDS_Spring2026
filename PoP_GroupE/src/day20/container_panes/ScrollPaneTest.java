package day20.container_panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ScrollPaneTest extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextArea txtComments = new TextArea();
		txtComments.setPrefSize(450, 250);
		txtComments.setWrapText(true);
		
		ScrollPane scrollPane = new ScrollPane(txtComments);
		scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        
		FlowPane flowPane=new FlowPane();
		flowPane.setPrefSize(550, 350);
		Scene scene=new Scene(flowPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Scroll Pane");
		
		flowPane.getChildren().add(scrollPane);
		primaryStage.show();
	}
}