import java.util.*;

class BookingHistory {
    List<Reservation> list = new ArrayList<>();

    void add(Reservation r) { list.add(r); }
}

public class UseCase8BookingHistoryReport {
    public static void main(String[] args) {

        BookingHistory h = new BookingHistory();
        h.add(new Reservation("Abhi", "Single"));

        for (Reservation r : h.list)
            System.out.println(r.getGuestName());
    }
}