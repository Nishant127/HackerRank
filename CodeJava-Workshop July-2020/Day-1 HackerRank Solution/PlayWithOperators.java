import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        //taking input varibles
        long no1 = sc.nextInt();
        long no2 = sc.nextInt();
        Boolean val = sc.nextBoolean();

        long xor = no1 ^ no2;
        long or = no1 | no2;
        long and = no1 & no2;
        Boolean invert = !val;

        //typecasting into its respective : datatype
        System.out.println((long)(no1+no2));
        System.out.println((long)(no1-no2));
        System.out.println((long)(no1*no2));
        System.out.println((float)(no1/no2));
        System.out.println((long)(no1%no2));

        System.out.println(and);
        System.out.println(or);
        System.out.println(xor);
        System.out.println(invert);
    }
}