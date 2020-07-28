import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        long testCases = sc.nextLong();
        
        while(testCases > 0)
        {
            int size = sc.nextInt();
            long arr[] = new long[size];
            
            for(int i = 0;i < size;i++)
                arr[i]=sc.nextLong();
            
            long sum = 0;
            int ct = 0;
            
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>50 && arr[i]%2==0)
                {
                    sum=arr[i];
                    ct++;
                    break;
                }                 
            }
            
            for(int j=arr.length-1;j>=0;j--)
            {
                 if(arr[j]>50 && arr[j]%2==1)
                 {
                     sum+=arr[j];
                     ct++;
                     break;
                 }
            }
            if(ct==1 || ct==2)
                System.out.println(sum);
            else if(ct==0)
                System.out.println("NOT WON ANY MAN OF THE MATCH AWARD");            
            testCases--;
        }
    }
}