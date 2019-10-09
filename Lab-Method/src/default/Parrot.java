public class Parrot {

    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.talk();

        String[] words = { "Howdy", "Polly", "wanna", "cracker" };
        parrot.repeat(words);

        int crackersLeft = parrot.countCrackers(10, 11);
        System.out.println(crackersLeft);
    }

    public void talk() {
        System.out.println("CLICK CLICK WHOO HOO HELLO");
    }

    public void repeat(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    public int countCrackers(int crackersGiven, int crackersTaken) {
        return crackersGiven - crackersTaken;
    }
}