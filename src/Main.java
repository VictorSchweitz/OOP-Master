
public class Main
{
    public static void main(String[] args)
    {
        Bands fooFighters = new Bands("fooFighters", 700000, 1);
        Bands linkinPark = new Bands("linkinPark", 65000, 2);
        Bands pink = new Bands("pink", 670000, 3);


        PlannedEvents fooFightersConcert = new PlannedEvents("Reffen",1.0);
        PlannedEvents linkinParkConcert = new PlannedEvents("Reffen", 2.0);
        PlannedEvents pinkConcert = new PlannedEvents("Reffen", 3.0);


        PlannedEvents[] everBookingEvents = {fooFightersConcert, linkinParkConcert, pinkConcert};

        for (PlannedEvents everBookingEvent: everBookingEvents)
        {
            System.out.println(everBookingEvent);
        }


        BookingSite everBooking = new BookingSite("everBooking.dk", "everBooking", everBookingEvents);
        System.out.println(everBooking);
    }
}