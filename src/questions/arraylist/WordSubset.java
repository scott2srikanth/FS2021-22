package questions.arraylist;
/*
We are given two arrays A and B of words.  Each word is a string of lowercase letters.

Now, say that word b is a subset of word a if every letter in b occurs in a, including multiplicity.  For example, "wrr" is a subset of "warrior", but is not a subset of "world".

Now say a word a from A is universal if for every b in B, b is a subset of a.

Return a list of all universal words in A.  You can return the words in any order.



Example 1:

Input: A =
5
amazon
apple
facebook
google
kmitcollege
2
e
o
Output: ["facebook","google","kmitcollege"]
 */
import java.util.ArrayList;

public class WordSubset {
    public static void main(String[] args) {
        String[] a={"amazon","apple","facebook","google","kmitcollege"}, b = {"e","o"};
        System.out.println(wordSubsets(a,b));
    }

    public static ArrayList<String> wordSubsets(String[] A, String[] B) {
        //int[] maxNeeded = new int[26]; // stores maximum count of each character in b required to be in a
        int[] charCounts;

        int[] needed = new int[26];

        for(String b: B){
           // charCounts = new int[26];
            for(char x: b.toCharArray()){
               // charCounts[x - 'a']++;
                needed[x - 'a']+=1;
                //maxNeeded[x - 'a'] = Math.max(maxNeeded[x - 'a'], charCounts[x - 'a']);
            }
        }

        ArrayList<String> result = new ArrayList<>();
        for(String a: A){
            charCounts = new int[26];

            for(char x: a.toCharArray()) charCounts[x - 'a']++;

            boolean flag = true;
            for(int i = 0; i < charCounts.length; i++){
                if(needed[i] > charCounts[i]){ // b requires more of character (i + 'a') to be the universal string, hence this string a is rejected
                    flag = false;
                    break;
                }
            }

            if(flag)
                result.add(a);
        }

        return result;
    }
}
