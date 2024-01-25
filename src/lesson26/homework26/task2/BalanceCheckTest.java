package task2;

public class BalanceCheckTest {
    public static void main(String[] args) {

        BracketsBalanceCheck balanceCheck = new BracketsBalanceCheck();
        balanceCheck.inputLine();
        String result = balanceCheck.bracketsBalanceProof(balanceCheck.getStringForProof());
        System.out.println(result);
    }
}
