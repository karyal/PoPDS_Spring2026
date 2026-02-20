package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebViewTest extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		//WebView
		WebView webView = new WebView();		
		
		webView.getEngine().load("http://google.com");		

		// Application, Layout, Scene, and Stage
		AnchorPane anchorPane=new AnchorPane(webView);		
		anchorPane.setTopAnchor(webView, 10.0);
		anchorPane.setBottomAnchor(webView, 10.0);		
		anchorPane.setLeftAnchor(webView, 10.0);
		anchorPane.setRightAnchor(webView, 10.0);
		
		Scene scene = new Scene(anchorPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("WebView Control");
		primaryStage.setMaximized(true);
		primaryStage.show();
	}
}
