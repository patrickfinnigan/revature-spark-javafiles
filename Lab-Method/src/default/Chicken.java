public class Chicken {

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        chicken.talk();

        String person = "Patrick";
        chicken.greetHuman(person);

        int numOfEggs = chicken.countEggs(25, 20);
        System.out.println(numOfEggs);
    }

    public void talk() {
        System.out.println("cluck cluck cluck");
    }

    public void greetHuman(String name) {
        System.out.println("cluck cluck buckaw " + name);
    }

    public int countEggs(int eggsLaid, int eggsEaten) {
        return eggsLaid - eggsEaten;
    }
}