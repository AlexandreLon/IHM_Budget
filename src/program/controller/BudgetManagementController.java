package program.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import program.model.BudgetModel;
import program.view.View;

import java.io.IOException;

/**
 * @author G5
 * @version 2019.02.24
 */

public class BudgetManagementController extends Controller
{

    @FXML
    private TextField myCeiling;
    @FXML
    private Label ceiling;
    @FXML
    private Button validCeiling;
    @FXML
    private Button back;


    @FXML
    private BorderPane borderPane;

    @FXML
    private BudgetModel history;

    BudgetManagementController(BudgetModel historyModel)
    {
        this.history = historyModel;
    }


    public void init()
    {

        ceiling.setText(String.valueOf(history.getCeiling()));

        validCeiling.setOnAction(event ->
        {

            if (!(myCeiling.getText().isEmpty()))
            {
                Boolean test = confirmation();
                if (test)
                {
                    ceiling.setText(myCeiling.getText());
                    history.setCeiling(Integer.valueOf(myCeiling.getText()));
                }
                try
                {
                    redirectionToHome(borderPane);
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            } else
            {
                new Alert(Alert.AlertType.INFORMATION, "Veuillez insérer une valeur !").show();
            }
        });


        back.setOnAction(event ->
        {
            try
            {
                redirectionToHome(borderPane);
            } catch (IOException e)
            {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });


    }
}
