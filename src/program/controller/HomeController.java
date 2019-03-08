package program.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import program.model.HistoryModel;

import java.io.IOException;

/**
 * controler for Accueil page.
 *
 * @author G5
 * @version 2019.02.24
 */
class HomeController extends Controller
{
    private HistoryModel history = new HistoryModel();

    @FXML
    private Hyperlink budget;

    @FXML
    private BorderPane borderPane;

    @FXML
    private Label sum;

    @FXML
    private Label dept;

    @FXML
    private Label asset;

    protected void init()
    {
        budget.setOnAction(event ->
        {
            try
            {

                redirectionToHistory(borderPane, history);
            } catch (IOException e)
            {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });
    }
}
