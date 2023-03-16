package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    // 1 b lav en konstruktor med kundes navn og brugernavn som parameter
    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;

    }

    // Getters metoder
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    //laver en toString der printer kundernes navne pænt ud
    public String toString() {

        return getFirstName() + " " + getLastName() + ":" + getUserName();
    }


}


