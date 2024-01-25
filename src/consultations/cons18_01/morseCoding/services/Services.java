package consultations.cons18_01.morseCoding.services;

import consultations.cons18_01.morseCoding.Entitys.InitialMorseTable;

import consultations.cons18_01.morseCoding.ulils.UserInput;

import java.util.*;

public class Services {

    String stringToCode;

    UserInput ui = new UserInput();

    InitialMorseTable morseTable = new InitialMorseTable();

    public void setStringToCode() {
        this.stringToCode = ui.uiText("Insert string to code: ");
    }
private List<String> prepareStringForCoding(String stringToCode, String regexFirst){

        List<String> listFromStringToCode = new LinkedList<>();

        stringToCode = stringToCode.toUpperCase();
        String[] splitedString = stringToCode.split(regexFirst);

    splitStringToCode(splitedString, listFromStringToCode);
    return listFromStringToCode;
}

    private static void splitStringToCode(String[] splitedString, List<String> listFromStringToCode) {
        for (int i = 0; i < splitedString.length; i++) {
    if(Objects.equals(splitedString[i], "")){
        splitedString[i] = " ";}
    listFromStringToCode.add(splitedString[i]);
        }
    }

public String coding(String stringToCode){

        StringBuilder codedString = new StringBuilder();
        List<String> listToCode = prepareStringForCoding(stringToCode, "");
    System.out.println(morseTable.getMorseToText());
for (String stringElement : listToCode){
String codingElement = morseTable.getTextToMorse().get(stringElement);
codedString.append(codingElement).append(" ");
}
return codedString.toString();
}
private String decoding(String stringToDecode){
String decodedString = "";
List<String> listToDecode = prepareStringForCoding(stringToDecode, " ");

for (String stringElement : listToDecode){
String decodingElement = morseTable.getMorseToText().get(stringElement);
decodedString = decodedString + decodingElement;
}
return decodedString;
}

public String codingMachine(String messageToCodeDecode, boolean isCoding){
        morseTable.InitialTexToMorseTable();

      return   isCoding ? coding(messageToCodeDecode) : decoding(messageToCodeDecode);
}

}
