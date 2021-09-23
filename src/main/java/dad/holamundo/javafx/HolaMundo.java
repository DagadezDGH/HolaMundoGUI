package dad.holamundo.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HolaMundo extends Application  {

	public  void start( Stage primaryStage )throws Exception  {
	
		Label saludoLabel = new Label();
		saludoLabel.setText("Aqui saldra el saludo");
		saludoLabel.setLayoutX(20);
		saludoLabel.setLayoutY(20);
		
		Button saludoButton = new Button();
		saludoButton.setText("Saludar");
		saludoButton.setLayoutX(20);
		saludoButton.setLayoutY(80);
		saludoButton.setTooltip(new Tooltip("Cuando me pulses te saludo"));
		saludoButton.setOnAction(e -> saludoLabel.setText("Hola Mundo"));
		
		Pane rootPane = new Pane();
		rootPane.getChildren().addAll(saludoButton, saludoLabel);
		
		Scene scene = new Scene(rootPane, 320 , 200);
		
		primaryStage.setTitle("Hola Mundo con JavaFX");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
		
	}
	

}
