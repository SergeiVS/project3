package entity;

import java.util.ArrayList;
import java.util.List;

public class Magazine extends LibraryItem{

    private String issuedNumber;
    private List<Article> articles;


    public Magazine(String title, int year, String issuedNumber) {
        super(title, year);
        this.issuedNumber = issuedNumber;
        this.articles = new ArrayList<>();
    }

    public void addArticle(Article article){
        articles.add(article);
    }

    public String getIssuedNumber() {
        return issuedNumber;
    }

    public List<Article> getArticles() {
        return articles;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issuedNumber='" + issuedNumber + '\'' +
                ", articles=" + articles +
                '}';
    }
}
