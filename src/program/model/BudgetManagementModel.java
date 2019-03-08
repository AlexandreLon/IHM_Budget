package program.model;


/**
 * @author G5
 * @version 2019.02.24
 */

public class BudgetManagementModel {

    private static String budget="0";

    private static String ceiling="0";


    public String getBudget() {
        return budget;
    }

    public void setCeiling(String ceiling) {
        this.ceiling = ceiling;
    }

    public String getCeiling() {
        return ceiling;
    }
}
