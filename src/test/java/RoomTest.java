//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.assertEquals;
//
////PROPERTIES
//
//public class RoomTest {
//
//    Hotel hotelx;
//    Guest guestx;
//    Room roomx;
//
//    @Before
//    public void steup() {
//        hotelx = new Hotel("Bates Motel");
//        guestx = new Guest("Mark", "Ditzel", Nationality.UK);
//        roomx = new Room(2, "RoughLux");
//    }
//
//    /** Can we create a room and check its capacity*/
//    @Test
//    public void canCreateRoomAndCheckCapacity(){
//        assertEquals(2, roomx.getCapacity());
//    }
//
//    /** Can we add a guest to the room
//     * This requires calling Hotel method to remove a guest object from the arrayList
//     * Then add that guest object to the room's arrayList   */
//    @Test
//    public void canAddGuestToRoom(){
//        ArrayList<Guest> guestlist = hotelx.getCheckedInGuests();
//        Guest guesty = guestlist.remove(0);
//
//
//    }
//
//}
