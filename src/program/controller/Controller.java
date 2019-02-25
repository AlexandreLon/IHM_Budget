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

public abstract class Controller {


    /**
     * redirect to new view
     * @param fxmlFile the path of the new view
     * @param element parent element 'borderPane'
     */

    public void redirectionToCreateAccount(String fxmlFile, Parent element)throws IOException {
        FXMLLoader loader = new FXMLLoader();
        try {
            CreateAccountControler controler =new CreateAccountControler();
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

    public void redirectionToAccueil(String fxmlFile, Parent element)throws IOException {
        FXMLLoader loader = new FXMLLoader();
        try {
            AccueilControler controler =new AccueilControler();
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

    public void redirectionToConnection(String fxmlFile, Parent element)throws IOException {
        FXMLLoader loader = new FXMLLoader();
        try {
            ConnectionControler controler = new ConnectionControler();
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

    public void redirectionToRecipe(String fxmlFile, Parent element)throws IOException {
        FXMLLoader loader = new FXMLLoader();
        try {
            RecipeControler controler = new RecipeControler();
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



}
