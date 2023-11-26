package lesson7.homework.task2;

public class Methods {

    boolean isSimple;


    Number number = new Number();



    public boolean checkSimple() {

        for (int i = 2; i < (number.getX()/ 2); i++) {

            if (i % 2 == 0) {
                isSimple = false;
            } else {
                isSimple = true;

            }

        }
        return isSimple;
    }


}
