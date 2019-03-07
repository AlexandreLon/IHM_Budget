package program.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import program.model.SpentModel;

import java.io.IOException;

public class SpentController
{
    @FXML
    private HBox hBox;
    @FXML
    private Label value;
    @FXML
    private Label description;
    @FXML
    private Label date;

    public SpentController()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/resources/fxml/Spent.fxml"));
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

    public void setInfo(SpentModel spent)
    {
        value.setText(Integer.toString(spent.getValue()));
        description.setText(spent.getDescription());
        date.setText(spent.getDate());
    }

    public Node getBox()
    {
        return hBox;
    }
}
