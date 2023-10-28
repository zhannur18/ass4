public class ObserverPatternE {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Customer alice = new Customer("Asel");
        Customer bob = new Customer("Nur");

        restaurant.registerObserver(alice);
        restaurant.registerObserver(bob);

        restaurant.prepareDish("Spaghetti Bolognese");
        restaurant.removeObserver(bob);

        restaurant.prepareDish("Margherita Pizza");
    }
}

