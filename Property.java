/**
 * this is the superclass for a family of different types of the properties
 * it contains everything that is common to all kinds of properties
 * things that are common to all properties:
 * id, address, city, state, zip, bed, desc, bath and cost
 * compareTo is used to compare property id
 * @author gratapa
 */

public class Property implements Comparable{
    private String id,address,city,state,zip,bed,desc;
    private double bath, cost;

    public String getId() {
        return id;
    }

    public void setId(String id) {              //i was not sure if i was adding the correct variables
        this.id = id;                           // for property : bed bath ?? it worked. but idk if it was right
    }                                           // per instructions.

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public double getBath() {
        return bath;
    }

    public void setBath(double bath) {
        this.bath = bath;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Property(){
        id = "";
        address = "";
        city = "";
        state = "";
        zip = "";
        bed = "";
        bath = 0;
        cost = 0;
        desc = "";
    }

    public Property(String id,String address,String city,String state,String zip,String bed,double bath,double cost,String desc) {
        setId(id);
        setAddress(address);
        setCity(city);
        setState(state);
        setZip(zip);
        setBed(bed);
        setBath(bath);
        setCost(cost);
        setDesc(desc);
    }
    
    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s",id,address,city,state,zip,bed,bath,cost,desc);
    }

    @Override
    public int compareTo(Object other) {
        Home s = (Home) other;
        String id = getId();                            //i almost gave up and deleted my entire function
        String otherid = s.getId();                     // then i realized i forgot the s. in this line D:
        return id.compareTo(otherid);                   // i could not figure out why it was not working.
    }
}
