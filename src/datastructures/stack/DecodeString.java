package datastructures.stack;

import java.util.Stack;

/*
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].



Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
Example 4:

Input: s = "abc3[cd]xyz"
Output: "abccdcdcdxyz"


Constraints:

1 <= s.length <= 30
s consists of lowercase English letters, digits, and square brackets '[]'.
s is guaranteed to be a valid input.
All the integers in s are in the range [1, 300].

*/
public class DecodeString {
    public static void main(String[] args) {
        String s = "3[ab]";
        System.out.println(decodeString(s));
    }
    public static String decodeString(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        int pos = 0;
        int num = 0;
        while(pos < s.length()){
            char c = s.charAt(pos);
            pos++;
            if(Character.isDigit(c)){
                int digit = Integer.parseInt(String.valueOf(c));
                num = num*10+digit;
                continue;
            }
            if(num > 0){
                String numStr = Integer.toString(num);
                st.push(numStr);
                String posStr = Integer.toString(res.length());
                st.push(posStr);
                st.push("[");
                num = 0;
            }
            System.out.println(st);
            if(Character.isLetter(c)){
                res.append(Character.toString(c));
            }
            if(c == ']'){
                st.pop();
                int startPos = Integer.parseInt(st.pop());
                int endPos = res.length();
                int repeat = Integer.parseInt(st.pop());
                repeat--;
                String substring = res.substring(startPos,endPos);
                for(int i=1; i<=repeat; i++){
                    res.append(substring);
                }
            }
        }
        return res.toString();
    }
}
