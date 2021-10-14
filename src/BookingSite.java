// This code is written by Søs (copied and pasted from her Github as of 10/9-2021)
// Even though it's written by Søs, I have read it and understand what's going on line by line
import java.util.Arrays;

public class BookingSite
{
    // Making unassigned variables
    private String website;
    private String name;
    private PlannedEvents[] plannedEvents;

    // Making a BookingSite constructor
    public BookingSite(String website, String name, PlannedEvents[] plannedEvents)
    {
        this.website = website;
        this.name = name;
        this.plannedEvents = plannedEvents;
    }

    // Overriding
    @Override
    public String toString()
    {
        return "BookingSite{" +
                "website='" + website + '\'' +
                ", name='" + name + '\'' +
                ", plannedEvents=" + Arrays.toString(plannedEvents) +
                '}';
    }
// Søs' code ends here
}