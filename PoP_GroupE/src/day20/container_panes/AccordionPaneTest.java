package day20.container_panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

public class AccordionPaneTest extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Controls
		
		TitledPane paneOne = new TitledPane();
		paneOne.setText("ID");
		paneOne.setContent(new Label("1")); 
		
		TitledPane paneTwo= new TitledPane();
		paneTwo.setText("NAME");
		paneTwo.setContent(new Label("Raj Rai"));
		
		TitledPane paneThree= new TitledPane();
		paneThree.setText("ADDRESS");
		paneThree.setContent(new Label("Balkhu, Kathmandu"));
				
		Accordion accordionNew = new Accordion();
		accordionNew.getPanes().addAll(paneOne, paneTwo, paneThree);
		
		// Application, Layout, Scene, and Stage		
		Scene scene = new Scene(accordionNew, 350, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("AccordionPane Container");		
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}


}
