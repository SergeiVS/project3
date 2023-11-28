package lesson7.homework.task34;

public class SumOfNumberPositions {

    public int sumOfNumbersPositions(int number){
        int sum = 0;
        int num = 0;

        while (number > 0) {
            num = number % 10;
            sum += num;
            number /=10;
        }
        return sum;
    }
}
