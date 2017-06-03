// Problem 2 in ProjectEuler

public class Fibnocci {

    public static void main(String args[]) {
        int sum = 0;
        int a=0,b=1;
        while (b < 4000000) {
        	int temp=b;
            b = a+b;
            a=temp;
            if (b%2 == 0)
            {
                sum = sum + b;
            }
        }
        System.out.println(sum);
    }
}