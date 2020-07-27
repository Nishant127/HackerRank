import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        long aPlusb = sc.nextLong();
        long bPlusc = sc.nextLong();
        long aPlusbPlusc = sc.nextLong();
        
        long sub1_marks = aPlusbPlusc - bPlusc ;
        long sub3_marks = aPlusbPlusc - aPlusb;
        long sub2_marks = aPlusbPlusc - (sub1_marks + sub3_marks);
  
        System.out.println(sub1_marks+" "+sub2_marks+" "+sub3_marks);
        
    }
}