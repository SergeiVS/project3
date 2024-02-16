package generics.task1Gen;

import generics.task1Gen.boxes.BoxT1G;
import generics.task1Gen.boxes.CartonBox;
import generics.task1Gen.boxes.PlasticBox;
import generics.task1Gen.contains.BookT1G;

import generics.task1Gen.contains.Cloths;

import java.util.ArrayList;
import java.util.List;

public class BoxOperateApp {
    public static void main(String[] args) {


        List<BoxT1G> boxes = new ArrayList<>();

        boxes.add(new CartonBox(1, 4));
        boxes.add(new PlasticBox(2, 5));
        Cloths cloth1 = new Cloths("T-Shirt, white");
        Cloths cloth2 = new Cloths("T-shirt, black");
        Cloths cloth3 = new Cloths("Shorts");

        BookT1G book1 = new BookT1G("Java");
        BookT1G book2 = new BookT1G("Math analyzes");

        boxes.get(0).putContain(cloth1);
        boxes.get(0).putContain(cloth2);
        boxes.get(0).putContain(book1);

        boxes.get(1).putContain(book2);
        boxes.get(1).putContain(cloth3);

        System.out.println("Box " + boxes.get(0).getId() + " contains: " + boxes.get(0).getContains());
        System.out.println();
        System.out.println("Box " + boxes.get(1).getId() + " contains: " + boxes.get(1).getContains());
        System.out.println();

        boxes.get(0).removeContain(cloth2);
        System.out.println("Box " + boxes.get(0).getId() + " contains: " + boxes.get(0).getContains());
        System.out.println();

        System.out.println("Box " + boxes.get(0).getId() + " volume: " +  boxes.get(0).getVolume());
    }
}
