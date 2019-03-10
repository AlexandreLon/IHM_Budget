package program.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import program.model.BudgetManagementModel;
import program.view.View;
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
    private Button budget;
    @FXML
    private  Hyperlink recipe;
    @FXML
    private BorderPane borderPane;

    @FXML
    private Label sum;

    @FXML
    private Label dept;

    @FXML
    private Label asset;

    @FXML
    private Button myBudget;

    @FXML
    private Label spent;

    @FXML
    private Label rest;

    @FXML
    private PieChart pieChart;

    @FXML
    private Hyperlink Alerte1;

    @FXML
    private Hyperlink Alerte2;


    public void show(int budget,int ceiling) {
        ObservableList<PieChart.Data> pieChartData
                = FXCollections.observableArrayList(
                new PieChart.Data("Depense", budget),
                new PieChart.Data("Plafond",ceiling)
        );
        pieChart.setData(pieChartData);
    }

    protected void init() {
       BudgetManagementModel bmd = new BudgetManagementModel();
       spent.setText(String.valueOf(history.getSumSpent()));
       int bud=-Integer.parseInt(String.valueOf(history.getSumSpent()));
       int ceil=Integer.parseInt(bmd.getCeiling());
       show(bud,ceil);
       int res = ceil+bud;
       String result=Integer.toString(res);

       rest.setText(result);
        if(res<0){rest.setTextFill(Color.RED);}
        budget.setOnAction(event -> {
            try {
                redirectionToHistory(borderPane, history);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });
        myBudget.setOnAction(event -> {
            try {
                redirectionToBudgetManagement(borderPane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        recipe.setOnAction(event -> {
            try {
                redirectionToRecipe(borderPane, history);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });
        Alerte1.setOnAction(event -> {
                new Alert(Alert.AlertType.INFORMATION, "La page Forum est en maintenance").show();
        });

        Alerte2.setOnAction(event -> {
            new Alert(Alert.AlertType.INFORMATION, "La page Mes recettes est en maintenance").show();
        });



    }

}

