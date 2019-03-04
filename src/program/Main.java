package program;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import program.controller.ConnectionControler;
import program.view.View;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        FXMLLoader loader = new FXMLLoader();

        //create a controller
        ConnectionControler Controller = new ConnectionControler();

        //attach controller
        loader.setController(Controller);

        //attach XML file
        Parent root = loader.load(getClass().getResourceAsStream(View.CONNEXION));

        //attach css file
        root.getStylesheets().add("/resources/styles/styles.css");

        //initialize the controller
        Controller.init();

        //create the view
        stage.setScene(new Scene(root, 800, 570));
        stage.setTitle("Connexion");

        //show the view
        stage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
