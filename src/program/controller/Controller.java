package program.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * controler for redirection between scenes.
 *
 * @author G5
 * @version 2019.02.24
 */

abstract class Controller
{


    /**
     * redirect to new view
     *
     * @param element parent element 'borderPane'
     */

    void redirectionToCreateAccount(Parent element) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        CreateAccountControler controler = new CreateAccountControler();
        loader.setController(controler);
        Stage stage = (Stage) element.getScene().getWindow();
        Parent rootNode = loader.load(getClass().getResourceAsStream(program.view.View.CREATEACCOUNT));
        rootNode.getStylesheets().add("/resources/styles/styles.css");
        controler.init();
        stage.setScene(new Scene(rootNode, 800, 570));
        stage.setTitle("EAT WITH US");
        stage.show();
    }

    void redirectionToAccueil(Parent element) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        HomeController controller = new HomeController();
        loader.setController(controller);
        Stage stage = (Stage) element.getScene().getWindow();
        Parent rootNode = loader.load(getClass().getResourceAsStream(program.view.View.HOME));
        rootNode.getStylesheets().add("/resources/styles/styles.css");
        controller.init();
        stage.setScene(new Scene(rootNode, 800, 570));
        stage.setTitle("EAT WITH US");
        stage.show();
    }

    void redirectionToConnection(Parent element) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        ConnectionControler controller = new ConnectionControler();
        loader.setController(controller);
        Stage stage = (Stage) element.getScene().getWindow();
        Parent rootNode = loader.load(getClass().getResourceAsStream(program.view.View.CONNECTION));
        rootNode.getStylesheets().add("/resources/styles/styles.css");
        controller.init();
        stage.setScene(new Scene(rootNode, 800, 570));
        stage.setTitle("EAT WITH US");
        stage.show();
    }

    void redirectionToBudget(Parent element) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        BudgetController controller = new BudgetController();
        loader.setController(controller);
        Stage stage = (Stage) element.getScene().getWindow();
        Parent rootNode = loader.load(getClass().getResourceAsStream(program.view.View.HISTORY));
        rootNode.getStylesheets().add("/resources/styles/styles.css");
        controller.init();
        stage.setScene(new Scene(rootNode, 800, 570));
        stage.setTitle("EAT WITH US");
        stage.show();

    }


}
