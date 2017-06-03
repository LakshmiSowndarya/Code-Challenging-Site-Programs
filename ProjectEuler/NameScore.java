// Problem 22 in ProjectEuler

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class NameScore {
	public int findScore(String a) {
		int sum = 0;
		for (int i = 0; i < a.length(); i++) {
			sum = sum + (a.charAt(i) - 64);
		}
		return sum;
	}
	public static void main(String args[]) throws Exception {
		BufferedReader b = new BufferedReader(new FileReader("d:\\file1.txt"));
		String line = b.readLine();
		StringBuffer data = new StringBuffer("");
		while (line!=null) {
			data = data.append(new StringBuffer(line)); 
			line = b.readLine();
		}
		String strData = data.toString();
		String strs[] = strData.split(",");
		for (int i=0;i<strs.length;i++) {
			strs[i] = strs[i].replace("\"", "");
		}
		Arrays.sort(strs);
		NameScore n = new NameScore();
		int sum = 0;
		for (int i=0;i <strs.length;i++) {
			sum = sum + ((i + 1) * n.findScore(strs[i]));
		}
		System.out.println(sum);
	}
}
