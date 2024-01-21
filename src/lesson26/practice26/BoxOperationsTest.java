import java.util.*;

public class BoxOperationsTest {
    public static void main(String[] args) {

       BoxService boxService = new BoxService();
       OwnerService ownerService = new OwnerService();



        Box box0 = new Box(5.00, 5.0, 7.0, 0.33);
        Box box1 = new Box(4.0, 3.5, 8.3, 1.2);
        Box box2 = new Box(3.6, 5.4, 4.1, 1.0);
        Box box3 = new Box(8.0, 10.5, 15.3,0.0);
        Box box4 = new Box(9.1, 10.0 , 12.0,2.0);
        Box box5 = new Box(5.0, 3.0, 5.0, 1.0);
        Box box6 = new Box(8.1, 9.1, 11.0, 3.0);
        Box box7 = new Box(5.0, 4.0, 5.0, 55.0);
        
        boxService.addBox(box0);
        boxService.addBox(box1);
        boxService.addBox(box2);
        boxService.addBox(box3);
        boxService.addBox(box4);
        boxService.addBox(box5);
        boxService.addBox(box6);
        boxService.addBox(box7);

        System.out.println(boxService.getBoxesList());
        System.out.println("================");

        System.out.println(boxService.boxesByVolume(boxService.getBoxesList()));
        System.out.println("================");

        System.out.println(boxService.boxesByWeight(boxService.getBoxesList()));
        System.out.println("================");
        
        Owner owner1 = new Owner("John");
        Owner owner2 = new Owner("Vasili");
        Owner owner3 = new Owner("Kate");

       ownerService.addNewOwner(owner1);
       ownerService.addNewOwner(owner2);
       ownerService.addNewOwner(owner3);

       ownerService.addNewBoxToOwner(owner1, box0);
     ownerService.addNewBoxToOwner(owner1, box1);
     ownerService.addNewBoxToOwner(owner1, box2);

     ownerService.addNewBoxToOwner(owner2, box3);
      ownerService.addNewBoxToOwner(owner2, box5);

      ownerService.addNewBoxToOwner(owner3, box7);

     System.out.println(ownerService.getOwnersBoxes());
     System.out.println();

     ownerService.removeOwner(owner3);

     System.out.println(ownerService.getOwnersBoxes());
     System.out.println();

     ownerService.removeBoxFromOwner(owner2, box5);
     System.out.println(ownerService.getOwnersBoxes());
     System.out.println();

     System.out.println(boxService.boxesByWeight(ownerService.getOwnersBoxes().get(owner1.getName())));
    }


}
