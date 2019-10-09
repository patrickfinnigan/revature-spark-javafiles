import java.util.Arrays;
public class Example1 {
    public static void main (String[] args){
        int[] val = {134, 542, 23, 4, 125, 7, 23, 12495};
        System.out.println(getFirst(val));

        String[] valString = {"Cat", "Apple", "Car"};
        System.out.println(getFirst(valString));
    }

    public static int getFirst(int[] input) {
        if (input == null || input.length == 0) return -1;
        Arrays.sort(input);
        return input[0];
    }

    public static String getFirst(String[] input) {
        if (input == null || input.length == 0) return "";
        Arrays.sort(input);
        return input[0];
    }
}