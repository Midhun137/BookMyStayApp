import java.util.*;

class RoomInventory {
    private Map<String, Integer> rooms = new HashMap<>();

    public RoomInventory() {
        rooms.put("Single Room", 5);
        rooms.put("Double Room", 3);
        rooms.put("Suite Room", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return rooms;
    }

    public void updateAvailability(String type, int value) {
        rooms.put(type, value);
    }
}

public class UseCase3InventorySetup {
    public static void main(String[] args) {

        RoomInventory inv = new RoomInventory();

        System.out.println(inv.getRoomAvailability());
    }
}