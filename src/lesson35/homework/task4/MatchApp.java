package homework.task4;

import homework.task4.entity.Match;
import homework.task4.repository.MatchList;

import java.io.IOException;
import java.util.List;

public class MatchApp {
    public static void main(String[] args) throws IOException {

        String path = "src/lesson35/homework/task4/source/matches.txt";
        MatchList list = new MatchList();
        List<Match> matchList = list.readResultsFromFile(path);
        System.out.println(!matchList.isEmpty());

    }
}
