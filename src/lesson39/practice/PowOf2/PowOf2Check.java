package practice.PowOf2;

import java.util.ArrayList;
import java.util.List;

public class PowOf2Check {
    public boolean PowOf2Proof(Integer x){

        if (x <= 0) return false;

        while (x % 2 == 0){
            x /= 2;
        }
        if (x != 1){
            return false;
        }else {
            return true;
        }
    }



}
