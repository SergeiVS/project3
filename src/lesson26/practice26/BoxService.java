import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class BoxService {
    CompareByWeight compareByWeight = new CompareByWeight();
    CompareByVolume compareByVolume = new CompareByVolume();
    private List<Box> boxesList = new LinkedList<>();



    public LinkedList<Box> getBoxesList() {
        return (LinkedList<Box>) boxesList;
    }

    public void addBox(Box box){
        boxesList.add(box);
    }

    public TreeSet<Box> boxesByVolume(LinkedList<Box> boxesList){
        TreeSet<Box> boxesByVolume = new TreeSet<>(compareByVolume.thenComparing(compareByWeight));
        boxesByVolume.addAll(boxesList);
        return boxesByVolume;
    }
    public TreeSet<Box> boxesByWeight(List<Box> boxesList){
        TreeSet<Box> boxesByWeight = new TreeSet<>(compareByWeight.thenComparing(compareByVolume));
        boxesByWeight.addAll(boxesList);
        return boxesByWeight;
    }

    @Override
    public String toString() {
        return "BoxService{" +
                "compareByWeight=" + compareByWeight +
                ", compareByVolume=" + compareByVolume +
                ", boxesList=" + boxesList +
                '}';
    }
}
