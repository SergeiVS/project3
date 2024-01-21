package lesson25.suitcases;

public class Suitcase {
private String material;
private String sizeOfCase;
private String color;

    public Suitcase(String material, String sizeOfCase, String color) {
        this.material = material;
        this.sizeOfCase = sizeOfCase;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSizeOfCase() {
        return sizeOfCase;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Suitcase{" +
                "material='" + material + '\'' +
                ", sizeOfCase='" + sizeOfCase + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
