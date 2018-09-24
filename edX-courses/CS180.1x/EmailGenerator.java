import java.util.Scanner;

public class EmailGenerator{

  public static String makeUserName(String a, String b){
    a = a.substring(0, 1);
    String c = a + b;
    return c.toLowerCase();
  }
  
  public static String makeEmail(String firstName, String lastName, String website){
    String fullName = makeUserName(firstName, lastName);
    return fullName + "@" + website;
  }
  
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    String firstName = scanner.next();
    String lastName = scanner.next();
    String website = scanner.next();
    String email = makeEmail(firstName, lastName, website);
    System.out.println("This user's email is: " + email);
    
  }
  
}