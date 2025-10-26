package brackets;

import java.util.Stack;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    System.out.println("closed " + c + " but not opened at " + i);
                    return;
                }
                char last = stack.pop();
                if ((last == '(' && c != ')') ||
                        (last == '[' && c != ']') ||
                        (last == '{' && c != '}')
                ) {
                    System.out.println("opened " + last + " but closed " + c + " at " + i);
                    return;
                }
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("opened " + stack.peek() + " but not closed");
        } else {
            System.out.println("No errors found");
        }
    }
}