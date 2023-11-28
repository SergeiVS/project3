package lesson7.homework.task22Cycles;

public class MultiplyRow {

    public void rowMultiply(int n){
        System.out.println("Multiplying all integers from 0 to " + n + " on " + n);
        for (int i = 0; i <= n; i++) {
            int x = i * n;
            System.out.print(x + "; ");
        }
    }
}
