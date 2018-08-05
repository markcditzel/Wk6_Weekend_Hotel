public enum RoomType {

    SINGLE(1, "Single"),
    DOUBLE(2, "Double"),
    FAMILY(4, "Family"),
    SUITE(6,"Suite");

    // Define structure of fields

    private int capacity;
    private String name;

    RoomType(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
    }

    public int getCapacity(){
        return capacity;
    }

    public String getName(){
        return name;
    }
}
