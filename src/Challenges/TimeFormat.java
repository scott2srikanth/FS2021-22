package Challenges;
/*  Write a Java program to convert a given integer (in seconds) to hours, minutes and seconds.

Sample input/output
 25300		// seconds
 7:1:40        // 7 hours 1 minute 40 seconds

 */
/*
case=1
input=25301
output=7:1:41

case=2
input=25299
output=7:1:39

makeinindia
CVCVCVCV
 */
public class TimeFormat {
    public static void main(String[] args) {
        int seconds;
        int minutes ;
        int hours;
        seconds = 25299;
        hours = seconds / 3600;
        minutes = (seconds%3600)/60;
        int seconds_output = (seconds% 3600)%60;

        System.out.println(hours  + ":" + minutes + ":" + seconds_output);
    }
}
