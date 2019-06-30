import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner sc=new Scanner(System.in);
        
        int month=sc.nextInt();
        if(month <13 && month>0)
        {
            if(month==2)
            System.out.print("28");
        else 
        {
            if(month>7)
                month++;
            if(month%2!=0)
                System.out.print("31");
            else
                System.out.print("30");
        }
        }
    }
}