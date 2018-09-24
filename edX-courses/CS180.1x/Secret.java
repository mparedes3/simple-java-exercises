/**
 * @author: Marco Paredes
 * Program allows user to guess a word and checks if it is correct.
 */


import java.util.Scanner;

public class Secret{
  public static void main(String[] args){
    userGuess();
  }
  
  public static void userGuess(){
    Scanner read = new Scanner(System.in);
    System.out.println("Guess a word!");
    String word = read.next();
    String secret = "Apple";
    
    guessCorrectly(word, secret);
  }
  
  public static void guessCorrectly(String word, String secret){
    if (word.equals(secret)){
      System.out.println("Wow! You guessed the word correctly!");
    } else{
      System.out.println("Aww... try guessing again!");
      System.err.print("HINT: IT IS A RED FRUIT. \n\n");
      userGuess();
    }
  }
}