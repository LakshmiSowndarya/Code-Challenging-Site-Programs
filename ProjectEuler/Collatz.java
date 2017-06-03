// Problem 14 in ProjectEular

public class Collatz {

	public static void main(String[] args) {
		int large=0;
		int num=0;
		long n;
		for (int i=2;i<=1000000;i++) {
			int count =0;
			n = i;
			while (n > 1) {
				if (n%2 == 0)
					n = n/2;
				else
					n = 3*n + 1;
				count++;
			}
			if(count>large) {
				large =count;
				num = i;
			}
		}
		System.out.println(num);
	}

}
