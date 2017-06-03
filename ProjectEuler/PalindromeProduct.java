// Problem 4 in ProjectEuler

public class PalindromeProduct {
	public boolean isPalindrome(int num){
		int temp = num;
		int sum = 0;
		while(temp > 0) {
			int x = temp % 10;
			sum = sum * 10 + x;
			temp = temp / 10;
		}
		if (num == sum) return true;
		return false;
	}
	
	public static void main(String[] args) {
		int large = 0;
		PalindromeProduct p = new PalindromeProduct();
		for(int i = 100; i < 1000; i++)
		{
			for(int j=i+1; j < 1000; j++) {
				int product = i * j;
				if (p.isPalindrome(product)) {
					if (large < product) large = product;
				}
			}
		}
			System.out.println(large);
	}
}
