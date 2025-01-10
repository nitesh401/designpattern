package builder;

class FoodOrder {
    private String mainItem;
    private String drink;
    private String dessert;
    private String sides;

    // Private constructor
    private FoodOrder(Builder builder) {
        this.mainItem = builder.mainItem;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.sides = builder.sides;
    }

    // Getters
    public String getMainItem() { return mainItem; }
    public String getDrink() { return drink; }
    public String getDessert() { return dessert; }
    public String getSides() { return sides; }

    @Override
    public String toString() {
        return "FoodOrder{" +
                "mainItem='" + mainItem + '\'' +
                ", drink='" + drink + '\'' +
                ", dessert='" + dessert + '\'' +
                ", sides='" + sides + '\'' +
                '}';
    }

    // Builder class
    public static class Builder {
        private String mainItem;  // Required
        private String drink;
        private String dessert;
        private String sides;

        public Builder(String mainItem) {
            this.mainItem = mainItem;
        }

        public Builder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder setSides(String sides) {
            this.sides = sides;
            return this;
        }

        public FoodOrder build() {
            return new FoodOrder(this);
        }
    }
}
