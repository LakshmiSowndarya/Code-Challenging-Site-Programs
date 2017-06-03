// Problem 5 in ProjectEular

public class SmallestMultiple {

	public double gcd(double a, double b) {
		if (a%b == 0) return b;
		else return gcd(b, a%b);
	}
	
	public double lcm(double a, double b){
		if (b > a) {
			double temp = a;
			a = b;
			b = temp;
		}
		double gcd1 = gcd(a,b);
		double lcm1 = a*b / gcd1;
		return lcm1;
	}
	
	public static void main(String[] args) {
		double l = 1;
		SmallestMultiple s = new SmallestMultiple();
		for (int i = 1; i <= 20; i++) {
			l = s.lcm(l, i);
		}
		System.out.println((int)l);
	}

}
