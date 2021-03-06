import java.util.Scanner;

public class LeapYear{

  public static boolean isLeapYear(int year){
    if ((year / 4) % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
    
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Please insert a leap year!");
    int year = s.nextInt();
    if (isLeapYear(year)){
      System.out.println("The year " + year + " is a leap year.");
    }else {
      System.out.println("The year " + year + " is not a leap year.");
    }
  }

}