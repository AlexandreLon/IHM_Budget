package program.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import program.model.HistoryModel;
import program.view.View;

import java.io.IOException;

public class RecipeController extends Controller{

    private final HistoryModel history;
    @FXML
    private Button valid;

    @FXML
    private Button back;

    @FXML
    private BorderPane borderPaneRecipe;

    @FXML
    private TextField spent_price;

    @FXML
    private TextField spent_description;

    RecipeController(HistoryModel history)
    {
        this.history = history;
    }

    public void init(){

        valid.setOnAction(event -> {
            try {
                history.createAndAddSpent(Integer.valueOf(spent_price.getText()), spent_description.getText());
                System.out.println(history);
                System.out.println(history.toObjectString());
                redirectionToHome(borderPaneRecipe);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!!!!").show();
            }
        });

        back.setOnAction(event -> {
            try {
                redirectionToHome(borderPaneRecipe);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!!").show();
            }
        });

    }
}
