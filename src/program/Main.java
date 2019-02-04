package program;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("../resources/fxml/polytech_home.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("../resources/fxml/sample.fxml"));
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Hello JavaFX and Maven");
        stage.setScene(scene);
        stage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
