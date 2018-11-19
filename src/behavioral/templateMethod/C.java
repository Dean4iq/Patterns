package behavioral.templateMethod;

abstract class C {
    void templateMethod(){
        System.out.println("1");
        differ();
        System.out.println("3");
        anotherDiffer();
    }

    protected abstract void anotherDiffer();

    abstract void differ();
}
