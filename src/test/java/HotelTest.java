import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotelx;

    @Before
    public void setup(){
        hotelx = new Hotel("Bates Motel");
    }

    /** Can we create a Hotel object with a name */
    @Test
    public void canCreateAndNameHotel(){
        assertEquals("Bates Motel", hotelx.getName());
    }

    /** Cane we check to see if the Guest ArrayList (CheckedInGuests) is empty */
    @Test
    public void isGuestArrayListEmpty(){
        assertEquals(0, hotelx.getGuestCount());
    }


//    @Test
//    public void canAddGuestToArrayListCheckInGuest(){
//
//    }

//    /** Test the contents of the rooms ArrayList starts as 0 */
//    @Test
//    public void doesRoomsArrayListStartEmpty(){
//        assertEquals(0, hotelx.getRoomCount);
//    }
}
