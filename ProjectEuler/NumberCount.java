// Problem 17 in ProjectEuler

package SamplePrograms;

import java.security.AllPermission;

public class NumberCount {
	/**
	 * Numbers from 1 to 10 
	 * Numbers from 11 to 19
	 * Numbers 20,30,40,50,60,70,80,90 (* 9)
	 * Numbers hundred(1 to 9)(and 1 to 99), thousand 
	 */
	
	/**
	 * one hundred and one
	 *                 two
	 *                 three
	 *                 four
	 *                 .
	 *                 .
	 *                 .
	 *                 ninty nine
	 */
	
	public static void main(String args[]){
		// one two three four five six seven eight nine
		int sumOfTen = 3+3+5+4+4+3+5+5+4;
		System.out.println(sumOfTen);
		// ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen
		int a10to19 = 3 +6+6+8+8+7+7+9+8+8;
		System.out.println(a10to19);
		// twenty thirty fourty fifty sixty seventy eighty ninty
		int allTens = 6+6+6+5+5+7+6+5;
		// twentyone ... + ten
		// twenty (1 to 9)
		int all = allTens * 10 + (sumOfTen) * 9 + a10to19 ;
		System.out.println(all);
		
		
		// all numbers repeat 10 times
		// hundred and repeats 99 * 10
		// one hundred, two hundred ... 
		// one thousand
		/**
		 *  all numbers repeat 10 times + hundred and for all hundreds + one repeats 100 times + 
		 *  hundred repeats
		 */
		int sumOfNumbers = all * 10 + 10 * 99 *9 + sumOfTen * 100 + 9 * 7 + 11;
		System.out.println(sumOfNumbers);
	}
}

