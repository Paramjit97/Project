package Jan21;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant res = new Restaurant() {
            @Override
            public void cook() {
                System.out.println("Cooking...");
            }
        };
        res.cook();
    }
}
