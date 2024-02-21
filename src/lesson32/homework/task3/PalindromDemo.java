package task3;

public class PalindromDemo {
    public static void main(String[] args) {

        PalindromCheck pCheck = string -> {
            string = string.trim();
            string = string.replace(" " , "");
            string = string.replace("." , "");
            string = string.replace("," , "");
            StringBuilder checkString = new StringBuilder();
            for (int i = string.length()-1; i >= 0 ; i--) {
                checkString.append(string.charAt(i));
            }

            return string.equalsIgnoreCase(String.valueOf(checkString));
        };


        String s1 = "Главрыба";
        String s2 = "Egale Lage.";

        System.out.println("String s1 is palindrom " + pCheck.palindromCheck(s1));

        System.out.println("String s2 is palindrom " + pCheck.palindromCheck(s2));
    }
}
