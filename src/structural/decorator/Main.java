package structural.decorator;

public class Main {
    public static void main(String[] args) {
        PrinterInterface printerInterface = new RightBracketDecorator(new LeftBracketDecorator(new QuotesDecorator(new Printer("something"))));
        printerInterface.print();

        System.out.println();

        PrinterInterface printerInterface1 = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("something"))));
        printerInterface1.print();

        System.out.println();

        PrinterInterface printerInterface2 = new LeftBracketDecorator(new RightBracketDecorator(new QuotesDecorator(new Printer("something"))));
        printerInterface2.print();
    }
}
