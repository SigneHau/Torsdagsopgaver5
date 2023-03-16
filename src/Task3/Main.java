package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//3g In your main method, instantiate at least three different rooms.
        Room room1 = new Room(5, 8, 14);
        Room room2 = new Room(2, 1, 2);
        Room room3 = new Room(10, 1, 1);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        //3.i In your main method, instantiate a new building.

        Building building = new Building(rooms, 2, 4, 1);
        int totalLamps = countLampsInBuilding(building);
        System.out.println(totalLamps);
        boolean test = isNormal(building);
        System.out.println(test);
        // 3.k create another static method in Main, isNormal, that takes an object of type Building.
    }

        //3.j create a static method in Main, countLampsInBuilding, that takes an object of type Building, and returns the total number of lamps in the entire building.
        public static int countLampsInBuilding(Building building){
            int sum = 0;
            for (Room r : building.getRooms()) {
                sum = sum + r.getNumberOfLamps();
            }
            return sum;
        }

    static boolean isNormal(Building building) {
        if (building.getNumberOfFloors()> building.getRooms().size()) {
            return true;
        } else {

            System.out.println("This is an odd building");
            return false;
        }
    }
}




