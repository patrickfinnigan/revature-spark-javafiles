public class StringMethods {
    public static void main(String[] args) {
        String string = "Patrick";
        String text = new String("Patrick");
        System.out.println(string.equals(text));
        System.out.println(string == text);
        String longString = "supercalifragilisticexpialidocious";
        System.out.println(longString.length());
        System.out.println(longString.indexOf('c'));
        System.out.println(longString.indexOf('q'));

        char[] longStringArray = longString.toCharArray();
        String letterIString = "i";
        int count = 0;
        for (char ele : longStringArray) {
            if (letterIString.indexOf(ele) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }

}