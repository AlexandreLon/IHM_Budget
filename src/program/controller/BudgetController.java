package program.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import program.model.SpentModel;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BudgetController
{
    @FXML
    private ListView listView;
    private Set<SpentModel> stringSet = new TreeSet<>();
    ObservableList observableList = FXCollections.observableArrayList();

    public void init()
    {
        stringSet.add(new SpentModel());
        stringSet.add(new SpentModel());
        stringSet.add(new SpentModel());
        stringSet.add(new SpentModel());
        observableList.setAll(stringSet);
        listView.setItems(observableList);
        listView.setCellFactory((Callback<ListView<String>, ListCell>) listView -> new ListCell<SpentModel>()
        {
            @Override
            public void updateItem(SpentModel menuModel, boolean empty)
            {
                super.updateItem(menuModel,empty);
                if(menuModel != null)
                {
                    SpentController menu = new SpentController();
                    menu.setInfo(menuModel);
                    setGraphic(menu.getBox());
                }
            }
        });
    }
}