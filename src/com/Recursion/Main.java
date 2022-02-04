package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// printing the permutations of a string.

        permutations("","abc");

    }
    public static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);         // first substring.
            String s = p.substring(i,p.length());  // second substring
            permutations(f+ch+s,up.substring(1));  // combined the string with character by calling the function.
        }
    }
}
/* As like earlier in recursion pattern , every function was calling two recursion calls
but in this question function was calling , in general process was calling process +1 function calls
thats why we are taking loop till p.length()+1.
 */