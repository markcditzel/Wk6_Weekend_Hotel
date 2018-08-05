import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotelx;
    Guest guestx;

    @Before
    public void setup() {
        hotelx = new Hotel("Bates Motel");
        guestx = new Guest("Mark", "Ditzel", Nationality.UK);
    }

    /**
     * Can we create a Hotel object with a name
     */
    @Test
    public void canCreateAndNameHotel() {
        assertEquals("Bates Motel", hotelx.getName());
    }

    /**
     * Can we check to see if the Guest ArrayList (CheckedInGuests) is empty
     */
    @Test
    public void isGuestArrayListEmpty() {
        assertEquals(0, hotelx.getGuestCount());
    }

    /**
     * Can a guest onbject be added to the Guest ArrayList (CheckedInGuests)
     */

    @Test
    public void canAddGuestToArrayListCheckInGuest() {
        hotelx.checkInGuest(guestx);
        assertEquals(1, hotelx.getGuestCount());

    }

}
