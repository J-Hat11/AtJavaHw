package Zoo;

public class Bovine extends Mammal {
    private double hayConsumed;

    public Bovine(String name, double weight) {
        super(name, weight);
    }

    public void feedHay(double pounds) {
        hayConsumed = hayConsumed + pounds;
        this.hayConsumed =0;
    }

    public double getHayConsumed() {
        return hayConsumed;
    }
}
