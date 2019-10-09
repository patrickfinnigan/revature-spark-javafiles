import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        Scanner in = new Scanner(System.in);
        int menuSelection;

        System.out.println("Please select an option:");
        System.out.println("1. Cups to Teaspoons");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. US Gallons to Imperial Gallons");
        System.out.println("4. Quit");
        menuSelection = in.nextInt();
        if (menuSelection == 1) {
            int cups;
            System.out.println("You selected cups to teaspoons");
            System.out.println("How many cups would you like to convert?");
            cups = in.nextInt();
            int teaspoons = cups * 48;
            System.out.println("I think " + cups + " cups is about " + teaspoons + " teaspoons!");
        } else if (menuSelection == 2) {
            int miles;
            System.out.println("You selected Miles to Kilometers!");
            System.out.println("How many miles would you like to convert?");
            miles = in.nextInt();
            Double kilometers = miles * 1.609;
            System.out.println("Reckon that " + miles + " miles is " + kilometers + " kilometers, give or take.");
        } else if (menuSelection == 3) {
            int usGallons;
            System.out.println("You selected US Gallons to Imperial Gallons!");
            System.out.println("How many gallons would you like to convert?");
            usGallons = in.nextInt();
            Double imGallons = usGallons / 1.201;
            System.out.println(usGallons + " US gallons is more or less " + imGallons + " Imperial gallons, but don't quote me on that.");
        } else {
            System.out.println("See ya!");
        }
        // System.out.println("Hello, " + name + "!");
        // int age;
        // System.out.println("How old are you?");
        // age = in.nextInt();
        // System.out.println("Dang, " + age + " is old");
    }
}