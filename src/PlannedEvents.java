public class PlannedEvents
{

    private String locations;
    private double startAndEnd;
    private Bands bandId;

    public PlannedEvents(String locations, double startAndEnd)
    {
        this.locations = locations;
        this.startAndEnd = startAndEnd;
    }

    @Override
    public String toString()
    {
        return "PlannedEvents{" +
                "locations='" + locations + '\'' +
                ", startAndEnd=" + startAndEnd +
                '}';
    }
}