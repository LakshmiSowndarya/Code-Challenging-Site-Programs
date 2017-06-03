/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/print-hackerearth/
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HackerEarth {
	public int getSmall(int a[]) {
		int small = a[0];
		for (int i=0;i<a.length;i++){
			if (small > a[i]) small = a[i];
		}
		return small;
 	}
	public int getCharCount(char a, String b) {
		int count = 0;
		for (int i=0;i<b.length();i++) {
			if (b.charAt(i) == a) count ++;
		}
		return count;
	}
	public static void main(String srgs[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String str = s.next();
		String str1 = "hackerearth";
		Map<String, Integer> m = new HashMap<String, Integer>();
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		// h a c k e r e a r t h
		/**
		 * h -2
		 * a - 2
		 * c-1 k-1 e-2 r-2 t-1
		 */
		/**
		 * get the count of all the chars in the string
		 * get the count of chars in hackerearth
		 * then divide the 1 with 2
		 * store it in the array
		 * find the least
		 */
		HackerEarth h = new HackerEarth();
		m.put("h", h.getCharCount('h', str));
		m.put("a", h.getCharCount('a', str));
		m.put("e", h.getCharCount('e', str));
		m.put("r", h.getCharCount('r', str));
		m.put("c", h.getCharCount('c', str));
		m.put("k", h.getCharCount('k', str));
		m.put("t", h.getCharCount('t', str));
		
		m1.put("h", h.getCharCount('h', str1));
		m1.put("a", h.getCharCount('a', str1));
		m1.put("e", h.getCharCount('e', str1));
		m1.put("r", h.getCharCount('r', str1));
		m1.put("c", h.getCharCount('c', str1));
		m1.put("k", h.getCharCount('k', str1));
		m1.put("t", h.getCharCount('t', str1));
		
		int a[] = new int[m.size()];
		int b[] = new int[m.size()];
		int y=0;
		for (Map.Entry<String, Integer> k : m.entrySet()){
			a[y++] = k.getValue();
		}
		int z=0;
		for (Map.Entry<String, Integer> k : m1.entrySet()){
			b[z++] = k.getValue();
		}
		int c[] = new int[m.size()];
		for (int i=0;i<m.size();i++) {
			c[i] = a[i]/b[i];
		}
		System.out.println(h.getSmall(c));
	}
}


