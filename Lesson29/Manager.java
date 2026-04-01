public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus){
        super(name,salary);
        this.bonus = bonus;
    }
        public double getAnnualIncome(){
            return getSalary() + bonus;
        }
        //test
    public static void main(String[] args) {
    Manager jack = new Manager("Jackson", 110, 120);
    System.out.println("Income: " + jack.getAnnualIncome());
}
    }

