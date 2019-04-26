package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main2 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			VBox root = new VBox();
			root.setPrefSize(500, 200);
			root.setAlignment(Pos.CENTER);
			root.setSpacing(40);

			Label label = new Label("Two Methodology");
			label.setFont(new Font("Consolas", 40));

			Button btn = new Button("종료");
			btn.setPrefWidth(80);
			btn.setOnAction(event -> Platform.exit());

			root.getChildren().add(label);
			root.getChildren().add(btn);

			Scene scene = new Scene(root);
			primaryStage.setTitle("Two Methodology");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
