package program.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import program.model.HistoryModel;
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

    private static final Controller HOME_CONTROLLER = new HomeController();
    private static final Controller CREATE_ACCOUNT_CONTROLLER = new CreateAccountController();
    private static final Controller CONNEXION_CONTROLLER = new ConnectionController();

    private void redirectionTo(Parent element, String target, Controller controller) throws IOException
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
        redirectionTo(element, View.CREATEACCOUNT, CREATE_ACCOUNT_CONTROLLER);
    }

    void redirectionToHome(Parent element) throws IOException
    {
        redirectionTo(element, View.HOME, HOME_CONTROLLER);
    }

    void redirectionToConnection(Parent element) throws IOException
    {
        redirectionTo(element, View.CONNECTION, CONNEXION_CONTROLLER);
    }

    void redirectionToHistory(Parent element, HistoryModel history) throws IOException
    {
        redirectionTo(element, View.HISTORY, new HistoryController(history));
    }

    void redirectionToRecipe(Parent element, HistoryModel history) throws IOException
    {
        redirectionTo(element, View.RECIPE, new RecipeController(history));
    }

    void redirectionToBudgetManagement(Parent element) throws IOException
    {
        redirectionTo(element, View.BUDGETMANAGEMENT, new BudgetManagementController());
    }
     boolean confirmation(){

        FXMLLoader loader = new FXMLLoader();
        try {
            ConfirmeControler controler=new ConfirmeControler();
            loader.setController(controler);
            Stage stage=new Stage();
            Parent rootNode = loader.load(getClass().getResourceAsStream(View.CONFIRM));
            rootNode.getStylesheets().add("/resources/styles/styles.css");

            stage.setScene(new Scene(rootNode));
            stage.setTitle("confirmation");
            stage.setMinWidth(250);
            return controler.init(stage);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}
