// Problem 10 in ProjectEular

public class SumOfPrimes {

	/**
	 * @param args
	 */
	public boolean isPrime(int num) {
		for (int i=2;i<=Math.sqrt(num);i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfPrimes p = new SumOfPrimes();
		long sum = 0;
		for (int i=2;i<2000000;i++) {
			if (p.isPrime(i)) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
