import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotelx;

    @Before
    public void setup(){
        hotelx = new Hotel("Bates Motel");
    }

    @Test
    public void canCreateAndNameHotel(){
        assertEquals("Bates Motel", hotelx.getName());
    }
}
