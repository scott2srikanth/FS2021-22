package chapter5;
/*
A string can be abbreviated by replacing  number of strings with their lengths excluding first and last characters. For example, a string such as "substitution" could be abbreviated as:

"s10n" ("s ubstitutio n")

Given a string s, return the string abbreviation.

Example 1:

Input: word = "internationalization"
Output: "i18n"

Example 2:

Input: word = "apple"
Output: a3e


Constraints:

1 <= word.length
word consists of only lowercase English letters.
 */

public class ValidWordAbbreviation {

    public static void main(String[] args) {
        System.out.println(validWordAbbreviation("language"));
    }

    private static String validWordAbbreviation(String word) {
        String result="";
        int j = 0, i;
        for (i = 1; i < word.length()-1; i++) {
            j++;
        }
        result = ""+word.charAt(0)+j+word.charAt(word.length()-1);
        return result;
    }
}

