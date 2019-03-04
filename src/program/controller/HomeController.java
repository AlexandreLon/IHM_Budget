package program.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.BorderPane;
import program.view.BudgetView;

import java.io.IOException;

/**
 * controler for Accueil page.
 *
 * @author G5
 * @version 2019.02.24
 */
public class HomeController extends Controller {

    @FXML
    private Hyperlink budget;

    @FXML
    private BorderPane borderPane;

    public void init() {
        budget.setOnAction( event -> {
            try {

                redirectionToBudget(BudgetView.XML_FILE,borderPane);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });
    }
}
