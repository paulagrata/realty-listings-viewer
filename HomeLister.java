import java.util.ArrayList;

/* 
 * HomeLister - library-style class
 * static function called listHomes
 *  listHomes - prints the homes stored in the ArrayList it receives
 * report will print like the sample output
 * the homes are sorted by their MLS number with Collections.sort in 
 * the main class realityrealty.java and compareTo in property.java
 * @author gratapa
*/

public class HomeLister {
    
    public static void listHomes(ArrayList<Home> homes) {
        for (Home home : homes) {
            System.out.printf("\nProperty #%s      Price: $%,.2f      Sq. Feet: %.2f       Beds: %s Baths: %.2f \n", home.getId(),home.getCost(),home.totalArea(home.getRooms()),home.getBed(),home.getBath());
            System.out.printf("Address        %s, %s, %s %s\n", home.getAddress(),home.getCity(),home.getState(),home.getZip());
            System.out.printf("Description    %s\n", home.getDesc());
            System.out.println("Rooms");
            for (Room rm: home.getRooms()) {
                System.out.printf("  %-15s%8s X %s\n", rm.getRmName(),rm.getlength(),rm.getwidth());
                }
            }
         }
    }
