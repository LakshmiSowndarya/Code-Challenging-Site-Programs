// Problem 7 in ProjectEular

public class NthPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 0;
		for (int i = 2; i < 1000000; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) count ++;
			}
			if (count == 0) n++;
			if (n == 10001) {
				System.out.println(i);
				break;
			}
		}
	}

}
