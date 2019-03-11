package program.model;

import java.util.*;

public class BudgetModel
{
    private Set<SpentModel> spentList;
    private int ceiling = 0;

    /**
     * Constructor by default
     */
    public BudgetModel()
    {
        spentList = new HashSet<>();
    }

    public Set<SpentModel> getSpentList()
    {
        return spentList;
    }

    /**
     * Add spent in list
     * @param spent
     */
    private void addSpent(SpentModel spent)
    {
        spentList.add(spent);
    }

    /**
     * Create Spent and add it in list (Useless because i've not form)
     * @param value
     * @param description
     */
    public void createAndAddSpent(int value, String description)
    {
        addSpent(new SpentModel(value, description, System.currentTimeMillis()));
    }

    public int getSumSpent()
    {
        return spentList.stream().mapToInt(SpentModel::getValue).sum();
    }

    public int getCeiling()
    {
        return ceiling;
    }

    public void setCeiling(int ceiling)
    {
        this.ceiling = ceiling;
    }
}
