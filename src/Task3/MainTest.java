package Task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;



class MainTest {

    @Test
    void countLampsInBuilding() {
        Room room1 = new Room(5, 8, 14);
        Room room2 = new Room(2, 1, 2);
        Room room3 = new Room(10, 1, 1);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms, 2, 4, 1);
        assertEquals(10, Main.countLampsInBuilding(building) );
    }

    @Test
    void isNormal() {
        Room room1 = new Room(5, 8, 14);
        Room room2 = new Room(2, 1, 2);
        Room room3 = new Room(10, 1, 1);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        //3.i In your main method, instantiate a new building.

        Building building = new Building(rooms, 2, 4, 1);
        assertEquals(true, Main.isNormal(building) );

    }
}