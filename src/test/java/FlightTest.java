import com.intellij.openapi.ui.Messages;
import org.junit.Before;
import org.junit.Test;

import java.beans.Transient;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Passenger passenger;
    Bag bag;

    @Before
    public void before(){
        flight = new Flight();
        passenger = new Passenger();
        bag = new Bag(20);
    }

    @Test
    public void canCountBagList(){
        assertEquals(0, flight.countBagList());
    }

    @Test
    public void canCountPassengerList() {
        assertEquals(0, flight.countPassengerList());
    }

    @Test
    public void canCheckInPassengerToFlight(){
        flight.checkInPassenger(passenger);
        assertEquals(1, flight.countPassengerList());
    }
    @Test
    public void canAddNormalSizedBagToFlight(){
        double charge = flight.checkInBag(bag);
        assertEquals(0.00, charge, 0.01);
        assertEquals(1, flight.countBagList() );
    }

    @Test
    public void canAddOversizedBagToFlight() {
        Bag largeBag = new Bag(24.00);
        double charge = flight.checkInBag(largeBag);
        assertEquals(5.00, charge, 0.01);
        assertEquals(1, flight.countBagList() );
    }

    @Test
    public void canRemoveBagFromFlight() {
        flight.checkInBag(bag);
        flight.removeBag(bag);
        assertEquals(0, flight.countBagList());
    }

    @Test
    public void canRemoveAllBagFromFlight() {
        flight.checkInBag(bag);
        flight.checkInBag(bag);
        flight.removeAllBags();
        assertEquals(0, flight.countBagList());
    }

    @Test
    public void canRemovePassenger(){
        flight.checkInPassenger(passenger);
        flight.removePassenger(passenger);
        assertEquals(0, flight.countPassengerList());
    }

    @Test
    public void cantRemovePassengerNonExistant(){
        flight.checkInPassenger(passenger);
        flight.removePassenger(new Passenger());
        assertEquals(1, flight.countPassengerList());
    }

    @Test
    public void canRemoveAllPassengers() {
        flight.checkInPassenger(passenger);
        flight.checkInPassenger(passenger);
        flight.checkInPassenger(passenger);
        flight.checkInPassenger(passenger);
        flight.removeAllPassenger();
        assertEquals(0, flight.countPassengerList());
    }

}
