public class BaseballCard {
    String name; // the name of the player on the card.
    int year; // the year the card was issued.

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
    public String toString(){
        return "Player" + name + "Year" + year;
    }
    //used internet to help overide equals 
    public boolean equals (Object obj){
        if(this==obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false;
        BaseballCard other = (BaseballCard) obj;
        return this.year == other.year && this.name.equals(other.name);

    }


}