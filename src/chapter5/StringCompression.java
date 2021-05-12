package chapter5;
/*
Given an String, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in string:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead be stored in the input character array chars.

After you are done modifying the input array, return the new compressed string.


Example 1:

Input: s = "aabbccc"
Output: a2b2c3 // the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
Example 2:


Constraints:

1 <= chars.length <= 2000
chars[i] is a lower-case English letter, upper-case English letter, digit, or symbol.
 */
public class StringCompression {
    public static void main(String[] args) {
        String s="aabbeeeeeeeedddvvvvvvccc";
        System.out.println(compress(s));
    }
    public static String compress(String s) {
        StringBuffer sb = new StringBuffer();
        int count=1;
        char[] chars = s.toCharArray();

        sb.append(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if(chars[i-1] != chars[i]) {
                if(count > 1) {
                    sb.append( count );
                }
                sb.append(chars[i]);
                count = 1;
            }else {
                count++;
            }
        }
        if(count > 1 ) {
            sb.append(count);
        }
        return sb.toString();
    }
}
