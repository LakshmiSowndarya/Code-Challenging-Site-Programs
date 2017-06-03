/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/magical-word/
*/

import java.util.Arrays;
import java.util.Scanner;
/**
 *  nearest prime number 
 *  Find the prime number greater than that number and less than that number 
 *  Find the distance with the two numbers
 *  Take the less distance number
 */
public class MagicalWord {
	
	public boolean checkPrime(int a) {
		int count = 0;
		for(int i=2;i<a;i++) {
			if(a%i == 0) count++;
		}
		if (count == 0) return true;
		return false;
	}
	public int[] getAllAsciiPrimes() {
		int count = 0;
		for (int i = 65; i < 91;i++) {
			if (checkPrime(i)) count ++;
		}
		for (int i = 97; i < 124;i++) {
			if (checkPrime(i)) count ++;
		}
		int[] a = new int[count];
		int k = 0;
		for (int i = 65; i < 91;i++) {
			if (checkPrime(i)) 
				a[k++] = i;
		}
		for (int i = 97; i < 124;i++) {
			if (checkPrime(i)) 
				a[k++] = i;
		}
		Arrays.sort(a);
		return a;
	}
	
	public char findTheNearest(char a,int[] arr) {
		int min = 0;
		int max = 0;
		int index = 0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i] > a) {
				index = i;
				break;
			}
			if (arr[i] == a) {
				index = i;
				break;
			}
		}
		if (arr[arr.length-1] < a) {
			index = arr.length-1; 
		}
		if (index == 0) {
			min = arr[index];
		}
		else min = arr[index-1];
		max = arr[index];
		if (min == a) return a;
		else if (a - min > max - a) return (char) max;
		else return (char) min;
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		int length[] = new int[testcases];
		String strs[] = new String[testcases];
		for (int i=0;i<testcases;i++) {
			length[i] = s.nextInt();
			strs[i] = s.next();
		}
		MagicalWord m = new MagicalWord();
		String result = "";
		int array[] = m.getAllAsciiPrimes();
		
		for (int i=0;i<testcases;i++) {
			result = "";
			for (int j=0;j<length[i];j++) {
				char a = m.findTheNearest(strs[i].charAt(j),array);
				result = result + a;
			}
			System.out.println(result);
		}
	}
}
