/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/roy-and-profile-picture/
*/

import java.util.Scanner;

public class ProfilePhoto {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int L = s.nextInt();
		int N = s.nextInt();
		int[][] photos = new int[N][2];
		for (int i = 0;i<N;i++) {
			photos[i][0] = s.nextInt();
			photos[i][1] = s.nextInt();
		}
		for (int i=0;i<N;i++) {
			if (photos[i][0] < L || photos[i][1] < L)
				System.out.println("UPLOAD ANOTHER");
			else if(photos[i][0] >= L && photos[i][1] >= L && photos[i][0] == photos[i][1]) {
				System.out.println("ACCEPTED");
			}
			else {
				System.out.println("CROP IT");
			}
		}
	}
}
