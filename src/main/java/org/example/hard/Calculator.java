package org.example.hard;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Have the function calculate(str) take the str parameter being passed
 * and evaluate the mathematical expression within in.
 * For example, if str were "2+(3-1)*3" the output should be 8.
 * Another example: if str were "(2-0)(6/2)" the output should be 6.
 * There can be parenthesis within the string, so you must evaluate it
 * properly according to the rules of arithmetic.
 * The string will contain the operators: +, -, /, *, (, and ).
 * If you have a string like this: #/#*# or #+#(#)/#,
 * then evaluate from left to right. So divide then multiply,
 * and for the second one multiply, divide, then add.
 * The evaluations will be such that there will not be any decimal operations,
 * so you do not need to account for rounding and whatnot.
 */
public class Calculator {

    private static final Stack<String> stack = new Stack<>();

    /**
     * Cleaning, parsing and splitting the input string into the array of tokens
     * 1. convert to lowercase
     * 2. replace (a)(b) with (a) * (b)
     * 3. replace a(b) with a * (b)
     * 4. split two bundled characters (but only when the second character is not a digit)
     * 5. split bundled command/operator and a digit. Excl. minus to keep negative numbers intact.
     * 6. remove multiple spaces
     * 7. trim (remove leading and trailing spaces)
     * 8. split to array of strings
     *
     */
    private static String[] parseConsoleInput(String input) {
        return input
                .toLowerCase()
                .replaceAll("(\\)\\()", ") * (")
                .replaceAll("([0-9])(?=[(])", "$1 *")
                .replaceAll("([\\p{P}\\p{S}a-z0-9])(?=[\\p{P}\\p{S}a-z])", "$1 ")
                .replaceAll("([^0-9])(?=[0-9])", "$1 ")
                .replaceAll(" +", " ")
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

    private static String[] convertToPostfix(String[] tokens) {
        Stack<String> infStack = new Stack<>();
        String terminating = "#";
        Dictionary<String, Integer> precedence = new Hashtable<>() {
            {
                put(terminating, 0);
                put("(", 0);
                put(")", 0);
                put("+", 1);
                put("-", 1);
                put("*", 2);
                put("/", 2);
            }
        };
        List<String> output = new ArrayList<>();
        infStack.push(terminating);
        for (String token : tokens) {
            // token is an operand, add to output and move on
            if (isOperand(token)) {
                output.add(token);
                continue;
            }
            // left parenthesis, push it to stack and move on
            if (token.equals("(")) {
                infStack.push(token);
                continue;
            }
            // right parenthesis, keep popping until the left parenthesis is found
            if (token.equals(")")) {
                while (true) {
                    String op = infStack.pop();
                    if (op.equals("(")) {
                        break;
                    } else {
                        output.add(op);
                    }
                }
                continue;
            }
            // token is an operator
            if (isOperator(token)) {
                int cmp1 = precedence.get(token);
                while (true) {
                    int cmp2 = precedence.get(infStack.peek());
                    // operand has higher precedence than item on the top of stack
                    if (cmp1 > cmp2) {
                        infStack.push(token);
                        break;
                    } else {
                        output.add(infStack.pop());
                    }
                }
            }
        }
        // pop the remaining items until the terminating symbol is reached (complete)
        while (!infStack.empty() && !infStack.peek().equals(terminating)) {
            output.add(infStack.pop());
        }
        return output.toArray(new String[0]);
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

    public static String calculate(String expression) {
        String[] tokens = parseConsoleInput(expression);
        String[] postfix = convertToPostfix(tokens);
        Long result = evaluateExpression(postfix);
        return result == null ? "" : result.toString();
    }
}
