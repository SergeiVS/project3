package apartments;

import java.util.Objects;

public class Flat implements Comparable<Flat> {

private Integer numberOfBedrooms;
private Integer flatArea;

    public Flat(Integer numberOfBedrooms, Integer flatArea) {
        this.numberOfBedrooms = numberOfBedrooms;
        this.flatArea = flatArea;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "numberOfBedrooms=" + numberOfBedrooms +
                ", flatArea=" + flatArea +
                '}';
    }

    public Integer getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public Integer getFlatArea() {
        return flatArea;
    }

    @Override
    public int compareTo(Flat o) {
int copareResult;
        if (!Objects.equals(numberOfBedrooms, o.getNumberOfBedrooms())){
            copareResult = numberOfBedrooms - o.numberOfBedrooms;
        }else {copareResult = flatArea - o.getFlatArea();}
        return copareResult;
    }
}
