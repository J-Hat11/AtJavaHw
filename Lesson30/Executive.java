public class Executive extends Manager {
    private double shares;

    public Executive(String name, double salary, double bonus, double shares){
        super(name, salary, bonus);
        this.shares = shares;
    }
    public double GetShares(){
        return shares;
    }
    public void SetShares(double shares){
this.shares = shares;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Shares: " + shares);
    }
}
