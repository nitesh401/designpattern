package builder;

public class Main {
    public static void main(String[] args) {
        // Example 1: Order with all items
        FoodOrder fullOrder = new FoodOrder.Builder("Burger")
                .setDrink("Coke")
                .setDessert("Ice Cream")
                .setSides("Fries")
                .build();

        System.out.println(fullOrder);

        // Example 2: Order with only main item and drink
        FoodOrder simpleOrder = new FoodOrder.Builder("Pizza")
                .setDrink("Pepsi")
                .build();

        System.out.println(simpleOrder);
    }
}
