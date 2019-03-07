package program.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

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
}
