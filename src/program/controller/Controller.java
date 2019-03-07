package program.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import program.view.View;

import java.io.IOException;

/**
 * controler for redirection between scenes.
 *
 * @author G5
 * @version 2019.02.24
 */

abstract class Controller
{

    void redirectionTo(Parent element, String target, Controller controller) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setController(controller);
        Stage stage = (Stage) element.getScene().getWindow();
        Parent rootNode = loader.load(getClass().getResourceAsStream(target));
        rootNode.getStylesheets().add("/resources/styles/styles.css");
        controller.init();
        stage.setScene(new Scene(rootNode, 800, 570));
        stage.setTitle("EAT WITH US");
        stage.show();
    }

    protected abstract void init();

    /**
     * redirect to new view
     *
     * @param element parent element 'borderPane'
     */

    void redirectionToCreateAccount(Parent element) throws IOException
    {
        redirectionTo(element, View.CREATEACCOUNT, new CreateAccountController());
    }

    void redirectionToHome(Parent element) throws IOException
    {
        redirectionTo(element, View.HOME, new HomeController());
    }

    void redirectionToConnection(Parent element) throws IOException
    {
        redirectionTo(element, View.CONNECTION, new ConnectionController());
    }

    void redirectionToHistory(Parent element) throws IOException
    {
        redirectionTo(element, View.HISTORY, new HistoryController());

    }


}
