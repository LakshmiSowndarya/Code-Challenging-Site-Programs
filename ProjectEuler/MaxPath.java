// Problem 18 and 67 in ProjectEuler

// insert proper file to get the output

import java.io.BufferedReader;
import java.io.FileReader;

public class MaxPath {
	public int[] getArray(String str,int[] array) {
		String strs[] = str.split(" ");
		for (int i=0;i < strs.length;i++) {
			array[i] = Integer.parseInt(strs[i]);
		}
		return array;
	}
	
	public int[][] treeToArray() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("d:\\file.txt"));
		String line = br.readLine();
		int count = 0;
		String [] strs = new String[100];
		while(line != null) {
			strs[count] = line;
			count++;
			line = br.readLine();
		}
		System.out.println(count);
		int [][] matrix = new int[count][count];
		for (int i = 0; i < count; i++) {
			matrix[i] = getArray(strs[i],matrix[i]);
		}
		return matrix;
	}
	
	public static void main(String args[]) throws Exception {
		// get the tree into Array
		MaxPath m = new MaxPath();
		int a[][] = m.treeToArray();
		for (int i=a.length-2;i>-1;i--) {
			for (int j=0;j<a.length-1;j++) {
				a[i][j] = a[i][j] + Math.max(a[i+1][j], a[i+1][j+1]);
 			}
		}
		System.out.println(a[0][0]);
	}
}
