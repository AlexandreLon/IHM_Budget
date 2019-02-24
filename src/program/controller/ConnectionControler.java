package program.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import program.model.ConnectionModel;
import program.view.CreateAccountView;
import program.view.accueilView;
import java.io.IOException;

/**
 * controler for Connection page.
 *
 * @author G5
 * @version 2019.02.24
 */
public class ConnectionControler extends Controller {

    /**
     * user email
     */
    @FXML
    private TextField email;
    /**
     * user password
     */
    @FXML
    private TextField password;
    /**
     * connection button
     */
    @FXML
    private Button connection;
    /**
     * createAccount button
     */
    @FXML
    private Button createAccount;
    /**
     * parent element
     */
    @FXML
    private BorderPane borderPane;

    /**
     * check the mail:admin@unice and pwd :0000
     * @param email user mail
     * @param password user password
     */
    public void valid(TextField email,TextField password)throws IOException {

        ConnectionModel connModel = new ConnectionModel(email.getText(),password.getText());
       if(connModel.verify()) redirectionToAccueil(accueilView.XML_FILE,borderPane);
       else  {new Alert(Alert.AlertType.ERROR,"Failed to login  try with : \n e-mail :admin@unice.fr \n pwd :0000 ").show();}

    }

    /**
     * button activation
     *
     */

    public void init() {
        createAccount.setOnAction( event -> {
            try {
                redirectionToCreateAccount(CreateAccountView.XML_FILE,borderPane);
            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });

        connection.setOnAction( event -> {
            try {
                valid(email,password);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

}



    }

