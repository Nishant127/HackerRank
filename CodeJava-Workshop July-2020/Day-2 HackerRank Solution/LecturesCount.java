import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        
        while(testCases>0)
        {
            String line = sc.next();
            
            String sentence = line.toLowerCase();
            
            long vowelCount = 0;
            long consonantCount = 0;
            
            for(int i=0;i<sentence.length();i++)
            {
                if(sentence.charAt(i)=='a' || sentence.charAt(i)=='e' || sentence.charAt(i)=='i' || sentence.charAt(i)=='o' || sentence.charAt(i)=='u')
                    vowelCount++;
                else if(sentence.charAt(i)==' ')
                    continue;
                else
                    consonantCount++;
            }
            long difference = vowelCount - consonantCount;
            
            System.out.println(Math.max(vowelCount,consonantCount));
            System.out.println(Math.abs(difference));
            
            testCases--;
        }
    }
}