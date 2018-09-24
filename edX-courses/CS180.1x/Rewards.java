/** @author Marco Paredes
*/

public class Rewards {

  public int points;

  /** @param points int to record current point level
  */
  public Rewards(int points) {

   //TODO: constructor definition
   
   this.points = points;

  }

  /** @return String of possible choices
  */
  public String showRewards() {
   //TODO: showRewards definition
    if (points >= 5000){
      return "1) free coffee - 50 pts\n2) free baked good - 100 pts\n3) free specialty coffee - 200\n4) 1% store ownership - 5000";
    }else if (points >= 200){
      return "1) free coffee - 50 pts\n2) free baked good - 100 pts\n3) free specialty coffee - 200";
    }else if (points >= 100){
      return "1) free coffee - 50 pts\n2) free baked good - 100 pts";
    }else if (points >= 50){
      return "1) free coffee - 50 pts";
    }else{
      return "Not enough points!";
    }
  }

  /** @param choice int to
  *   @return String reward chosen
  */
  public String getReward(int choice){
    //TODO: getReward definition
    if (choice == 1 && points >= 50){
      points -= 50;
      return "You have selected a free baked good!";
    }else if (choice == 2 &&  points >= 100){
      points -= 100;
      return "You have selected a free baked good!";
    }else if (choice == 3 &&  points >= 200){
      points -= 200;
      return "You have selected a free specialty coffee!";
    }else if (choice == 4 &&  points >= 5000){
      points -= 5000;
      return "You have selected 1% store ownership!";
    }else{
      return "You do not have enough points for that reward.";
    }
  }
}
