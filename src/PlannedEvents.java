// This code is written by Søs (copied and pasted from her Github as of 10/9-2021)
// Even though it's written by Søs, I have read it and understand what's going on line by line
public class PlannedEvents
{
    // Making a Bands constructor
    private String locations;
    private double startAndEnd;
    private Bands bandId;

    // Making a PlannedEvents constructor
    public PlannedEvents(String locations, double startAndEnd)
    {
        this.locations = locations;
        this.startAndEnd = startAndEnd;
    }

    // Overriding
    @Override
    public String toString()
    {
        return "PlannedEvents{" +
                "locations='" + locations + '\'' +
                ", startAndEnd=" + startAndEnd +
                '}';
    }
// Søs' code ends here
}