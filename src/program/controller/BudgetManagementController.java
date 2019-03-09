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
                Boolean test = confirmation();
                if(test){
                    ceiling.setText(myCeiling.getText());
                    bm.setCeiling(myCeiling.getText());
                }
            }
            else{
                new Alert(Alert.AlertType.INFORMATION, "Veuillez insérer une valeur !").show();
            }
        });


        back.setOnAction(event -> {
            try {
                redirectionToHome(borderPane);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });


    }

    /**
     * retourn true if valid else false
     *
     */

    private boolean confirmation(){

        FXMLLoader loader = new FXMLLoader();
        try {
            ConfirmeControler controler=new ConfirmeControler();
            loader.setController(controler);
            Stage stage=new Stage();
            Parent rootNode = loader.load(getClass().getResourceAsStream(View.CONFIRM));
            rootNode.getStylesheets().add("/resources/styles/styles.css");

            stage.setScene(new Scene(rootNode));
            stage.setTitle("confirmation");
            stage.setMinWidth(250);
            return controler.init(stage);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}
