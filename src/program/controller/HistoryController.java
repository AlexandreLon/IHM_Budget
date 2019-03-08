package program.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import program.model.HistoryModel;
import program.model.SpentModel;

class HistoryController extends Controller
{
    @FXML
    private ListView listView;
    private HistoryModel historyModel;
    private ObservableList observableList = FXCollections.observableArrayList();

    HistoryController(HistoryModel history)
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
            public void updateItem(SpentModel menuModel, boolean empty)
            {
                super.updateItem(menuModel, empty);
                if (menuModel != null)
                {
                    SpentController menu = new SpentController();
                    menu.setInfo(menuModel);
                    setGraphic(menu.getBox());
                }
            }
        });
    }
}
