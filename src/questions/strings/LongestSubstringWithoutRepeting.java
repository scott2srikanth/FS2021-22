package questions.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Write a java program for the following scenario
Given a string s, find the length of the longest substring without repeating characters.



Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Example 4:
Input: s = ""
Output: 0

 */
/*
case=1
input=abcdaeiou
output=8

case=2
input=dress
output=4

case=3
input=kmitkmit
output=4

case=4
input=itititititititit
output=2
 */
public class LongestSubstringWithoutRepeting {
    public static void main(String[] args) {
        solver1();
    }

    public static void solver(){
        String s="abcabcbb";
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < s.length() ; i++) {
            int[] visited = new int[26];
            for (int j = i; j <s.length(); j++) {
                if(visited[s.charAt(j)-'a']==1)
                    break;
                else{
                    max=Math.max(max,j-i+1);
                    visited[s.charAt(j)-'a'] = 1;
                }
            }
            System.out.println(Arrays.toString(visited));
        }
        System.out.println(max);
    }

    public static void solver1(){
        String s="dress";
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < s.length() ; i++) {
            List<Character> visited = new ArrayList<Character>();
            for (int j = i; j <s.length(); j++) {
                if(visited.contains(s.charAt(j)))
                    break;
                else{
                    max=Math.max(max,visited.size()+1);
                    visited.add(s.charAt(j));
                }
            }

            System.out.println(visited);
        }
        System.out.println(max);
    }


}
