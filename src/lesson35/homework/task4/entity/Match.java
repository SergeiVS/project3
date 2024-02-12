package homework.task4.entity;

import java.util.Calendar;

public class Match {
    //Работа с данными из файла "matches.txt"
    //   Описание: Написать программу на Java, которая будет читать данные из файла "matches.txt".
    //   Полученные данные необходимо обработать и получить коллекцию объектов, с помощью которой необходимо:
    //   a) выбрать все матчи которые были в первой половине месяца
    //   b) посчитать общее количество матчей в выборке
    //   c) выбрать топ 10 самых посещаемых матчей
    //   d) выбрать топ 3 матчей с самой большой разницей в счете на стадионе WWK Arena
    //   e) посчитать сколько матчей содержат упоминания о стадионе
    //   f) посчитать сколько матчей сыграла каждая команда в качестве гостя (в формате map)
    //   g) выделить наиболее популярный день проведения матча
    private Calendar date;
    ;
    Integer watchers;
    private String team1, result, team2, stadium;

    public Match(Calendar date, String team1, String result, String team2, Integer watchers, String stadium) {
        this.date = date;
        this.team1 = team1;
        this.result = result;
        this.team2 = team2;
        this.watchers = watchers;
        this.stadium = stadium;
    }

    public int getResult1() {
        return Integer.parseInt(result.split(":")[0]);
    }

    public int getResult2() {
        return Integer.parseInt(result.split(":")[1]);
    }

    public Calendar getDate() {
        return date;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public Integer getWatchers() {
        return watchers;
    }

    public String getStadium() {
        return stadium;
    }

    @Override
    public String toString() {
        return date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DATE) + " " + team1 + " " + getResult1() + ":" + getResult2() + " " + team2 + " " + getWatchers();
    }
}
