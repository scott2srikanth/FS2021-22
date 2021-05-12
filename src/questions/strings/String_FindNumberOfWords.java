package questions.strings;
/*
Given a String, the task is to find number of words in a string.

input=
The quick brown fox jumps over the lazy dog
output=
The quick brown fox jumps over the lazy dog
9

input=
     The  five   boxing    wizards     jump      quickly
output=
The five boxing wizards jump quickly
6

 */
/*
case=1
input=
The quick brown fox jumps over the lazy dog
output=
The quick brown fox jumps over the lazy dog
9

case=2
input=
     The  five   boxing    wizards     jump      quickly
output=
The five boxing wizards jump quickly
6

 */
public class String_FindNumberOfWords {
    public static void main(String[] args) {
        String str="a$B%c@d! 4";
        System.out.println(str.replaceAll("[^\\w\\d]+",""));
    }
}
