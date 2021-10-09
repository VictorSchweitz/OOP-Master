import java.util.Arrays;

public class BookingSite
{

    private String website;
    private String name;
    private PlannedEvents[] plannedEvents;

    public BookingSite(String website, String name, PlannedEvents[] plannedEvents)
    {
        this.website = website;
        this.name = name;
        this.plannedEvents = plannedEvents;
    }

    @Override
    public String toString()
    {
        return "BookingSite{" +
                "website='" + website + '\'' +
                ", name='" + name + '\'' +
                ", plannedEvents=" + Arrays.toString(plannedEvents) +
                '}';
    }
}