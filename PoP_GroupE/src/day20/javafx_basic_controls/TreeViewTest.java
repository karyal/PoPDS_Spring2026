package day20.javafx_basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TreeViewTest extends Application {

	public static void main(String[] args) {
		// call start method
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		//TreeView
		TreeView treeView = new TreeView();
		
		TreeItem rootItem = new TreeItem("Courses");
		
		TreeItem rootBScSE= new TreeItem("BSc SE");
		TreeItem rootBScBM= new TreeItem("BSc BM");
		
		rootItem.getChildren().add(rootBScSE);
		rootItem.getChildren().add(rootBScBM);
		
		rootBScSE.getChildren().add(new TreeItem("FSE"));
		rootBScSE.getChildren().add(new TreeItem("MCCT"));
		rootBScSE.getChildren().add(new TreeItem("DCN"));
		rootBScSE.getChildren().add(new TreeItem("PoP"));		
		
		rootBScBM.getChildren().add(new TreeItem("Sub-1"));
		rootBScBM.getChildren().add(new TreeItem("Sub-2"));
		rootBScBM.getChildren().add(new TreeItem("Sub-3"));
		rootBScBM.getChildren().add(new TreeItem("sub-4"));
		
		treeView.setRoot(rootItem);
		treeView.setShowRoot(false);
		
		// Application, Layout, Scene, and Stage
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TreeView Control");
		
		flowPane.getChildren().add(treeView);
		
		// Add Controls		
		primaryStage.show();
	}
}
