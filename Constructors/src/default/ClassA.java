public class ClassA{
    int id;

    public ClassA() {
        System.out.println("Inside the constructor");
        id = 1;
    }

    public ClassA(int inputId) {
        System.out.println("Inside the constructor" + id);
        id = inputId;
    }


    public static void main (String[] args) {
        ClassA A = new ClassA();
        System.out.println("After instantiation" + A.id);

        ClassA A2 = new ClassA(4);
        System.out.println("After instantiation" + A2.id);
    }
}