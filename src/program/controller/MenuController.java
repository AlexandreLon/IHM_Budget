package program.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import program.model.MenuModel;

import java.io.IOException;

public class MenuController
{

    @FXML
    private HBox hBox;
    @FXML
    private Label label;
    @FXML
    private ImageView image;

    public MenuController()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/resources/fxml/menu.fxml"));
        fxmlLoader.setController(this);
        try
        {
            fxmlLoader.load();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

    public void setInfo(MenuModel menu)
    {
        label.setText(menu.getName());
        image.setImage(new Image(menu.getImage()));
    }

    public Node getBox()
    {
        return hBox;
    }
}
