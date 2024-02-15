package task3;

public class PalCheck implements PalindromCheck{
    @Override
    public Boolean palindromCheck(String string) {
        string = string.trim();
        string = string.replace(" " , "");
        string = string.replace("." , "");
        string = string.replace("," , "");
        StringBuilder checkString = new StringBuilder();
        for (int i = string.length()-1; i >= 0 ; i--) {
            checkString.append(string.charAt(i));
        }
        System.out.println(string.toLowerCase());
        System.out.println(String.valueOf(checkString).toLowerCase());
        return string.equalsIgnoreCase(String.valueOf(checkString));
    }
}
