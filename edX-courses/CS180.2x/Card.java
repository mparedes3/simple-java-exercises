public class Card {
    private String name;
    private String nationality;
    private int yearBorn;
    private int yearDied;

    Card (String name, String nationality, int yearBorn, int yearDied){
        this.name = name;
        this.nationality = nationality;
        this.yearBorn = yearBorn;
        this.yearDied = yearDied;
    }

    public int compareTo (Card card){
        if (this.name.equals(card.name))
            return 0;
        else if (this.name.charAt(0) == card.name.charAt(0)){
            for (int i = 1; i < this.name.length(); i++){
                if (this.name.charAt(i) < card.name.charAt(i))
                    return 1;
                if (this.name.charAt(i) > card.name.charAt(i))
                    return -1;
            }
        }else if (this.name.charAt(0) < card.name.charAt(0))
            return 1;

            return -1;
    }

    public String toString (){
        if (yearDied == -1)
            return name + " (" + yearBorn + "-present) - " + nationality;

        return name + " (" + yearBorn + "-" + yearDied + ") - " + nationality;
    }
}
