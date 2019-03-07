package program;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import program.controller.ConnectionControler;
import program.view.View;


public class Main extends Application
{

    @Override
    public void start(Stage stage) throws Exception
    {

        FXMLLoader loader = new FXMLLoader();
        ConnectionControler Controller = new ConnectionControler();
        loader.setController(Controller);
        Parent root = loader.load(getClass().getResourceAsStream(View.CONNECTION));
        root.getStylesheets().add("/resources/styles/styles.css");
        Controller.init();

        stage.setScene(new Scene(root, 800, 570));
        stage.setTitle("Connexion");

        stage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
