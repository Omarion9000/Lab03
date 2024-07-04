package org.example.lab03;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField contactNumberField;

    @FXML
    private TextField postalCodeField;

    @FXML
    private Label resultLabel;

    @FXML
    protected void validateInput() {
        String username = usernameField.getText();
        String contactNumber = contactNumberField.getText();
        String postalCode = postalCodeField.getText();

        if (!isValidUsername(username)) {
            resultLabel.setText("Invalid username. The first character must be an uppercase letter.");
            return;
        }

        if (!isValidContactNumber(contactNumber)) {
            resultLabel.setText("Invalid contact number. It must be exactly 10 digits long.");
            return;
        }

        if (!isValidPostalCode(postalCode)) {
            resultLabel.setText("Invalid postal code format.");
            return;
        }

        resultLabel.setText("All inputs are valid.");
    }

    private boolean isValidUsername(String username) {
        return username.matches("^[A-Z][a-zA-Z]*$");
    }

    private boolean isValidContactNumber(String contactNumber) {
        return contactNumber.matches("^\\d{10}$") || contactNumber.matches("^\\d{3} \\d{3} \\d{4}$") || contactNumber.matches("^\\(\\d{3}\\) \\d{3} \\d{4}$");
    }

    private boolean isValidPostalCode(String postalCode) {
        return postalCode.matches("^[A-Za-z]\\d[A-Za-z][ -]?\\d[A-Za-z]\\d$");
    }
}
