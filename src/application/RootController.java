package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable {

	@FXML
	private Button exitButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		exitButton.setOnAction(event -> exitButtonAction(event));
	}

	public void exitButtonAction(ActionEvent event) {
		Platform.exit();
	}

}
