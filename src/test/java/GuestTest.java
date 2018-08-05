import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {// ClASS OPEN

    Guest guestx;

    @Before
    public void before(){ // OPEN BEFORE
        guestx = new Guest("Tom", "Thumb");
    }// CLOSE BEFORE


    @Test
    public void canCreateGuest(){
        assertEquals("Tom", guestx.getFirstName());

    }



} // CLASS CLOSE
