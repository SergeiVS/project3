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
            date.set(strings[0].trim(), strings[1].trim(), strings[2].trim());

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

        static String JAN = "JANUARY";
        static String FEB = "FEBRUARY";
        static String MAR = "MARCH";
        static String APR = "APRIL";
        static String MAY = "MAY";
        static String JUN = "JUNE";
        static String JUL = "JULY";
        static String AUG = "AUGUST";
        static String SEP = "SEPTEMBER";
        static String OKT = "OCTOBER";
        static String NOV = "NOVEMBER";
        static String DEC = "DECEMBER";



    }
}
