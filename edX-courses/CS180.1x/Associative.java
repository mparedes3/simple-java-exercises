/**
 * @author Marco Paredes
 * This simple class does some arithmetic
 */

import java.util.Scanner;

public class Associative{

  int x, y, z;
  
  Associative(int x, int y, int z){
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  int firstTwo(){
    return (x + y) * z;
  }
  
  int lastTwo(){
    return x + (y * z);
  }
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = scanner.nextInt();
    
    Associative a = new Associative(x, y, z);
    System.out.println("Grouping the first two terms, (" + x + " + " + y + ") * " + z + " = " + a.firstTwo());
    System.out.println("Grouping the last two terms, " + x + " + (" + y + " * " + z + ") = " + a.lastTwo());
  }
}