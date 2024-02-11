package homework.task4.repository;

import homework.task4.entity.Match;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MatchList {
    private final List<Match> matches;

    public MatchList() {
        this.matches = new ArrayList<>();
    }

    public List<Match> readResultsFromFile(String path) throws IOException, NullPointerException {

        BufferedReader bReader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = bReader.readLine()) != null)
        {
            Calendar date;
            String team1;
            String team2;
            String result;
            String watchers;
            String stadium;

            String[] strings = line.split(",");
            date.set(strings[0].trim(), Months.setMonth(strings[1].trim()), strings[2].trim());

        }
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

    public static class Months {


static int setMonth(String month){

    switch (month){
        case "1" :
           return Calendar.JANUARY;
        case "2":
            return Calendar.FEBRUARY;
        case "3":
            return Calendar.MARCH;
        case "4":
            return Calendar.APRIL;
        case "5":
            return Calendar.MAY;
        case "6":
            return Calendar.JUNE;
        case "7":
            return Calendar.JULY;
        case "8":
            return Calendar.AUGUST;
        case "9":
            return Calendar.SEPTEMBER;
        case "10":
            return Calendar.OCTOBER;
        case "11":
            return Calendar.NOVEMBER;
        case "12":
            return Calendar.DECEMBER;
        default: return 0;
    }
}

    }
}
