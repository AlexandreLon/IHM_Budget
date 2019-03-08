package program.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import program.model.BudgetManagementModel;
import program.view.View;

import java.io.IOException;

/**
 * @author G5
 * @version 2019.02.24
 */

public class BudgetManagementController extends Controller{

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


    public void init() {

        BudgetManagementModel bm =new BudgetManagementModel();

        ceiling.setText(bm.getCeiling());

        validCeiling.setOnAction( event -> {

            if(!(myCeiling.getText().isEmpty())){
                ceiling.setText(myCeiling.getText());
                bm.setCeiling(myCeiling.getText());
            }

        });


        back.setOnAction(event -> {
            try {
                redirectionToAccueil(View.ACCUEIL, borderPane);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });

    }
}
