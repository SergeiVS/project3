package practice.balancecheck;



import java.util.Stack;

public class BracketsBalanceCheck {

    homework.Pocker.services.utils.UserInput ui = new homework.Pocker.services.utils.UserInput();
    private String stringForProof;

    public void inputString() {
        stringForProof = ui.uiText("Insert string: ");
    }

    public String getStringForProof() {
        return stringForProof;
    }

    public boolean bracketsBalanceProof(String stringForProof) {
        Stack<Character> characterStack = new Stack<>();
        char c;
        int count = 0;
        for (int i = 0; i < stringForProof.length(); i++) {

            c = stringForProof.charAt(i);
            count = fillStack(c, characterStack, count);
            if (c == ')' || c == '}' || c == ']') {
                boolean count1 = isStackEmpty(characterStack);
                if (!count1) return false;

                char lastOpenBracket = characterStack.peek();

                boolean count2 = bracketsClosingCheck(c, lastOpenBracket, characterStack);
                if (!count2) return false;
            }
        }

        boolean count1 = isCharacteristicNotEmpty(characterStack, count);
        if (!count1) return false;

        return true;
    }

    private static boolean isCharacteristicNotEmpty(Stack<Character> characterStack, int count) {
        if (!characterStack.isEmpty()){
            return false;
        }
        return true;
    }

    private static boolean bracketsClosingCheck(char c, char lastOpenBracket, Stack<Character> characterStack) {
        if (c == ')' && lastOpenBracket == '(' || c == '}' && lastOpenBracket == '{' || c == ']' && lastOpenBracket == '[') {
            characterStack.pop();
        } else {
            return false;
        }
        return true;
    }

    private static boolean isStackEmpty(Stack<Character> characterStack) {
        if (characterStack.isEmpty()) {
            return false;
        }
        return true;
    }

    private static int fillStack(char c, Stack<Character> characterStack, int count) {
        if (c == '(' || c == '{' || c == '[') {
            characterStack.push(c);
            count++;
        }
        return count;
    }
}
