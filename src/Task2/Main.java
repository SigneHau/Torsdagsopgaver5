package Task2;
// 2a - lavet fil med kaffenavne
public class Main {
// 2b - a class called main with the method

    //2.g
    public static Cafe cafe = new Cafe();
    public static void main(String[] args) {

     cafe.loadMenuData();

    for(String i :cafe.coffeeMenu){
        System.out.println(i);
    }

    }
}
