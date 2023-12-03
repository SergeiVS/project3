package Cons2BingoGame.services;

import Cons2BingoGame.entitys.Cart;

import java.util.Arrays;
import java.util.Random;

public class CartService {

    public void fillCart(Cart cartToFill, int range) {
        Random random = new Random();
        int[] workingArr = cartToFill.getCart();
        for (int i = 0; i < range; i++) {
            int newNumber;
            do { newNumber = random.nextInt(range) + 1;}

            while (isNumberPresent(workingArr, newNumber));

            workingArr[i] = newNumber;
        }
        Arrays.sort(workingArr);
    }

    private boolean isNumberPresent(int[] warkingArr, int checkNumber) {
        for (int i = 0; i < warkingArr.length; i++) {
            if (checkNumber == warkingArr[i]) {
                return true;
            }
        }
        return false;
    }
}
