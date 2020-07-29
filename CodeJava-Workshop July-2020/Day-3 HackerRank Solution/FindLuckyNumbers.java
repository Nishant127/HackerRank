import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        
        while(testCases>0)
        {
            String numbers = sc.next();
            
            //calculating length of input string
            int length = numbers.length();
            
                if(numbers.contains("44") || numbers.contains("77"))
                {
                    //check whether string contains leading or trailing zeros
                    if(numbers.charAt(0)=='0' || numbers.charAt(length-1)=='0')
                        System.out.println("NO");
                    else
                        System.out.println("YES");       
                }
                else
                {
                    System.out.println("NO");
                }
            testCases--;
        }
    }
}