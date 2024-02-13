package homework.task4.repository;

import homework.task4.entity.Match;

import java.time.Month;
import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static java.util.Arrays.stream;

public class RepositoryAnalyze {
    //   Описание: Написать программу на Java, которая будет читать данные из файла "matches.txt".
    //   Полученные данные необходимо обработать и получить коллекцию объектов, с помощью которой необходимо:
    //   a) V выбрать все матчи которые были в первой половине месяца
    //   b) V  посчитать общее количество матчей в выборке
    //   c) V выбрать топ 10 самых посещаемых матчей
    //   d) V выбрать топ 3 матчей с самой большой разницей в счете на стадионе WWK Arena
    //   e)  V посчитать сколько матчей содержат упоминания о стадионе
    //   f)  V посчитать сколько матчей сыграла каждая команда в качестве гостя (в формате map)
    //   g) V выделить наиболее популярный день проведения матча

    public List<Match> matchesByPeriod(List<Match> matches, Integer endDay) {
        List<Match> result = matches.stream()
                .filter(match -> match.getDate().get(Calendar.DAY_OF_MONTH) <= endDay)
                .toList();
        return result;
    }


    public Integer matchesCount(List<Match> matches) {
        return matches.size();
    }

    public List<Match> topMatchesByWatchers(List<Match> matches, long rangeLength) {
        return matches.stream()
                .sorted(Comparator.comparing(Match::getWatchers).reversed())
                .limit(rangeLength)
                .toList();
    }

    public Integer matchesWithStadiumAvailable(List<Match> matches) {
        List<Match> matchList = matches.stream()
                .filter(match -> !match.getStadium().contains("N/A"))
                .toList();
        return matchList.size();
    }

    public List<Match> matchesByStadium(List<Match> matches, String stadium) {
        return matches.stream()
                .filter(match -> match.getStadium().contains(stadium))
                .toList();
    }

    public Map<Integer, Long> mostPopularDay(List<Match> matches, Integer topLimit) {

        Map<Integer, Long> map = matches.stream()
                .collect(Collectors.groupingBy(m -> m.getDate().get(Calendar.DAY_OF_WEEK), Collectors.counting()));
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(topLimit)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public Map<String, Long> guestMatchesCount(List<Match> matches) {
        return matches.stream()
                .collect(Collectors.groupingBy(Match::getTeam2, Collectors.counting()));
    }

    public Map<String, Long> homeMatchesCount(List<Match> matches) {
        return matches.stream()
                .collect(Collectors.groupingBy(Match::getTeam1, Collectors.counting()));
    }

    public List<Match> highestScoreDifference(List<Match> matches, Integer topLimit) {
        return matches.stream()
                .sorted((m1, m2) -> Math.abs(m2.getResult1() - m2.getResult2()) - Math.abs(m1.getResult1() - m2.getResult2()))
                .limit(topLimit)
                .toList();
    }
}
