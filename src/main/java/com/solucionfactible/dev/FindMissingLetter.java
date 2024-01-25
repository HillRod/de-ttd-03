package com.solucionfactible.dev;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {
	
	public static char findMissingLetter(char[] array) {
            //Use the ascii code to check if it miss some consecutive number
            char missed = ' ';
            for(int i = 0;i < array.length - 1;i++){
                //If the difference between the 2 consecutive letters are different than 1 based on ascii code
                if(array[i+1] - array[i] != 1){
                    //Set the missed char that is the nexto to the i value of the array +1
                    missed = (char)(array[i]+1);
                    break;
                }
            }
            return missed;
	}

}
