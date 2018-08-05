public class DiningRoom extends Room{

    // Unique Properties / Instance Variables for DayRoom class
    String name;

    //Constructor
    public DiningRoom(int capacity, String decor, String name, double dailyRate){
        super(capacity, decor);
        this.name = name;
    }

}