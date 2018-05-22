public class Bag {
    
    private double weight;
    
    public Bag(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isOversized() {
        return this.weight > 23.00;
    }
}
