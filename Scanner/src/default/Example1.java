import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";

        result = scanner.nextLine();

        scanner.close();

        System.out.println("Result: " + result);
    }
}