public class ShippingCostCalculator implements ShippingVisitor {
    private double totalShippingCost;

    public double getTotalShippingCost() {
        return totalShippingCost;
    }

    public void visit(Chair chair) {
        double weight = chair.getWeight();
        double shippingCost = weight * 0.5;
        totalShippingCost += shippingCost;
    }

    public void visit(Sofa sofa) {
        double volume = sofa.getLength() * sofa.getWidth() * sofa.getHeight();
        double shippingCost = volume * 0.1;
        totalShippingCost += shippingCost;
    }
}