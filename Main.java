import java.util.Scanner; 
/**
 *
 * @author  
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
// create a scanner for user input
Scanner input = new Scanner(System.in); 
 //create variable for user input
   System.out.println("Please enter a positive integer to determine its factors");
   int number = input.nextInt(); 
   System.out.println("The factors of " + number +  " are:");   

int count = 1;
while(number >= count){
  count = count + 1;
if(number % count == 0){
   System.out.println( + count);
}
 
}


  }
}
