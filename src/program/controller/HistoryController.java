package program.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;
import program.model.BudgetModel;
import program.model.SpentModel;

import java.io.IOException;

class HistoryController extends Controller
{
    @FXML
    private ListView listView;
    @FXML
    private Button back;

    @FXML
    private BorderPane borderPaneHistory;

    private BudgetModel historyModel;
    private ObservableList observableList = FXCollections.observableArrayList();

    HistoryController(BudgetModel history)
    {
        this.historyModel = history;
    }

    protected void init()
    {
        observableList.setAll(historyModel.getSpentList());
        listView.setItems(observableList);
        listView.setCellFactory((Callback<ListView<String>, ListCell>) listView -> new ListCell<SpentModel>()
        {
            @Override
            public void updateItem(SpentModel spent, boolean empty)
            {
                super.updateItem(spent, empty);
                if (spent != null)
                {
                    SpentController menu = new SpentController();
                    menu.setInfo(spent);
                    setGraphic(menu.getBox());
                }
            }
        });

        back.setOnAction(event -> {
            try {
                redirectionToHome(borderPaneHistory);
            } catch (IOException e) {
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });
    }
}
