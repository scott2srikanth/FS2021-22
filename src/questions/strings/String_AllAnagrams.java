package questions.strings;

import java.util.Arrays;

/*
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class String_AllAnagrams {
    public static void main(String[] args) {
        String s="abab";
        String p="ab";
        System.out.println(Arrays.toString(solver(s,p)));

    }
    public static int[] solver(String s, String p) {
        int[] out = new int[100];
        for (int i = 0; i < 100; i++) {
            out[i]=-1;
        }


        // Check if a given input is valid.
        if (s == null || s.length() == 0 || s.length() < p.length()) {
            return out;
        }

        int[] pMap = new int[26];
        int sLen = s.length(), pLen = p.length();

        // Create a frequency map for string p.
        for (int i = 0; i < pLen; i++) {
            pMap[p.charAt(i) - 'a']++;
        }

        int left = 0, right = 0, counter = pLen;
        int rightCharIdxInMap, leftCharIdxInMap;
        int i=0;

        // Slide window and use counter & map to keep track of found anagrams.
        while (right < sLen) {
            rightCharIdxInMap = s.charAt(right) - 'a';

            // If char at right ptr is part of an anagram,
            // then decrement counter by 1.
            if (pMap[rightCharIdxInMap] >= 1) {
                counter--;
            }

            // Always decrement char at right ptr by 1 in map
            // and advance right ptr by 1.
            pMap[rightCharIdxInMap]--;
            right++;

            // If counter == 0, means we have found an anagram.
            // The start of the sliding window is still at left ptr,
            // so add left ptr to the out list.
            if (counter == 0) {
                out[i++]=left;
               // out.add(left);
            }

            // If we are done with a window interval,
            // then move left to make another valid window
            // as right ptr has already advanced by 1.
            if (right - left == pLen) {
                leftCharIdxInMap = s.charAt(left) - 'a';

                // If pMap[leftCharIdxInMap] is non-negative,
                // char at left ptr was part of an anagram.
                // We already decremented counter before coming here,
                // so add 1 back because char at left ptr will be excluded
                // in the next window.
                if (pMap[leftCharIdxInMap] >= 0) {
                    counter++;
                }

                // Increment the frequency of char at left ptr because it will
                // be excluded in the next window.
                pMap[leftCharIdxInMap]++;

                // Finally, move left to the right by 1 to make a new valid window.
                left++;
            }
        }

        return out;
    }
}
