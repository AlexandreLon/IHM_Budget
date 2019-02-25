package program.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import program.view.AccueilView;
import program.view.RecipeView;

import java.io.IOException;

/**
 * controler for Accueil page.
 *
 * @author G5
 * @version 2019.02.24
 */
public class AccueilControler extends Controller {

    @FXML
    private MenuItem recipe;

    @FXML
    private BorderPane borderPane;

    public void init() {
        recipe.setOnAction( event -> {
            try {

                redirectionToRecipe(RecipeView.XML_FILE,borderPane);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });
    }
}
