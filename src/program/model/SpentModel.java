package program.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class SpentModel implements Comparable<SpentModel>
{

    private int value;
    private String description;
    private boolean isSpent; //True if it's a purchase, False else
    private long date;

    /**
     * Generate random spent
     */
    public SpentModel()
    {
        this(new Random().nextInt(200), "Random", new Random().nextBoolean(), System.currentTimeMillis());
    }

    public SpentModel(int value, String description, boolean isSpent, long date)
    {
        this.value = value;
        this.description = description;
        this.isSpent = isSpent;
        this.date = date;
    }

    public String getDescription()
    {
        return description;
    }

    public int getValue()
    {
        return value;
    }

    public String getDate()
    {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        return df.format(new Date(date));
    }

    @Override
    public int compareTo(SpentModel o)
    {
        return (int) (o.date - this.date);
    }
}
