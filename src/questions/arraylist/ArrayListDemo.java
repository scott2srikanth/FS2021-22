package questions.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
Write a java program for the following scenario
Given a string s, find the matching word, remove the word from the string and print the remaining string

Example 1:
Input: s = "Welcome to KMIT College"
"KMIT"
Output: "Welcome to College"

Example 2:
Input: s = "Happy Coding Learning."
"and"
Output: "Not found"

Example 3:
Input: s = "Welcome to KMIT College"
"kmit"
Output: "Not found"
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        String s="Welcome to KMIT College";
        String k="KMIT";
        System.out.println(solver(s,k));
    }

    public static String solver(String s,String k){
        String[] str = s.split(" ");
        ArrayList list = new ArrayList(Arrays.asList(str));
        if(list.contains(k)){
            list.remove(k);
            return s.join(" ",list);
        }
        else {
         return "Not found";
        }
    }

}
