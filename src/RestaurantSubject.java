// Subject Interface
interface RestaurantSubject {
    void registerObserver(CustomerObserver observer); // Register a customer as an observer
    void removeObserver(CustomerObserver observer); // Remove a customer from observers
    void notifyObservers(String dishName); // Notify all registered customers about a new dish
}