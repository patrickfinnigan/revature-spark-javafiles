public class Example1 {
    public static void main(String[] args) {
        String val = stringReturn(); //2. main method runs stringReturn in val
        System.out.println(val); //3. main method prints the string made inside val
    }

    public static String stringReturn() {
        return "Hello"; //1. method generates string
    }
}