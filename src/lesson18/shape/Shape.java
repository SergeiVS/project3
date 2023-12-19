package shape;

abstract class Shape {
    private  String title;

    public Shape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "title='" + title + '\'' +
                '}';
    }
}
