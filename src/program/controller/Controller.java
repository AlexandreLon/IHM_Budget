package program.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import program.model.BudgetModel;
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

    private static final HomeController HOME_CONTROLLER = new HomeController();
    private static final Controller CREATE_ACCOUNT_CONTROLLER = new CreateAccountController();
    private static final Controller CONNEXION_CONTROLLER = new ConnectionController();
    private static final Controller BUDGET_MANAGMENT_CONTROLLER = new BudgetManagementController(HOME_CONTROLLER.getHistory());

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

    void redirectionToHistory(Parent element, BudgetModel history) throws IOException
    {
        redirectionTo(element, View.HISTORY, new HistoryController(history));
    }

    void redirectionToRecipe(Parent element, BudgetModel history) throws IOException
    {
        redirectionTo(element, View.RECIPE, new RecipeController(history));
    }

    void redirectionToBudgetManagement(Parent element) throws IOException
    {
        redirectionTo(element, View.BUDGETMANAGEMENT, BUDGET_MANAGMENT_CONTROLLER);
    }

}
