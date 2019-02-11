package program;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import program.controller.Controller;
import program.view.HomeView;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        FXMLLoader loader = new FXMLLoader();

        //create a controller
        Controller controller = new Controller();

        //attach controller
        loader.setController(controller);

        //attach XML file
        Parent root = loader.load(getClass().getResourceAsStream(HomeView.XML_FILE));

        //attach css file
        root.getStylesheets().add(HomeView.CSS);

        //initialize the controller
        controller.init();

        //create the view
        stage.setScene(new Scene(root, HomeView.WIDTH, HomeView.HEIGHT));
        stage.setTitle(HomeView.LABEL);

        //show the view
        stage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
