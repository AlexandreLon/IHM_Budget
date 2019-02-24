package program.model;


/**
 * Model for Connection page.
 *
 * @author G5
 * @version 2019.02.24
 */

public class ConnectionModel {

    /**
     * user email
     */
    private String email;

    /**
     * user password
     */
    private String pwd;

    /**
     * constructor
     * @param email user mail
     * @param pwd user password

     */
    public ConnectionModel(String email, String  pwd) {
        this.email = email;
        this.pwd = pwd;
    }

    /**
     *
     * @return True if email and pwd are correct
     */
    public boolean verify () {


        return email.equals("admin@unice.fr") && pwd.equals("0000");

    }





}
