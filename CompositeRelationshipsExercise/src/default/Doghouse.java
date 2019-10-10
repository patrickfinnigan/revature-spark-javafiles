public class Doghouse {
    Dog d;

    public Doghouse() {
        d = new Dog();
        d.setName("Ralph");
    }

    public String getOwner() {
        return d.getName();
    }

    public static void main (String[] args) {
        Doghouse house = new Doghouse();
        house.d.talk();
        System.out.println("This hosue belongs to " + house.getOwner());
    }
}