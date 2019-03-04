package src.program.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import program.view.AccueilView;
import program.view.RecipeView;

import java.io.IOException;
public class profileconnexioncontroleur extends program.controller.Controller  {

    @FXML
    private BorderPane borderPane;
    /**
     * backz button
     */
    @FXML
    private Button backz;

    public void init() {
        backz.setOnAction( event -> {
            try {

                redirectionToRecipe(RecipeView.XML_FILE,borderPane);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });
    }
}



