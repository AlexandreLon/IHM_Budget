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

    /**
     * Controller constructor
     */
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

    /**
     * Update information in widget page with model
     * @param spent to update it
     */
    void setInfo(SpentModel spent)
    {
        int v = spent.getValue();
        value.setText(Integer.toString(v));
        description.setText(spent.getDescription());
        date.setText(spent.getDate());
    }

    /**
     * It's necessary to get for Controller
     * @return
     */
    Node getBox()
    {
        return hBox;
    }
}
