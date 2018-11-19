package behavioral.templateMethod;

public class Main {
    public static void main(String[] args) {
        C a = new A();
        a.templateMethod();

        C b = new B();
        b.templateMethod();
    }
}
