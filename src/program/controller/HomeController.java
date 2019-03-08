package program.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import program.model.BudgetManagementModel;
import program.view.View;

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
    private  Hyperlink recipe;
    @FXML
    private BorderPane borderPane;

    @FXML
    private Button myBudget;

    @FXML
    private Label spent;

    @FXML
    private Label rest;

    @FXML
    private PieChart pieChart;

    public void show(int budget,int ceiling) {
            ObservableList<PieChart.Data> pieChartData
                    = FXCollections.observableArrayList(
                    new PieChart.Data("Depense", budget),
                    new PieChart.Data("Plafond",ceiling)
            );
            pieChart.setData(pieChartData);
        }


    public void init() {
       BudgetManagementModel bmd = new BudgetManagementModel();
       spent.setText(bmd.getBudget());
       int bud=-Integer.parseInt(bmd.getBudget());
       int ceil=Integer.parseInt(bmd.getCeiling());
       show(bud,ceil);
       int res = ceil+bud;
       String result=Integer.toString(res);
       rest.setText(result);
        budget.setOnAction(event -> {
            try {
                redirectionToBudget(View.HISTORY, borderPane);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });
        myBudget.setOnAction(event -> {
            try {
                redirectionToBudgetManagement(View.BUDGETMANAGEMENT, borderPane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        recipe.setOnAction(event -> {
            try {
                redirectionToRecipe(View.RECIPE, borderPane);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });

    }

}

