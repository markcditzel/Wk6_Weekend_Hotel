import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {// ClASS OPEN

    Guest guestx;

    @Before
    public void setup(){ // OPEN BEFORE
        guestx = new Guest("Tom", "Thumb", Nationality.UK);
    }// CLOSE BEFORE


    @Test
    public void canCreateGuestAndGetFirstName(){
        assertEquals("Tom", guestx.getFirstName());
    }

    @Test
    public void canCreateGuestAndGetSecondName(){
        assertEquals("Thumb", guestx.getSecondName());
    }

    @Test
    public void canRetrieveNationality(){
        assertEquals("United Kingdom", guestx.getNationality());
    }



} // CLASS CLOSE
