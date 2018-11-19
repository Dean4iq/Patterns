package behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression expression = new Context().evaluate("-12+0+999-99");
        System.out.println(expression.interpret());
    }
}
