package program.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import program.view.View;

import java.io.IOException;

public class RecipeController extends Controller{

    @FXML
    private Button valid;

    @FXML
    private Button back;

    @FXML
    private BorderPane borderPane;

    public void init(){

        valid.setOnAction(event -> {
            try {
                redirectionToHome(borderPane);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!!!!").show();
            }
        });

        back.setOnAction(event -> {
            try {
                redirectionToHome(borderPane);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!!").show();
            }
        });

    }
}
