package program;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import program.controller.ConnectionControler;
import program.view.ConnectionView;
import program.view.accueilView;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        FXMLLoader loader = new FXMLLoader();

        //create a controller
        ConnectionControler connController = new ConnectionControler();

        //attach controller
        loader.setController(connController);

        //attach XML file
        Parent root = loader.load(getClass().getResourceAsStream(ConnectionView.XML_FILE));

        //attach css file
        root.getStylesheets().add(ConnectionView.CSS);

        //initialize the controller
        connController.init();

        //create the view
        stage.setScene(new Scene(root, ConnectionView.WIDTH, accueilView.HEIGHT));
        stage.setTitle(accueilView.LABEL);

        //show the view
        stage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
