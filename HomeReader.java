
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


/* 
 * this class has a function that reads a text file of properties
 * readHomesFromFile - static functionthat returns an ArayList of Home objects
 * creates the Home objects based on what it reads from the file that was passed in
 * will return null if it could not read the file correctly
 * @author gratapa
*/

public class HomeReader {
    public static ArrayList<Home> readHomesFromFile(String fname) {
        ArrayList<Home> list = new ArrayList<Home>();
        String line;
        String[] parts;
        String id,address,city,state,zip,bed,desc,rmName;
        double length, width,cost, bath;
        Home currentHome = null;
        Room rm;
            try {
                Scanner fsc = new Scanner(new File(fname));
                while (fsc.hasNextLine()) {
                    line = fsc.nextLine();
                    if (line.startsWith("MLS")){
                            parts = line.split("\t");
                            id = parts[0];
                            address = parts[1];
                            city = parts[2];  
                            state = parts[3];
                            zip = parts[4];                             //i didnt make all the numbers int/double bc i thought the strings
                            bed = parts[5];                             //worked fine for this example.
                            bath = Double.parseDouble(parts[6]);
                            cost = Double.parseDouble(parts[7]);
                            desc = parts[8];
                            currentHome = new Home(id,address,city,state,zip,bed,bath,cost,desc);
                            list.add(currentHome);
                         } else if (line.startsWith("")){
                            parts = line.split("\t");
                            rmName = (parts[1]);
                            length = Double.parseDouble(parts[2]);
                            width = Double.parseDouble(parts[3]);
                            rm = new Room(rmName,length,width);
                            currentHome.addRoom(rm);
                        }
                } fsc.close();
            } catch (Exception ex) {
                return null;
        } return list;
    }
}