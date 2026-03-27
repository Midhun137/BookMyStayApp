import java.util.*;

class RoomSearchService {
    public void search(RoomInventory inv) {
        Map<String, Integer> a = inv.getRoomAvailability();

        if (a.get("Single Room") > 0)
            System.out.println("Single Room Available");

        if (a.get("Double Room") > 0)
            System.out.println("Double Room Available");

        if (a.get("Suite Room") > 0)
            System.out.println("Suite Room Available");
    }
}

public class UseCase4RoomSearch {
    public static void main(String[] args) {
        RoomInventory inv = new RoomInventory();
        new RoomSearchService().search(inv);
    }
}