package program.model;

import java.util.*;
import java.util.stream.Collectors;

public class HistoryModel
{
    public static class BalanceSheet
    {
        public int asset;
        public int dept;
        public int sum;

        private long firstDateOfCurrentMonth()
        {
            Calendar aCalendar = Calendar.getInstance();

            aCalendar.set(Calendar.DATE, 1);
            aCalendar.set(Calendar.HOUR_OF_DAY, 0);
            aCalendar.set(Calendar.MINUTE, 0);
            aCalendar.set(Calendar.SECOND, 0);

            return aCalendar.getTimeInMillis();
        }

        public BalanceSheet(HistoryModel history)
        {
            Set<SpentModel> spenListOfMonth = history.getSpentList().stream().filter(spentModel -> spentModel.getTimestamp() > firstDateOfCurrentMonth()).collect(Collectors.toCollection(TreeSet::new));
            asset = (int)spenListOfMonth.stream().filter(spentModel -> !spentModel.isSpent()).mapToDouble(SpentModel::getValue).sum();
            dept = (int)spenListOfMonth.stream().filter(SpentModel::isSpent).mapToDouble(SpentModel::getValue).sum();
            sum = asset - dept;
        }
    }
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
     * @param isSpent
     */
    public void createAndAddSpent(int value, String description, boolean isSpent)
    {
        addSpent(new SpentModel(value, description, isSpent, System.currentTimeMillis()));
    }

    public BalanceSheet getBalanceSheet()
    {
        return new BalanceSheet(this);
    }
}
