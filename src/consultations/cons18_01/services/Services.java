package consultations.cons18_01.services;

import consultations.cons18_01.Entitys.InitialMorseTable;
import consultations.cons18_01.ulils.Output;
import consultations.cons18_01.ulils.UserInput;

import java.util.Arrays;
import java.util.Map;

public class Services {

    String stringToCode;
    UserInput ui = new UserInput();
    Output output = new Output();
    InitialMorseTable morseTable = new InitialMorseTable();

    private void setStringToCode() {
        this.stringToCode = ui.uiText("Insert string to code: ");
    }

    private String[] splitIncomingString(String stringToCode){
        stringToCode = stringToCode.toUpperCase();
        return stringToCode.split(stringToCode);
    }
    private String[] codeSymbols(String[] stringToCode, Map<String, String> morseTable){

        int length = stringToCode.length;
        String[] codedStringArray = new String[length];

        for (int i = 0; i < length; i++) {
           codedStringArray[i] = morseTable.get(stringToCode[i]);
        }
        return codedStringArray;
    }

    private String codedString(String[] codedStringArray){
        String codedString = " ";

        return Arrays.toString(codedStringArray);
    }
    public void codingMachine(){
        setStringToCode();
        String[] symbolsArray = splitIncomingString(stringToCode);
        String[] codedSymbols = codeSymbols(symbolsArray, morseTable.getTextToMorse());
        String codedString = codedString(codedSymbols);
        output.printCodedString(stringToCode, codedString);

        }
}
