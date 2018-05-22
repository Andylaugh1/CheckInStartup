import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagTest {

    private Bag bag;

    @Before
    public void before() {
        bag = new Bag(10.00);
    }

    @Test
    public void hasWeight() {
        assertEquals(10.00, bag.getWeight(), 0.01);
    }

    @Test
    public void canCheckIfOverSizedFalse(){
        assertEquals(false, bag.isOversized());
    }

    @Test
    public void canCheckIfOverSizedTrue(){
        Bag bag = new Bag(25.00);
        assertEquals(true, bag.isOversized());
    }

}
