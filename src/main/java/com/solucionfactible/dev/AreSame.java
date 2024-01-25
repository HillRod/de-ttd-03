package com.solucionfactible.dev;

import java.util.Map;
import java.util.HashMap;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 */
public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
            //Validate 
            if(a == null || b == null || a.length != b.length) return false;
            //Generate frecuancy maps of the arrays
            Map<Integer, Integer> frecuencyMapA = getFrecuencyMap(a, false);
            Map<Integer, Integer> frecuencyMapB = getFrecuencyMap(b, true);
            //Return the comparision of the hashmaps of frecuencymaps
            return frecuencyMapA.equals(frecuencyMapB);
	}
        
        
        //Function that generates a frecuency map of an array of integers given
        private static Map<Integer, Integer> getFrecuencyMap(int[] array, boolean squared){
            Map<Integer,Integer> frecuencyMap = new HashMap<>();
            for(int number: array){
                //if its squared get the squared root frequency map
                if(!squared)frecuencyMap.put(number, frecuencyMap.getOrDefault(number, 0)+1);
                else {
                    int rootSquaredNum = (int)Math.sqrt((double)number);
                    frecuencyMap.put(rootSquaredNum, frecuencyMap.getOrDefault(rootSquaredNum, 0)+1);
                }
            }
            return frecuencyMap;
        }
}
