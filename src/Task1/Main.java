package Task1;
import java.util.ArrayList;
//1c


public class Main {

    public static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {

        customers.add(new Customer("Signe", "Hau", "SKBH"));
        customers.add(new Customer("Mette", "Garling", "MBG"));
        customers.add(new Customer("Ole", "Hau", "Oha"));
        customers.add(new Customer("Jacob", "Brandt", "JKB"));
        customers.add(new Customer("Sus", "Brandt", "SKB"));
        customers.add(new Customer("Sofus", "Hau", "SH"));
        // 1 d. kalder metoden
        printCustomers();
    }
    // 1 d. En metode der printer alle kunder ud ved at gennemløbe customers med for each loopet.
    public static void printCustomers() {
        for (Customer i : customers) {
            System.out.println(i.toString());
        }
    }
}