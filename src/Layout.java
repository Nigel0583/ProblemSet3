public class Layout {
    private int floors;
    private int rooms;

    public Layout()
    {
        floors = 0;
        rooms = 0;
    }

    public Layout(int floors,int rooms)
    {
        setFloors(floors);
        setRooms(rooms);
    }

    private void setRooms(int rms) {rooms = rms ;}

    private void setFloors(int flrs){floors = flrs;}


    public void setLayout(int floors, int rooms) {
            setRooms(rooms);
            setFloors(floors);
    }

    @Override
    public String toString() {
        return  "Number of floors: " +floors+ "\nNumber of Rooms: " +rooms;
    }
}
