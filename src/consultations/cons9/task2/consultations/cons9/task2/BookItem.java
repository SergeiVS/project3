package consultations.cons9.task2;

public class BookItem {
    //Дан файл с данными
    //Нам известно, что данные в этом файле записаны следующим образом:
    //{ Название книги : значение,
    //Автор : значение,
    //год издания : значение },
    //{ Название книги : значение,
    //Автор : значение,
    //год издания : значение },
    //{ Название книги : значение,
    //Автор : значение,
    //год издания : значение }
    //
    //необходимо:
    //
    //1) считать данные из файла
    //2) сохранить данные в коллекции
    //3) найти элемент в коллекции, который удовлетворяет условию (по выбору)

    private String title;
    private String author;
    private Integer yearOfIssue;

    public BookItem(String title, String author, Integer yearOfIssue) {
        this.title = title;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    @Override
    public String toString() {
        return "BookItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
