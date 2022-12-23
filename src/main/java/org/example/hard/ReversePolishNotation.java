package org.example.hard;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Have the function reversePolishNotation(str) read str which will be an arithmetic expression
 * composed of only integers and the operators: +,-,* and /
 * and the input expression will be in postfix notation (Reverse Polish notation),
 * an example: (1 + 2) * 3 would be 1 2 + 3 * in postfix notation.
 * Your program should determine the answer for the given postfix expression.
 * For example: if str is 2 12 + 7 / then your program should output 2.
 */
public class ReversePolishNotation {

    private static final Stack<String> stack = new Stack<>();

    /**
     * Cleaning, parsing and splitting the input string into the array of tokens.
     * 1. convert to lowercase
     * 2. remove multiple spaces
     * 3. split two bundled characters (but only when the second character is not a digit)
     * 4. split bundled command/operator and a digit. Excl. minus to keep negative numbers intact.
     * 5. trim (remove leading and trailing spaces)
     * 6. split to array of strings
     *
     */
    private static String[] parseConsoleInput(String input) {
        return input
                .toLowerCase()
                .replaceAll(" +", " ")
                .replaceAll("([\\p{P}\\p{S}a-z0-9])(?=[\\p{P}\\p{S}a-z])", "$1 ")
                .replaceAll("([^- 0-9])(?=[0-9])", "$1 ")
                .trim()
                .split(" ");
    }

    private static void printInputError(String op) {
        System.out.println("Unrecognised operator or operand: \"" + op + "\".");
    }

    public static long reduceOperands(long a, long b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    System.out.println("Divide by 0.");
                    throw new ArithmeticException();
                }
                return a / b;
            default:
                return 0;
        }
    }

    private static boolean isOperand(String op) {
        Pattern pattern = Pattern.compile("^[\\d]|^-[\\d]");
        Matcher matcher = pattern.matcher(op);
        return matcher.find();
    }

    private static boolean isOperator(String op) {
        Pattern pattern = Pattern.compile("^[+\\-*/^%]");
        Matcher matcher = pattern.matcher(op);
        return matcher.find();
    }

    private static String performArithOperation(String operator) {
        if (stack.size() >= 2) {
            // Safe to evaluate
            String elementB = stack.pop();
            String elementA = stack.pop();
            long opB = Long.parseLong(elementB);
            long opA = Long.parseLong(elementA);
            long result = reduceOperands(opA, opB, operator);
            return Long.toString(result);
        } else {
            // Stack underflow since at least one element is null
            return null;
        }
    }

    private static Long evaluateExpression(String[] tokens) {
        for (String token : tokens) {
            // token is an operand, push it to stack and move on
            if (isOperand(token)) {
                stack.push(token);
                continue;
            }
            // token is an operator, evaluate
            if (isOperator(token)) {
                String result = performArithOperation(token);
                if (result != null) {
                    stack.push(result);
                }
                continue;
            }
            // token is illegal
            printInputError(token);
        }
        // all tokens have been processed
        if (stack.isEmpty()) {
            return null;
        }
        return Long.parseLong(stack.peek());
    }

    public static String reversePolishNotation(String expression) {
        String[] tokens = parseConsoleInput(expression);
        Long result = evaluateExpression(tokens);
        return result == null ? "" : result.toString();
    }
}
