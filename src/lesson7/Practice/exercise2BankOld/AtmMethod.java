package lesson7.Practice.exercise2BankOld;

public class AtmMethod {

    Money money = new Money();
    private int numberOfTries = 1;

    private int amount = money.getAmount();

    private int i = amount ;

    public int getNumberOfTries() {

        while (amount > 0 && i> 0) {

            if ((amount % i) == 0 && i < amount) {

                amount = amount - i;

                numberOfTries++;

                i = amount - 1;

                System.out.println(amount);

            } else if (amount == 1) {
                amount = 0;
                numberOfTries++;
            } else if (i > 1) {
                i--;
            }
        }
            return numberOfTries;
    }
}