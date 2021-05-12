package questions.strings;

import java.util.Arrays;

/* Write a java program for the following scenario
 find the longest common prefix string amongst group of strings.

If there is no common prefix, return -1.



Example 1:
Input: 3   // no of strings
"flower","flow","flight"    // strings do not use ""  or , while reading
Output: "fl"


Example 2:

Input: 3   // number of strings
"dog","racecar","car"      // strings do not use ""  or , while reading
Output: -1
Explanation: There is no common prefix among the input strings.


Note;
strings consists of only lower-case English letters.

*/
/*
case=1
input=3
kmit
kmiengineering
kmcse
output=km

case=2
input=4
test
ting
treat
try
output=t

case=3
input=2
kmit
kmit
output=-1
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"kmit","ngit","flight"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] strs) {
        String arr[]=strs;
        if(arr.length==0 || arr == null) return "";
        Arrays.sort(arr);
        String res = "";
        int len = arr[0].length();
        int i=0;
        while(true)
        {
            if(i<len && arr[0].charAt(i)== arr[arr.length-1].charAt(i))  i++;
            else break;
        }
        return arr[0].substring(0,i);
    }
}
