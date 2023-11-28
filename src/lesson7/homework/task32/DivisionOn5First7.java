package lesson7.homework.task32;

public class DivisionOn5First7 {
    public static void main(String[] args) {

        int count = 0;
        int i = 1;

        while (count < 7 && i <= 100){
           i++;

           if ( i % 5 == 0 ){
               System.out.print(i + ", ");
               count++;
           }
        }
    }
    }