package Nums;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 3, 4 , 4, 55, 55};
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]) count++;
            }
        }
        System.out.println("Количество пар - " + count);
    }
}
