/*
* The Question is given in the following link
* https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/life-the-universe-and-everything/
*/

import java.util.*;
public class Life {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        while (num != 42) {
            System.out.println(num);
            num = s.nextInt();
        }
    }
}