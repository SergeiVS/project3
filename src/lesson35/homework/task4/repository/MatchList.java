package homework.task4.repository;

import homework.task4.entity.Match;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static homework.task4.repository.MatchList.Validate.nullCheckInt;
import static homework.task4.repository.MatchList.Validate.nullCheckString;

public class MatchList {
    private final List<Match> matches;

    public MatchList() {
        this.matches = new ArrayList<>();
    }

    public List<Match> readResultsFromFile( String path) throws IOException, NullPointerException {

        BufferedReader bReader = new BufferedReader(new FileReader(path));
        List<Match> matchList = new ArrayList<>();
        String line;
        while ((line = bReader.readLine()) != null) {
            Calendar date = Calendar.getInstance();
            String team1;
            String team2;
            String result;
            int watchers;
            String stadium;

            String[] strings = line.split(",");
            date.set(nullCheckInt(strings[0].trim()), Validate.setMonth(strings[1].trim()), nullCheckInt(strings[2].trim()));
            team1 = nullCheckString(strings[3].trim());
            result = nullCheckString(strings[4].trim());
            team2 = nullCheckString(strings[5].trim());
            watchers = nullCheckInt(strings[6].trim());
            stadium = nullCheckString(strings[7].trim());

            System.out.println(stadium);

            matchList.add(new Match(date, team1, result, team2, watchers, stadium));
        }
        return matchList;
    }





    public List<Match> getMatches() {
        return matches;
    }

    @Override
    public String toString() {
        return "MatchList{" +
                "matches=" + matches +
                '}';
    }

    public static class Validate {

         static int nullCheckInt(String string)  {
            int i;
            try {
                i = Integer.parseInt(string.trim());
            }catch (NullPointerException | NumberFormatException e) {
                i = 0;
            }

            return i;
        } 
        static String nullCheckString(String string){
            String s = "-";
            try {
                s = string;
            } catch (Exception e){
                s = "N/A";
            }
            if (string.equalsIgnoreCase("null")){
                s = "N/A";
            }


            return s;

        }
       public static int setMonth(String month) throws NullPointerException {
            int m = 0;
            switch (month) {
                case "1":
                    m = Calendar.JANUARY;
                case "2":
                    m = Calendar.FEBRUARY;
                case "3":
                    m = Calendar.MARCH;
                case "4":
                    m = Calendar.APRIL;
                case "5":
                    m = Calendar.MAY;
                case "6":
                    m = Calendar.JUNE;
                case "7":
                    m = Calendar.JULY;
                case "8":
                    m = Calendar.AUGUST;
                case "9":
                    m = Calendar.SEPTEMBER;
                case "10":
                    m = Calendar.OCTOBER;
                case "11":
                    m = Calendar.NOVEMBER;
                case "12":
                    m = Calendar.DECEMBER;

            }
            return m;
        }

    }
}