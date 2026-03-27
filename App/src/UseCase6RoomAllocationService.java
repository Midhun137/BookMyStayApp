import java.util.*;

class RoomAllocationService {

    public void allocateRoom(Reservation r, RoomInventory inventory) {

        Map<String, Integer> a = inventory.getRoomAvailability();
        String type = r.getRoomType() + " Room";

        if (a.get(type) > 0) {

            String id = generateRoomId(r.getRoomType());

            inventory.updateAvailability(type, a.get(type) - 1);

            System.out.println("Booking confirmed for Guest: "
                    + r.getGuestName()
                    + ", Room ID: " + id);
        }
    }

    private Map<String, Integer> counter = new HashMap<>();

    private String generateRoomId(String type) {
        counter.put(type, counter.getOrDefault(type, 0) + 1);
        return type + "-" + counter.get(type);
    }
}

public class UseCase6RoomAllocationService {
    public static void main(String[] args) {

        RoomInventory inv = new RoomInventory();
        BookingRequestQueue q = new BookingRequestQueue();

        q.addRequest(new Reservation("Abhi", "Single"));

        RoomAllocationService s = new RoomAllocationService();

        while (q.hasPendingRequests()) {
            s.allocateRoom(q.getNextRequest(), inv);
        }
    }
}