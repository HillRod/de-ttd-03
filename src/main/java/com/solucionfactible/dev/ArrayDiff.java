package com.solucionfactible.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
 */
public class ArrayDiff {
	
    public static int[] diff(int[] a, int[] b) {
        return removeValues(a, b);
    }

    public static int[] removeValues(int[] arrayA, int[] arrayB) {
        //Make array A a list
        List<Integer> listA = new ArrayList<>();
        for (int num : arrayA) {
            listA.add(num);
        }
        
        for (int num : arrayB) {
            listA.removeAll(Arrays.asList(num));
        }

        int[] result = new int[listA.size()];
        for (int i = 0; i < listA.size(); i++) {
            result[i] = listA.get(i);
        }

        return result;
    }

}
