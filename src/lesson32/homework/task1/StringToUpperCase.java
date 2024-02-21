package task1;

public class StringToUpperCase{
    public static void main(String[] args) {

        String string = "Bundeswirtschaftsminister Robert Habeck schaut mit großen Sorgen auf die Lage der deutschen " +
                "Wirtschaft. Der Grünen-Politiker kündigte in Leipzig an, die Bundesregierung werde ihre " +
                "Konjunkturprognose für dieses Jahr deutlich senken. Erwartet werde nur noch ein " +
                "Wirtschaftswachstum von 0,2 Prozent.";


        ToUpperCaseInterface toUpCase = String::toUpperCase;

        System.out.println(toUpCase.toUpperCase(string));
    }


}


