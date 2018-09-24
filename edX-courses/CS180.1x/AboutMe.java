public class AboutMe{
                   
 String name;
 
 AboutMe (String name){
  this.name = name;
 }
 
 String myName(){
  return "Marco";
 }
 
 String mySchool(){
  return "Olympian High School";
 }
 
 int myAge(){
  return 16;
 }
 
 public static void main (String [] args){
   AboutMe m = new AboutMe("Marco");
  
  System.out.print("My name is " + m.myName());
   System.out.print(", and I attend " + m.mySchool() + ".");
   System.out.println(" I am " + m.myAge() + " years old.");
   
  
  
 }
}