package questions.strings;
/*
Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Example 2:

Input: s = " "
Output: 0
 */
public class String_LastWordLength {
    public static void main(String[] args) {
        String s = "Hello    world    #   ";
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s){
        String[] arr=s.split("[^a-zA-Z0-9]+");
        if(arr.length<=0){
            return 0;
        }
        return arr[arr.length-1].length();
    }
}
