import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        
        while(testCases>0)
        {
            String direction = sc.next();
            
            int xCoordinate = 0;
            int yCoordinate = 0;
            
            for(int i = 0;i < direction.length();i++)
            {
                switch(direction.charAt(i))
                {
                    case 'S':
                        yCoordinate++;
                        break;
                    case 'N':
                        yCoordinate--;
                        break;
                    case 'E':
                        xCoordinate++;
                        break;
                    case 'W':
                        xCoordinate--;
                        break;
                }
            }
            System.out.println(xCoordinate+" "+yCoordinate);
            testCases--;
        }
    }
}