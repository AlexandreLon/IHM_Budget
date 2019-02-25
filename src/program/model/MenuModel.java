package program.model;

public class MenuModel
{
    private String image;
    private String name;

    public MenuModel(String image, String name)
    {
        this.image = image;
        this.name = name;
    }

    public String getImage()
    {
        return image;
    }

    public String getName()
    {
        return name;
    }
}
