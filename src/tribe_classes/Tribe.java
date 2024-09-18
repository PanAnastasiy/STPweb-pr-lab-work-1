package tribe_classes;

public class Tribe
{
    private final String name;
    private final String population;
    private final boolean fire;
    public Tribe()
    {
        this.name = "???";
        this.population = "???";
        this.fire = false;
    }
    public Tribe(String name, String population, boolean fire)
    {
        this.name = name;
        this.population = population;
        this.fire = fire;
    }
    public Tribe(String name, boolean fire)
    {
        this.name = name;
        this.population = "???";
        this.fire = fire;
    }
    public String getName()
    {
        return this.name;
    }
    public String getPopulation()
    {
        return this.population;
    }
    public String getFire()
    {
        if (this.fire)
        {
            return "ДА";
        }
        else
        {
            return  "НЕТ";
        }
    }
}
