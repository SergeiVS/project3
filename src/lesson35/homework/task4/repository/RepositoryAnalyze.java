package homework.task4.repository;

import homework.task4.entity.Match;

import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.List;

public class RepositoryAnalyze {
    //   Описание: Написать программу на Java, которая будет читать данные из файла "matches.txt".
    //   Полученные данные необходимо обработать и получить коллекцию объектов, с помощью которой необходимо:
    //   a) выбрать все матчи которые были в первой половине месяца
    //   b) посчитать общее количество матчей в выборке
    //   c) выбрать топ 10 самых посещаемых матчей
    //   d) выбрать топ 3 матчей с самой большой разницей в счете на стадионе WWK Arena
    //   e) посчитать сколько матчей содержат упоминания о стадионе
    //   f) посчитать сколько матчей сыграла каждая команда в качестве гостя (в формате map)
    //   g) выделить наиболее популярный день проведения матча

    public List<Match> matchesByPeriod(List<Match> matches, Calendar beginDate, Calendar endDate){
        List<Match> result = matches.stream()
                .filter(match -> match.getDate().after(beginDate))
                .filter(match -> match.getDate().before(endDate))
                .toList();
        return result;
    }

    public Integer matchesCount(List<Match> matches){
        return matches.size();
    }
    public List<Match> topMatchesByWatchers(List<Match> matches, long rangeLength){
        return matches.stream()
                .sorted((m1, m2) -> m1.getWatchers().compareTo(m2.getWatchers()))
                .limit(rangeLength)
                .toList();
    }
    public Integer matchesWithStadiumAvailable(List<Match> matches){
        List<Match> matchList = matches.stream()
                .filter(match -> !match.getStadium().equals("N/A"))
                .toList();
        return matches.size();
    }
    public List<Match> matchesByStadium

}
