package com.solucionfactible.dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer
 */
public class Persistence {
	
	public static int persistence(long num) {
            return (int)recursivePersistence(num);
	}
        
        //recursive function
        private static long recursivePersistence(long n){
            //Base case when the number is one digit
            if(n<10) return 0;
            //Recursive case, multiplies the digits of the number
            int product = 1;
            while (n > 0) {
                //Extracts the last digit
                product *= n % 10;
                //Removes the last digit
                n /= 10;
            }
            //Calls the function again with the new number made of recursive case and sum to the recursive counter
            return 1 + persistence(product);
        }

}
