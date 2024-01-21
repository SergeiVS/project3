import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OwnerService {

   private Map<String, ArrayList<Box>> ownersBoxesMap = new HashMap<>();


    public Map<String, ArrayList<Box>> getOwnersBoxes() {
        return ownersBoxesMap;
    }

    public void addNewOwner(Owner owner){
        ownersBoxesMap.put(owner.getName(), new ArrayList<>());
    }
    public void addNewBoxToOwner(Owner owner, Box box){
        ownersBoxesMap.get(owner.getName()).add(box);
    }
    public void removeBoxFromOwner(Owner owner, Box box){
        ownersBoxesMap.get(owner.getName()).remove(box);
    }


    public void removeOwner(Owner owner){
        ownersBoxesMap.remove(owner.getName());
    }
}
