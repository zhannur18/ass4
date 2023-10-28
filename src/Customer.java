// Concrete Observer
class Customer implements CustomerObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String dishName) { // Customer receives a notification about the new dish
        System.out.println(name + ": Received notification - New dish available: " + dishName);
    }
}

