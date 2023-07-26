/**
 * defines room class
 * it contains everything that is common to rooms
 * things that are common to rooms:
 * rmName, length, width, area
 * setArea() is used to multiple length and width to find area
 * @author gratapa
 */

public class Room {
    private String rmName;
    private double length, width, area;

    public String getRmName() {
        return rmName;
    }

    public void setRmName(String rmName) {
        this.rmName = rmName;
    }

    public double getlength() {
        return length;
    }

    public void setlength(double length) {
        this.length = length;
    }

    public double getwidth() {
        return width;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double length, double width) {      //i was not sure if this should be a @override
        area = length * width;                              //getArea() function like the example
    }                                                       //sarah breslin helped me with the area 
                                                            //and this seemed to work so i kept it

    public Room(){
        rmName = "";
        width = 0;
        length = 0;
        area = 0.00;
    }

    public Room(String rmName, double length, double width){
        setRmName(rmName);
        setlength(length);
        setwidth(width);
        setArea(length,width);
    }
    

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s",rmName,length,width);
    }
}
