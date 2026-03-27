class Service {
    String name;
    double cost;

    Service(String n, double c) { name = n; cost = c; }
}

public class UseCase7AddOnServiceSelection {
    public static void main(String[] args) {

        Service s1 = new Service("Food", 500);
        Service s2 = new Service("Spa", 1000);

        System.out.println("Total: " + (s1.cost + s2.cost));
    }
}