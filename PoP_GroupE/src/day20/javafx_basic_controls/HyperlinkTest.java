package day20.javafx_basic_controls;

import java.awt.Desktop;
import java.net.URI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HyperlinkTest extends Application {

	public static void main(String[] args) {		
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Hyperlink link1 = new Hyperlink("https://google.com");		
		link1.setOnAction(event->{
			try {
				Desktop.getDesktop().browse(new URI("https://google.com"));
			}
			catch (Exception e) {
				System.out.println("Error : "+e.getMessage());
			}
		});
        FlowPane flowPane = new FlowPane();
        Scene scene = new Scene(flowPane, 600, 500);
        stage.setTitle("HyperLink Control");
        stage.setScene(scene);
        
        flowPane.getChildren().add(link1);
        
        stage.show();
	}
}
