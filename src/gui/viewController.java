package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class viewController {

	@FXML
	private TextField txtNumber1;
	
	@FXML
	private TextField txtNumber2;
	
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btCalcular;
	
	@FXML
	public void onBCalcularAction() {
		try {
		Locale.setDefault(Locale.US);
		double number1 = Double.parseDouble(txtNumber1.getText());
		double number2 = Double.parseDouble(txtNumber2.getText());
		
		double soma = number1 + number2;
		labelResult.setText(String.format("%.2f", soma));
		
	}
		catch(NumberFormatException e) {
			Alerts.showAlert("Erro", null, e.getMessage(), AlertType.ERROR);
		}
	}
	
}
