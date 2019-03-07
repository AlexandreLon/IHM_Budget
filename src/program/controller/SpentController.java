package program.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import program.model.SpentModel;

import java.io.IOException;

class SpentController
{
    @FXML
    private HBox hBox;
    @FXML
    private Label value;
    @FXML
    private Label description;
    @FXML
    private Label date;

    SpentController()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/resources/fxml/Spent.fxml"));
        fxmlLoader.setController(this);
        try
        {
            fxmlLoader.load();
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

    void setInfo(SpentModel spent)
    {
        value.setText(Integer.toString(spent.getValue()));
        description.setText(spent.getDescription());
        date.setText(spent.getDate());
    }

    Node getBox()
    {
        return hBox;
    }
}
