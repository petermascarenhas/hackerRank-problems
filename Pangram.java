//(Pangrams are sentences constructed by using every letter of the alphabet at least once.)


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String pangram = in.nextLine();
        pangram=pangram.toLowerCase().replaceAll("\\s+","");
        System.out.println( (isPangram(pangram)) ? "pangram" : "not pangram" );
        
    }
        
        
    public static boolean isPangram(String pangram) {
        char[] uniqueAlpha= pangram.toCharArray();
        TreeSet<Character> count= new TreeSet<Character>();
        for(char c : uniqueAlpha) {
            if(!Character.isLetter(c))   
                break;    
            else 
                count.add(c);
        }
        if(count.size() != 26)
            return false;
        else 
            return true;
    }
}