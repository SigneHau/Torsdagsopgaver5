package Task2;
// 2c Create a new class calles Cafe and give a arrayList


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    ArrayList<String> coffeeMenu = new ArrayList<>();

    //2.c add a method  - have it load the coffes.txt file
    public void loadMenuData(){
       File file = new File("coffees.txt");

    //2.d In this step you will read from the file, using a Scanner object: Add the file instance to a new Scanner object.
       try{
        Scanner scan = new Scanner(file);
        //2.e Inside the try block from the last step, you will now add this piece of code that loops over the lines of the textfile:

           while(scan.hasNextLine()){
               coffeeMenu.add(scan.nextLine());
           }

       }catch (FileNotFoundException e) {
           System.out.println("The file was not found");
       }

    }



}
