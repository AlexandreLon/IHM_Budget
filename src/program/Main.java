package program;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import program.controller.ConnectionController;
import program.view.View;


public class Main extends Application
{

    /**
     * The main entry point for all JavaFX applications.
     * @param stage (Useful to create window JavaFX)
     * @throws Exception Exception if page creating it's impossible
     */
    @Override
    public void start(Stage stage) throws Exception
    {

        FXMLLoader loader = new FXMLLoader();
        ConnectionController Controller = new ConnectionController();
        loader.setController(Controller);
        Parent root = loader.load(getClass().getResourceAsStream(View.CONNECTION));
        root.getStylesheets().add("/resources/styles/styles.css");
        Controller.init();

        stage.setScene(new Scene(root, 800, 570));
        stage.setTitle("Connexion");

        stage.show();
    }


    /**
     * Start methods
     * @param args Argument app
     */
    public static void main(String[] args)
    {
        launch(args);
    }
}
