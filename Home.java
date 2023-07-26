import java.util.ArrayList;

/*
 * defines the Home class that extends Property 
 * adds all the characteristics that are unique to homes
 * findArea() function - determine the square footage.
 * ArrayList of Room objects
 * @author gratapa
*/

public class Home extends Property{
    private ArrayList<Room> rooms;
    private double area;

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room rm) {
        rooms.add(rm);
    }    

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double totalArea(ArrayList<Room> rooms){
        for (Room rm: rooms) {
            area = area + rm.getArea();
        }
        return area;
    }

    public Home(){
        rooms = null;
        area = 0;
    }

    public Home(String houseType, String address, String city, String state, String zip, String bed, double bath, double cost, String desc) {
        super(houseType, address, city, state, zip, bed, bath, cost, desc);
        rooms = new ArrayList<Room>();  
        setRooms(rooms);                                                        // this part confused me. was this needed?
        setArea(area);                                                          // i could not figure out what was the exact difference between
    }                                                                           // property besides keeping the property details seperated from the
                                                                                // adding roooms / finding area 
    @Override                                                                   // unless i did do the properties wrong and called the wrong varibles
    public String toString() {
        return String.format("%s", super.toString());
    } 

}
