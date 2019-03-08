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

public abstract class Controller {


    /**
     * redirect to new view
     *
     * @param fxmlFile the path of the new view
     * @param element  parent element 'borderPane'
     */

    public void redirectionToCreateAccount(String fxmlFile, Parent element) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        try {
            CreateAccountControler controler = new CreateAccountControler();
            loader.setController(controler);
            Stage stage = (Stage) element.getScene().getWindow();
            Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));
            rootNode.getStylesheets().add("/resources/styles/styles.css");
            controler.init();
            stage.setScene(new Scene(rootNode, 800, 570));
            stage.setTitle("EAT WITH US");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void redirectionToAccueil(String fxmlFile, Parent element) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        try {
            HomeController controler = new HomeController();
            loader.setController(controler);
            Stage stage = (Stage) element.getScene().getWindow();
            Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));
            rootNode.getStylesheets().add("/resources/styles/styles.css");
            controler.init();
            stage.setScene(new Scene(rootNode, 800, 570));
            stage.setTitle("EAT WITH US");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public void redirectionToConnection(String fxmlFile, Parent element) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        try {
            ConnectionControler controler = new ConnectionControler();
            loader.setController(controler);
            Stage stage = (Stage) element.getScene().getWindow();
            Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));
            rootNode.getStylesheets().add("/resources/styles/styles.css");
            controler.init();
            stage.setScene(new Scene(rootNode, 800, 570));
            stage.setTitle("EAT WITH US");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void redirectionToBudget(String fxmlFile, Parent element) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        try {
            BudgetController controler = new BudgetController();
            loader.setController(controler);
            Stage stage = (Stage) element.getScene().getWindow();
            Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));
            rootNode.getStylesheets().add("/resources/styles/styles.css");
            controler.init();
            stage.setScene(new Scene(rootNode, 800, 570));
            stage.setTitle("EAT WITH US");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void redirectionToBudgetManagement(String fxmlFile, Parent element) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        try {
            BudgetManagementController bmc = new BudgetManagementController();
            loader.setController(bmc);
            Stage stage = (Stage) element.getScene().getWindow();
            Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));
            rootNode.getStylesheets().add("/resources/styles/styles.css");
            bmc.init();
            stage.setScene(new Scene(rootNode, 800, 600));
            stage.setTitle("EAT WITH US");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void redirectionToRecipe(String fxmlFile, Parent element)throws IOException {
        FXMLLoader loader = new FXMLLoader();
        try {
            RecipeController controler = new RecipeController();
            loader.setController(controler);
            Stage stage=(Stage) element.getScene().getWindow();
            Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));
            rootNode.getStylesheets().add("/resources/styles/styles.css");
            controler.init();
            stage.setScene(new Scene(rootNode,800,600));
            stage.setTitle("EAT WITH US");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /**
     * retourn true if valid else false
     *
     */

    public Boolean confirmation(){

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
