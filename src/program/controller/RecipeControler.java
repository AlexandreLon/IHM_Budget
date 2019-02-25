package program.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import program.model.MenuModel;

import java.util.HashSet;
import java.util.Set;

public class RecipeControler
{
    @FXML
    private ListView listView;
    private Set<MenuModel> stringSet = new HashSet<>();
    ObservableList observableList = FXCollections.observableArrayList();

    public void init()
    {
        stringSet.add(new MenuModel("/resources/images/20419.png", "test"));
        stringSet.add(new MenuModel("/resources/images/20419.png", "test2"));
        stringSet.add(new MenuModel("/resources/images/20419.png", "test3"));
        stringSet.add(new MenuModel("/resources/images/20419.png", "test4"));
        observableList.setAll(stringSet);
        listView.setItems(observableList);
        listView.setCellFactory((Callback<ListView<String>, ListCell>) listView -> new ListCell<MenuModel>()
        {
            @Override
            public void updateItem(MenuModel menuModel, boolean empty)
            {
                super.updateItem(menuModel,empty);
                if(menuModel != null)
                {
                    MenuController menu = new MenuController();
                    menu.setInfo(menuModel);
                    setGraphic(menu.getBox());
                }
            }
        });
    }
}
