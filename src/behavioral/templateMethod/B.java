package behavioral.templateMethod;

public class B extends C{
    void method(){
        System.out.println("1");
        System.out.println("4");
        System.out.println("3");
    }

    @Override
    protected void anotherDiffer() {
    }

    @Override
    void differ() {
        System.out.println("4");
    }
}
