// Problem 9 in ProjectEular

public class Pythogorean {
	public static void main(String[] args) {
		for (int i=1 ; i<1000;i++) {
			for (int j=1;j<1000;j++) {
				int z = (int)Math.sqrt(i*i + j*j);
				if ( i + j + z == 1000 && (i*i+j*j == z*z))
					System.out.println(i*j*z);
			} 
		}
	}
}
