/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/jarvis-and-seven-segments-1/
*/

import java.util.Scanner;

public class SevenSegments {
	public int getSmall(int a[]) {
		int small = a[0];
		int index = 0;
		for (int i=1;i<a.length;i++) {
			if(small > a[i]) {
				small = a[i];
				index = i;
			}
		}
		return index;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner (System.in);
		int testcases = s.nextInt();
		int length[] = new int[testcases];
		int bulbs[] = new int[10];
		bulbs[0] = 6;
		bulbs[1] = 2;bulbs[2] = 5;bulbs[3] = 5;bulbs[4] = 4;bulbs[5] = 5;
		bulbs[6] = 6;bulbs[7] = 3;bulbs[8] = 7;bulbs[9] = 6;
		SevenSegments ss = new SevenSegments();
		int result[] = new int[testcases];
		for (int i=0;i<testcases;i++) {
			length[i] = s.nextInt();
			int arr[] = new int[length[i]];
			for (int j=0;j<length[i];j++) {
				arr[j] = s.nextInt();
			}
			/**
			 * get small number of bulbs in array
			 * divide the number into digits
			 */
			int sum = 0;
			int b[] = new int[length[i]];
			for (int j=0;j<length[i];j++) {
				sum = 0;
				int x = arr[j];
				int y = 0;
				if (x == 0) {
					sum = bulbs[0];
				}
				while (x > 0) {
					y = x%10;
					sum = sum + bulbs[y];
					x = x/10;
				}
				b[j] = sum;
			}
			result[i] = arr[ss.getSmall(b)];
		}
		for (int i=0;i<testcases;i++) {
			System.out.println(result[i]);
		}
 	}
}
