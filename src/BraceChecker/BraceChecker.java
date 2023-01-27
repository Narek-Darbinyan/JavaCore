package BraceChecker;

import java.util.Stack;

public class BraceChecker {
    private String text;


    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char last;
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case '{':
                    stack.push(c);
                    break;
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    last = (char) stack.pop();
                    if (last != '(') {
                        System.out.println("Error: opened [ but closed");
                    }
                    break;
                case '}':
                    last = (char) stack.pop();
                    if (last != '{') {
                        System.out.println("Error: opened [ but closed+last");
                    }
                    break;
                case ']':
                    last = (char) stack.pop();
                    if (last != '[') {
                        System.out.println("Error: opened [ but closed+last");
                    }
                    break;

            }

        }

    }

}
