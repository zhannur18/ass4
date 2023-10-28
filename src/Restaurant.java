// Concrete Subject
import java.util.ArrayList;
import java.util.List;
class Restaurant implements RestaurantSubject {
    private List<CustomerObserver> customers;
    private String currentDish;// Current dish being prepared

    public Restaurant() {
        this.customers = new ArrayList<>();
    }

    public void prepareDish(String dishName) {
        // Restaurant prepares a new dish
        System.out.println("Preparing " + dishName);
        currentDish = dishName;
        notifyObservers(dishName);
    }

    @Override
    public void registerObserver(CustomerObserver observer) {
        // Register a customer as an observer
        customers.add(observer);
    }

    @Override
    public void removeObserver(CustomerObserver observer) {
        // Remove a customer from the list of observers
        customers.remove(observer);
    }

    @Override
    public void notifyObservers(String dishName) {
        // Notify all registered customers about the new dish

        for (CustomerObserver customer : customers) {
            customer.update(dishName);
        }
    }
}

