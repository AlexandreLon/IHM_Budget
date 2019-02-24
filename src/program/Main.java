package program;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import program.controller.ConnectionControler;
import program.view.ConnectionView;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        FXMLLoader loader = new FXMLLoader();

        //create a controller
        ConnectionControler Controller = new ConnectionControler();

        //attach controller
        loader.setController(Controller);

        //attach XML file
        Parent root = loader.load(getClass().getResourceAsStream(ConnectionView.XML_FILE));

        //attach css file
        root.getStylesheets().add(ConnectionView.CSS);

        //initialize the controller
        Controller.init();

        //create the view
        stage.setScene(new Scene(root, ConnectionView.WIDTH, ConnectionView.HEIGHT));
        stage.setTitle(ConnectionView.LABEL);

        //show the view
        stage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
