package questions.strings;

public class String_RemoveVowel {
    public static void main(String[] args) {
        String res="";

        String s="welcometokmit";
        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);
            if("aeiou".indexOf(c)==-1)
                res=res+c;
        }
        System.out.println(res);
    }
}
