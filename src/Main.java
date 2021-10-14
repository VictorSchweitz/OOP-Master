import java.util.Scanner;

// This code is written by Søs (copied and pasted from her Github as of 10/9-2021)
// Even though it's written by Søs, I have read it and understand what's going on line by line
/*
*  Note:
*  The reason why most of the code is written by Søs, is because we made a deal of co-working on this project,
*  but she has already written the code a little bit ahead of the deal, why my code is pretty similar to hers.
*/
public class Main
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Victor's code //
        // Welcome message
        System.out.println("Welcome to EverBooking. We offer you some of the biggest name for you to book to your events. See our artist list below \n");


        // Logging statistics over the most booked band //
        // Creating a string of the possible bands
        String[] artistsToBook = {"Foo Fighters", "Linkin Park", "Pink"};

        // Generating a new int array with 10 integer elements
        int[] numberOfArtistsBooked = new int[10];

        // Printing out the artists that can be booked
        for (String artistToBook: artistsToBook)
        {
            System.out.println(artistToBook);
        }

        System.out.println('\n');


        // Make customer able to book artists book max 10 artists (I know there aren't 10 artists, so, at this point, an artist can be booked more than once).

        System.out.println("Press 1 to book " + artistsToBook[0] + ", 2 to book " + artistsToBook[1] + ", and 3 to book " + artistsToBook[2]);

        for (int numberOfBookedArtists = 0; numberOfBookedArtists < 10; numberOfBookedArtists++)
        {
            // Logging user input number (subtracting 1 to avoid user from having to type 0 for first index)
            int artistBookingNumber = scanner.nextInt() - 1;

            numberOfArtistsBooked[numberOfBookedArtists] = artistBookingNumber;
        }

        // Never got it to work, but I ran out of time
        // This code should've checked amount of booked artist and logged the most popular
        int artist;
        int numberToBookArtist = 0;
        int numberOfBookedArtists = 0;
        do
        {
            numberToBookArtist = scanner.nextInt();

            scanner.nextLine();

            artist = numberToBookArtist - 1;

            numberOfArtistsBooked[artist]++;

            numberOfBookedArtists++;

            System.out.println(numberToBookArtist);
        }
        while(numberToBookArtist != 4 && numberOfBookedArtists < 10);

        System.out.println(numberToBookArtist);
        System.out.println(artist);
        System.out.println(numberOfArtistsBooked);

        System.out.println("While loop done!");

        // Check why do while doesn't work as expected
        // Foreach through numberOfArtistsBooked



        // Code written by Victor //
        // Logging most booked artist
        int mostPopularArtistBookingNumber = 0;
        int mostBookedArtistValue = 0;

        // Most popular choice
        for (int i = 0; i < artistsToBook.length; i++)
        {
            // Number of times an artist has been booked
            int thisArtistsBookings = 0;

            for (int j = 0; j < numberOfArtistsBooked.length; j++)
            {
                if (numberOfArtistsBooked[j] == i)
                {
                    thisArtistsBookings++;
                }
            }

            // If the amount of bookings for an artist > mostBookedArtistValue
            if (thisArtistsBookings > mostBookedArtistValue)
            {
                // Then set the value of the most booked value = thisArtistsBookings
                mostBookedArtistValue = thisArtistsBookings;

                // Then set the amount of bookings for the most booked artist
                mostPopularArtistBookingNumber = i;
            }


        }

        // Printing most booked artist and the number of bookings for that artist
        System.out.println("Most booked artist: " + artistsToBook[mostPopularArtistBookingNumber] + " with " + mostBookedArtistValue + " bookings.");




        // Søs' code continues here //

        // Making new Bands objects
        Bands fooFighters = new Bands("fooFighters", 700000, 1);
        Bands linkinPark = new Bands("linkinPark", 65000, 2);
        Bands pink = new Bands("pink", 670000, 3);


        // Making new PlannedEvents objects
        PlannedEvents fooFightersConcert = new PlannedEvents("Reffen",1.0);
        PlannedEvents linkinParkConcert = new PlannedEvents("Reffen", 2.0);
        PlannedEvents pinkConcert = new PlannedEvents("Reffen", 3.0);


        // Making an array of type PlannedEvents called everBookingEvents
        PlannedEvents[] everBookingEvents = {fooFightersConcert, linkinParkConcert, pinkConcert};

        // Looping over each event and print it to the console
        for (PlannedEvents everBookingEvent: everBookingEvents)
        {
            System.out.println(everBookingEvent);
        }


        // Making a new BookingSite object and print it
        // BookingSite everBooking = new BookingSite("everBooking.dk", "everBooking", everBookingEvents);
        // System.out.println(everBooking);

        // Søs' code ends here

    }







}