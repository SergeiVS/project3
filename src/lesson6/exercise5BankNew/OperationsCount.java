package lesson6.exercise5BankNew;

public class OperationsCount {

    public static void main(String[] args) {

        AtmUtil atmUtil = new AtmUtil();
        int balance = atmUtil.getBalance();
        int triesCount = 0;
        System.out.println("Your account balance is: " + balance);

        while (balance>0){
            int draw = atmUtil.getDraw(balance);
                balance -= draw;
                triesCount++;
               System.out.println("At the day " + triesCount + " your balance is: " + balance);
            }

        System.out.println("To get all your money you need: " + triesCount + " days.");

    }
}

