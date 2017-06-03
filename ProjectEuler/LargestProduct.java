// Problem 8 in ProjectEular

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargestProduct {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("d:/file.txt"));
	    StringBuilder sb = new StringBuilder();
	    String line = br.readLine();

	    while (line != null) {
	        sb.append(line);
	        line = br.readLine();
	    }
	    String everything = sb.toString();
		int arr[] = new int[2000];
		for (int i=0;i < everything.length();i++) {
			arr[i] = Integer.parseInt(everything.charAt(i) + "");
		}
		long large = 0;
		for(int i=0;i<everything.length();i++) {
			long product = 1;
			 for(int j=0;j < 13;j++){
				 product = product * arr[i + j];
				 if(everything.length()<i + j)
					 break;
			 }
			 if (product > large) large = product;
		}
		System.out.println(large);
	}
}
