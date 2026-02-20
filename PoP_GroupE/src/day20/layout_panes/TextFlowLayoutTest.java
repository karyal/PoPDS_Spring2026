package day20.layout_panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class TextFlowLayoutTest extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Text text1 = new Text("What is Lorem Ipsum?");
		text1.setFont(new Font(15));
		text1.setFill(Color.DARKSLATEBLUE);

		Text text2 = new Text("Lorem Ipsum");
		text2.setFont(new Font(15));
		text2.setFill(Color.DARKGOLDENROD);

		Text text3 = new Text(
				"is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		text3.setFont(new Font(15));
		text3.setFill(Color.DARKGRAY);

		// Application, Layout, Scene, and Stage
		TextFlow textFlowPane = new TextFlow();
		textFlowPane.setTextAlignment(TextAlignment.JUSTIFY);
		textFlowPane.setPrefSize(500, 500); 
		textFlowPane.setLineSpacing(5.0);
		textFlowPane.getChildren().addAll(text1, text2, text3);
		
		Scene scene = new Scene(textFlowPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TextFlow Layout");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
