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
    public void canCreateGuestAndGetFirstName(){
        assertEquals("Tom", guestx.getFirstName());
    }

    @Test
    public void canCreateGuestAndGetSecondName(){
        assertEquals("Thumb", guestx.getSecondName());
    }


} // CLASS CLOSE
