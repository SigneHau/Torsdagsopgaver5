package Task3;
//3.a make i class called Room with fields
public class Room {

    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;
    // 3. b Making the constructor with all the fields
    public Room (int numberOfDoors, int numberOfLamps, int numberOfWindows){
        this.numberOfDoors= numberOfDoors;
        this.numberOfLamps= numberOfLamps;
        this.numberOfWindows= numberOfWindows;
    }

    // 3.c Creating getters() methods
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
   public int getNumberOfLamps() {
      return numberOfLamps;
  }
   public int getNumberOfWindows(){
        return numberOfWindows;
    }



}
