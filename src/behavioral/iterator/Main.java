package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Iterator iterator = new Tasks().getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
