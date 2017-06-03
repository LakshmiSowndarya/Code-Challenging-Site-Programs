/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/psychic-powers/
*/

import java.util.Scanner;

public class PsychicPowers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		String number = s.next();
		int count = 0;
		int luck = 1;
		for (int i=0;i< number.length();i = i+1) {
			char a = number.charAt(i);
			while(a == number.charAt(i) && i < number.length()-1){
				count++;
				i++;
			}
			i = i - count;
			if (count == 6) {
				luck = 0;
				break;
			}
			else if(count!=6) {
				luck = 1;
			}
			count = 0;
		}
		if (luck == 1) {
			System.out.println("Good luck!");
		}
		else {
			System.out.println("Sorry, sorry!");
		}
	}
}
