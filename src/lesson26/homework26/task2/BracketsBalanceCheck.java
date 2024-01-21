package task2;

import lesson26.homework26.UserInput;

import java.util.Stack;

public class BracketsBalanceCheck {

    lesson26.homework26.UserInput ui = new UserInput();
    private String stringForProof;

    public void inputString() {
        stringForProof = ui.uiText("Insert string: ");
    }

    public String getStringForProof() {
        return stringForProof;
    }

    public String bracketsBalanceProof(String stringForProof) {
        Stack<Character> characterStack = new Stack<>();
        char c;
        int count = 0;
        for (int i = 0; i < stringForProof.length(); i++) {

            c = stringForProof.charAt(i);
            count = fillStack(c, characterStack, count);
            if (c == ')' || c == '}' || c == ']') {
                String count1 = isStackEmpty(characterStack, count);
                if (count1 != null) return count1;

                char lastOpenBracket = characterStack.peek();

                String count2 = bracketsClosingCheck(c, lastOpenBracket, characterStack, count);
                if (count2 != null) return count2;
            }
        }

        String count1 = isCharacteristicNotEmpty(characterStack, count);
        if (count1 != null) return count1;

        return "brackets are in balance";
    }

    private static String isCharacteristicNotEmpty(Stack<Character> characterStack, int count) {
        if (!characterStack.isEmpty()){
            return "brackets are not in balance " + count;
        }
        return null;
    }

    private static String bracketsClosingCheck(char c, char lastOpenBracket, Stack<Character> characterStack, int count) {
        if (c == ')' && lastOpenBracket == '(' || c == '}' && lastOpenBracket == '{' || c == ']' && lastOpenBracket == '[') {
            characterStack.pop();
        } else {
            return "brackets are not in balance " + count;
        }
        return null;
    }

    private static String isStackEmpty(Stack<Character> characterStack, int count) {
        if (characterStack.isEmpty()) {
            return "brackets are not in balance " + count;
        }
        return null;
    }

    private static int fillStack(char c, Stack<Character> characterStack, int count) {
        if (c == '(' || c == '{' || c == '[') {
            characterStack.push(c);
            count++;
        }
        return count;
    }
}
