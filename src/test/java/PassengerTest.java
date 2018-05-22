import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;
    Flight flight;
    Bag bag;

    @Before
    public void before(){
        passenger = new Passenger() ;
        bag = new Bag(15.00);
    }

    @Test
    public void canGetBags(){
        assertEquals(0, passenger.getBags().size());
    }

    @Test
    public void canCountBags(){
        assertEquals(0, passenger.countBags());
    }


    @Test
    public void canAddBagToPassenger(){
        passenger.addBag(bag);
        assertEquals(1, passenger.countBags());
    }




}
