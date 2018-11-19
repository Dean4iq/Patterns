package behavioral.templateMethod;

public class A extends C{
    void method(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }


    @Override
    protected void anotherDiffer() {
        System.out.println("End of A");
    }

    @Override
    void differ() {
        System.out.println("2");
    }
}
