package program.controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author CHERKAOUI Mehdi
 */

public class HomeController {
    @FXML
    private PieChart pieChart;

    @FXML
    public void initialize(URL url, ResourceBundle rbl){
        ObservableList<PieChart.Data> pieChartData
                = FXCollections.observableArrayList(
                new PieChart.Data("Budget", 190),
                new PieChart.Data("Plafond", 300));

        pieChart.setData(pieChartData);
    }

}
