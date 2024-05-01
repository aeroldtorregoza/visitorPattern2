public class Chair implements Furniture{
    private double weight;

    public Chair(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}
