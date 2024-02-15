package entity;

public class BookWithNumOfPages extends Book {
    Integer numberOfPages;

    public BookWithNumOfPages(String title, int year, String author, String genre, Integer numberOfPages) {
        super(title, year, author, genre);
        this.numberOfPages = numberOfPages;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getDescribe() {
        return super.getDescribe() + " number of pages: " + numberOfPages;
    }

    @Override
    public String toString() {
        return "BookWithNumOfPages{" +
                "numberOfPages=" + numberOfPages +
                "} " + super.toString();
    }

}
