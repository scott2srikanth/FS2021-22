package questions.strings;

/*
Given a string, print the frequency of characters in decreasing order.

Example 1:

Input:
"tree"

Output:
e : 2
r : 1
t : 1

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'.
Example 2:

Input:
"cccaaa"

Output:
a : 3
c : 3

Explanation:
Both 'c' and 'a' appear three times.
Example 3:

Input:
"cabb"

Output:
a : 1
b : 2
c : 1


Note only small cases allowed.
 */


public class PrintCharactersByFrequency {
    public static void main(String[] args) {
        String s="kmitonline";
        int[] arr = new int[26];
        for (int i = 0; i <s.length(); i++) {
            arr[s.charAt(i)-'a'] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                System.out.println(((char)(i+'a'))+" : "+arr[i]);
            }
        }
    }
}
