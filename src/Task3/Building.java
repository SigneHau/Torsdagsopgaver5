package Task3;
import java.util.ArrayList;
//3.d Create a Building.java class with the following fields (use appropriate types):
public class Building {

    final ArrayList<Room> rooms ;
    int numberOfBathrooms;
    int numberOfFloors;
    int isOfficeBuilding;

    //3.e Create a constructor that populates all the fields above.
public Building(ArrayList <Room> rooms, int numberOfBathrooms, int numberOfFloors, int isOfficeBuilding){
    this.rooms=rooms;
    this.numberOfBathrooms=numberOfBathrooms;
    this.numberOfFloors=numberOfFloors;
    this.isOfficeBuilding=isOfficeBuilding;
    }

    public final ArrayList<Room> getRooms() {
        return rooms;
    }
    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }
    public int getNumberOfFloors(){
        return numberOfFloors;
    }

    public void setIsOfficeBuilding(int isOfficeBuilding) {
        this.isOfficeBuilding = isOfficeBuilding;
    }
}
