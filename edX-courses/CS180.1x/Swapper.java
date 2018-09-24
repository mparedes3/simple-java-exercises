/**
 * @author: Marco Paredes
 * Progra suitable to compare values of two variable
 */
import java.util.Scanner;

public class Swapper{
  
  public static void input(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please insert an integer value: ");
    int x = scanner.nextInt();
    System.out.println("Please insert a bigger integer value: ");
    int y = scanner.nextInt();
    
    if (y < x){
      System.err.print("ERROR: PLEASE FOLLOW INSTRUCTIONS");
      System.out.println();
      input();
    }
  }
  
  public static void main (String[] args){
    input();
   
    
  }
}