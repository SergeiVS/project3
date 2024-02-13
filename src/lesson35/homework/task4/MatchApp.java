package homework.task4;

import homework.task4.entity.Match;
import homework.task4.repository.MatchList;
import homework.task4.repository.RepositoryAnalyze;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MatchApp {
    public static void main(String[] args) throws IOException {

        //Работа с данными из файла "matches.txt"
        //   Описание: Написать программу на Java, которая будет читать данные из файла "matches.txt".
        //   Полученные данные необходимо обработать и получить коллекцию объектов, с помощью которой необходимо:
        //   a) выбрать все матчи которые были в первой половине месяца
        //   b) посчитать общее количество матчей в выборке
        //   c) выбрать топ 10 самых посещаемых матчей
        //   e) посчитать сколько матчей содержат упоминания о стадионе
        //   f) посчитать сколько матчей сыграла каждая команда в качестве гостя (в формате map)
        //   g) выделить наиболее популярный день проведения матча

        String path = "src/lesson35/homework/task4/source/matches.txt";
        MatchList list = new MatchList();
        RepositoryAnalyze analyze = new RepositoryAnalyze();

        List<Match> matchList = list.readResultsFromFile(path);
        printIsEmpty(matchList, "list of matches");
        System.out.println("||||||||||||||||||||||||||||||||||||||");
        //printList(matchList);

        //   a) выбрать все матчи которые были в первой половине месяца
        List<Match> matchesBefore15Th = analyze.matchesByPeriod(matchList, 15);
        printList(matchesBefore15Th, "Matches at first part of month");
        System.out.println("_______________________________________________");

        //   b) посчитать общее количество матчей в выборке
        int matchesTotalCount = analyze.matchesCount(matchList);
        System.out.println("Total number of matches: " + matchesTotalCount);
        System.out.println("_______________________________________________");

        //   c) выбрать топ 10 самых посещаемых матчей
        List<Match> mostWatchedMatches = analyze.topMatchesByWatchers(matchList, 10);
        printList(mostWatchedMatches, "10 most watched matches");

        //   e) посчитать сколько матчей содержат упоминания о стадионе
        int matchesWithStadium = analyze.matchesWithStadiumAvailable(matchList);
        System.out.println();
        System.out.println("Count of matches with given stadium information: " + matchesWithStadium);

        //   f) посчитать сколько матчей сыграла каждая команда в качестве гостя (в формате map)
        Map<String, Long> guestMatches = analyze.guestMatchesCount(matchList);
        printMap(guestMatches, "Team: ", ", matches as guest: ");

        // d) выбрать топ 3 матчей с самой большой разницей в счете на стадионе WWK Arena
        List<Match> matchesAtWWK = analyze.matchesByStadium(matchList, "WWK");
        List<Match> top3ScoreWWK = analyze.highestScoreDifference(matchesAtWWK, 3);
        printList(top3ScoreWWK, "Top 3 highest score difference on WWK Arena:");

        // g) выделить наиболее популярный день проведения матча
Map<Integer, Long> weekday = analyze.mostPopularDay(matchList, 1);
printMap(weekday, "Most popular day of week: ", " matches played at this day:");

    }

    static void printIsEmpty(Collection collection, String name) {
        System.out.println();
        System.out.println("Collection " + name + " is not empty " + (!collection.isEmpty()));
    }

    static <K,V> void printMap(Map<K , V> map, String message1, String message2) {
        int count = 0;
        System.out.println();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            count++;
            System.out.println(count + ". " + message1 + " " + entry.getKey() + ", " + message2 + " " + entry.getValue());
        }
    }

    static void printList(List<Match> list, String message){
        AtomicInteger count = new AtomicInteger();
        System.out.println();
        System.out.println(message);
        list.stream()
                .forEach(match -> {
                    count.getAndIncrement();
                    System.out.println(count + ". " + match.toString());
                });
    }
}

