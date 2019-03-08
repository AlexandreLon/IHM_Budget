package program.model;

/**
 * Model for CreateAccount page.
 *
 * @author G5
 * @version 2019.02.24
 */

public class CreateAccountModel
{
    /**
     * user nom
     */
    private String nom;
    /**
     * user prenom
     */
    private String prenom;
    /**
     * user email
     */
    private String email;
    /**
     * user password
     */
    private String pwd;
    /**
     * user confirmpassword
     */
    private String cPwd;


    /**
     * check filed
     *
     * @param email  user mail
     * @param pwd    user password
     * @param nom    user firstname
     * @param prenom user lastname
     * @param cpwd   user confirmPassword
     */
    public CreateAccountModel(String nom, String prenom, String email, String pwd, String cpwd)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.pwd = pwd;
        this.cPwd = cpwd;
    }

    /**
     * @return True if email and pwd are correct
     */
    public boolean verify()
    {

        return !nom.isEmpty() && !prenom.isEmpty() && !email.isEmpty() && !pwd.isEmpty() && !cPwd.isEmpty();

    }


}
