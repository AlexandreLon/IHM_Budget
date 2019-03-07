package program.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import program.model.CreateAccountModel;

import java.io.IOException;

/**
 * controler for CreateAccount page.
 *
 * @author G5
 * @version 2019.02.24
 */


class CreateAccountController extends Controller
{

    /**
     * user nom
     */
    @FXML
    private TextField nom;
    /**
     * user prenom
     */
    @FXML
    private TextField prenom;
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
     * user confirmpassword
     */
    @FXML
    private TextField confirmPassword;
    /**
     * create button
     */
    @FXML
    private Button create;
    /**
     * back button
     */
    @FXML
    private Button back;
    /**
     * parent element
     */
    @FXML
    private BorderPane borderPane;

    /**
     * check the mail:admin@unice and pwd :0000
     *
     * @param email           user mail
     * @param password        user password
     * @param nom             user firstname
     * @param prenom          user lastname
     * @param confirmPassword user confirmPassword
     */
    private void validForm(TextField nom, TextField prenom, TextField email, TextField password, TextField confirmPassword) throws IOException
    {

        CreateAccountModel creatModel = new CreateAccountModel(nom.getText(), prenom.getText(), email.getText(), password.getText(), confirmPassword.getText());
        if (creatModel.verify())
        {
            new Alert(Alert.AlertType.CONFIRMATION, "Account created with success\n WELCOME TO EAT WITH !!").show();
            redirectionToHome(borderPane);
        } else
        {
            new Alert(Alert.AlertType.ERROR, "Failed to create account:\n - Field are empty \n or \n - check your password ").show();
        }

    }


    protected void init()
    {
        back.setOnAction(event ->
        {
            try
            {

                redirectionToConnection(borderPane);
            } catch (IOException e)
            {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR, "Failed to open FXML View!").show();
            }
        });

        create.setOnAction(event ->
        {
            try
            {
                validForm(nom, prenom, email, password, confirmPassword);
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        });

    }


}

