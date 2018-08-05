public class ConferenceRoom extends Room {

    // Unique Properties / Instance Variables for DayRoom class
    String name;
    double dailyRate;

    //Constructor
    public ConferenceRoom(int capacity, String decor, String name, double dailyRate){
        super(capacity, decor);
        this.name = name;
        this.dailyRate = dailyRate;
    }


}