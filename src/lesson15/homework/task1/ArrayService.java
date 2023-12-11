package homework.task1;

import homework.Pocker.services.utils.UserInput;

import java.util.Arrays;

public class ArrayService {
    UserInput ui = new UserInput();
    private int arraySize = ui.uiInt("Please insert number of strings: ");

    String[] stringsArray;
    String[] stringsTurnOver;
    private String[]  stringArrayFill (int arraySize){
        stringsArray = new String[arraySize];
        System.out.println("Please insert strings:");
        for (int i = 0; i <arraySize; i++) {
            String text = ui.uiText("insert string # " + (i+1));
            stringsArray[i] = text;
        }
        return stringsArray;
    }

    private String[] stringsArrayTurnOver(){
       stringsTurnOver = stringsArray.clone();

        int counter = stringsArray.length-1;
        String temp;
        for (int i = 0; i < stringsTurnOver.length / 2; i++) {
            temp = stringsTurnOver[i];
            stringsTurnOver[i] = stringsTurnOver[counter];
            stringsTurnOver[counter] = temp;
            counter--;
        }
        return stringsTurnOver;
    }

   public void printOut(){
        String[] outgoingArray = new String[arraySize];
        outgoingArray = stringArrayFill(arraySize);
       System.out.println("Outgoing array: ");
       System.out.println(Arrays.toString(outgoingArray));
       System.out.println();
       System.out.println("Turnover array:");
       System.out.println(Arrays.toString(stringsArrayTurnOver()));

   }




}
