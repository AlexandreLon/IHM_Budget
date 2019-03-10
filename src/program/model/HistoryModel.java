package program.model;

import java.util.*;

public class HistoryModel
{
    private Set<SpentModel> spentList;

    /**
     * Default constructor
     * @param spents
     */
    private HistoryModel(SpentModel[] spents)
    {
        spentList = new HashSet<>(Arrays.asList(spents));
    }

    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder("[");
        spentList.forEach(str::append);
        str.append("]");
        return str.toString();
    }

    /**
     * Create random list just to test
     */
    public HistoryModel()
    {
        System.out.println("WTF france");
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

    public String toObjectString()
    {
        return super.toString();
    }

    public int getSumSpent()
    {
        return spentList.stream().mapToInt(SpentModel::getValue).sum();
    }
}
