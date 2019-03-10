package program.model;

import java.util.*;

public class HistoryModel
{
    private Set<SpentModel> spentList;

    /**
     * Default constructor
     * @param spents
     */
    private HistoryModel(SpentModel... spents)
    {
        spentList = new TreeSet<>(Arrays.asList(spents));
    }

    /**
     * Create random list just to test
     */
    public HistoryModel()
    {
        this(new SpentModel(), new SpentModel(), new SpentModel(), new SpentModel(), new SpentModel(), new SpentModel());
    }

    public Set<SpentModel> getSpentList()
    {
        return spentList;
    }

    /**
     * Add spent in list
     * @param spent
     */
    public void addSpent(SpentModel spent)
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
}
