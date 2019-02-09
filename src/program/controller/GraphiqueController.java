package program.controller;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author CHERKAOUI Mehdi
 */

public class GraphiqueController {

    @FXML
    private BarChart<?,?> chart;
    @FXML
    private CategoryAxis x;
    @FXML
    private NumberAxis y;

    @FXML
    public void initialize(URL url, ResourceBundle rbl){
        XYChart.Series set1 = new XYChart.Series<>();
        set1.getData().add(new XYChart.Data("Budget", 190));
        set1.getData().add(new XYChart.Data("Plafond", 300));

        chart.getData().addAll(set1);

    }

}
