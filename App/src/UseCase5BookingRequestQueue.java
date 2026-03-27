import java.util.*;

class Reservation {
    private String name;
    private String type;

    public Reservation(String n, String t) {
        name = n;
        type = t;
    }

    public String getGuestName() { return name; }
    public String getRoomType() { return type; }
}

class BookingRequestQueue {
    private Queue<Reservation> q = new LinkedList<>();

    public void addRequest(Reservation r) { q.add(r); }
    public Reservation getNextRequest() { return q.poll(); }
    public boolean hasPendingRequests() { return !q.isEmpty(); }
}

public class UseCase5BookingRequestQueue {
    public static void main(String[] args) {

        BookingRequestQueue q = new BookingRequestQueue();

        q.addRequest(new Reservation("Abhi", "Single"));

        while (q.hasPendingRequests()) {
            Reservation r = q.getNextRequest();
            System.out.println(r.getGuestName());
        }
    }
}