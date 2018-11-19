package behavioral.interpreter;

public class Context {
    Expression evaluate(String expression) {
        int position = expression.length() - 1;
        while (position > 0) {
            if (Character.isDigit(expression.charAt(position))) {
                position--;
            } else {
                Expression left = evaluate(expression.substring(0, position));
                Expression right = new NumberExpression(Integer.parseInt(expression.substring(position + 1)));
                char operator = expression.charAt(position);

                if (operator == '+') {
                    return new PlusExpression(left, right);
                } else if (operator == '-') {
                    return new MinusExpression(left, right);
                }
            }
        }

        return new NumberExpression(Integer.valueOf(expression));
    }
}
