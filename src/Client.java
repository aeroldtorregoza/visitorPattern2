public class Client {
    public static void main(String[] args) {
        Furniture[] furnitureItems = {
                new Chair(10),
                new Sofa(2, 3, 4)
        };

        ShippingCostCalculator calculator = new ShippingCostCalculator();

        for (Furniture furniture : furnitureItems) {
            furniture.accept(calculator);
        }

        double totalShippingCost = calculator.getTotalShippingCost();
        System.out.println("Total shipping cost: $" + totalShippingCost);
    }
}
