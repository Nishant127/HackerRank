import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long aPlusb = sc.nextLong();
        //a+b

        long bPlusc = sc.nextLong();
        //b+c

        long aPlusbPlusc = sc.nextLong();
        //a+b+c
        
        long sub1_marks = aPlusbPlusc - bPlusc ;
        long sub3_marks = aPlusbPlusc - aPlusb;
        long sub2_marks = aPlusbPlusc - (sub1_marks + sub3_marks);
  
        System.out.println(sub1_marks+" "+sub2_marks+" "+sub3_marks);     
    }
}