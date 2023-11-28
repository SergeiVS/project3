package lesson7.homework.task3;

public class Cow {

    public String cow(int number) {

        if (number % 100 > 10 && number % 100 < 20) {
            return " у нас " + number + " коров";
        }
        if (number % 10 > 4) {
            return " у нас " + number + " коров";
        }
        if (number % 10 > 1) {
            return " у нас " + number + " коровы";
        }
        if (number % 10 == 1) {
            return " у нас " + number + " коровa";
        }
            return "У нас " + number + " коров ";

    }
}