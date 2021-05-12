package chapter5;
/* Write a java program with lambda expression function
that keeps only strings with repeating identical characters
(in other words, it has a set size of 1).

Examples
input=
aaaaaa
bc
d
eeee
xyz
output= aaaaaa
d
eeee


identicalFilter(["88", "999", "22", "545", "133"])
["88", "999", "22"]


Notes
--> array size is fixed to 5
--> print -1 if no string is returned.
--> A string with a single character is trivially counted as a string with repeating
identical characters.
--> If there are no strings with repeating identical characters,
return an empty array.
*/
/*

 */
@FunctionalInterface
interface repeatstr
{
    void findstr(String[] st);
}

public class RepeteChar {
    public static void main (String[] args) {
        /* code */
    }
}
