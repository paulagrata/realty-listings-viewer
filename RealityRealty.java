import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * the main class that contains the main function
 * asks the user to enter the name of the file
 * asks HomeReader to read it 
 * uses HomeLister to print the report
 * Collections.sort is used to sort the list
 * uses compareTo in property.java to sort
 * @author gratapa
 */

public class RealityRealty{

       public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          String choice;
          System.out.print("Enter name of homes database: ");               
	     choice = sc.next();       
          System.out.print("\n***********************************HOMES CURRENTLY FOR SALE***********************************\n");  
          ArrayList<Home> list = HomeReader.readHomesFromFile(choice);
          Collections.sort(list);
          HomeLister.listHomes(list);
          sc.close();
       } 
           
}