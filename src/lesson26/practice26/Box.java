import java.util.Objects;

public class Box{
    private Double height;
    private Double length;

    private Double width;
    private Double weight;

    public Box(Double height, Double length, Double width, Double weight) {
        this.height = height;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public Double boxVolume(Box box){
        return (double) (box.getLength() * box.getWidth() * box.getHeight());
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }



    public Double getHeight() {
        return height;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box box)) return false;
        return Objects.equals(height, box.height) && Objects.equals(length, box.length) && Objects.equals(width, box.width) && Objects.equals(weight, box.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, length, width, weight);
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }


}
