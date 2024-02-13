package homework.task4;

import com.sun.jdi.Value;
import homework.task4.entity.Match;
import homework.task4.repository.MatchList;
import homework.task4.repository.RepositoryAnalyze;

import java.io.IOException;
import java.security.Key;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MatchApp {
    public static void main(String[] args) throws IOException {

        String path = "src/lesson35/homework/task4/source/matches.txt";
        MatchList list = new MatchList();
        RepositoryAnalyze analyze = new RepositoryAnalyze();
        List<Match> matchList = list.readResultsFromFile(path);
        printIsEmpty(matchList, "list of matches");
        System.out.println("||||||||||||||||||||||||||||||||||||||");
        //printList(matchList);
        List<Match> matchesAtWWK = analyze.matchesByStadium(matchList, "WWK");
        System.out.println("_______________________________________________");
        printList(matchesAtWWK);

    }

    static void printIsEmpty(Collection collection, String name) {
        System.out.println("Collection " + name + " is not empty " + (!collection.isEmpty()));
    }

    static void printMap(Map<Key, Value> map, String message1, String message2) {
        int count = 0;
        for (Map.Entry<Key, Value> entry : map.entrySet()) {
            count++;
            System.out.println(count + ". " + message1 + " " + entry.getKey() + ": " + message2 + " " + entry.getValue());
        }
    }

    static void printList(List<Match> list){
        AtomicInteger count = new AtomicInteger();
        list.stream()
                .forEach(match -> {
                    count.getAndIncrement();
                    System.out.println(count + ". " + match.toString());
                });
    }
}

