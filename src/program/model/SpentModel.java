package program.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class SpentModel
{

    /**
     * Value of spent (Money spend or collect)
     */
    private int value;
    /**
     * Spent description (what is it)
     */
    private String description;

    @Override
    public String toString()
    {
        return "SpentModel{" +
                "value=" + value +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }

    /**
     * Date of spent
     */
    private long date;

    /**
     * Generate random spent
     */
    SpentModel()
    {
        this(new Random().nextInt(200), "Random" + new Random().nextInt(1000), System.currentTimeMillis());
    }

    /**
     * Constructor
     * @param value
     * @param description
     * @param date
     */
    SpentModel(int value, String description, long date)
    {
        this.value = value;
        this.description = description;
        this.date = date;
    }

    /**
     * Return description
     * @return description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Return value
     * @return value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Return date at format dd/MM/yyyy (for example 12/01/2018)
     * @return Date
     */
    public String getDate()
    {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        return df.format(new Date(date));
    }
}
