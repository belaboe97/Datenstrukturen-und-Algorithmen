package uebung1;
import java.util.Arrays;

public class StringRek {

    public static void main(String[]args){

        String[] wordArray1 = {"Hey","whats","up","my","Friend"};
       // String[] wordArray2 = {"Hey","whats","up","my","Friend"};
        String[] wordArray2 = {"LOL","BOOO","YEA","ZZ","DDD"};

        System.out.println("Rekursive Loesung: " + (rekursiveDoSomething(wordArray1,wordArray2))); //(rekursiveDoSomething(wordArray1,wordArray2)).getClass().getName() --> String
        System.out.println("Iterative Loesung: " + (mergeString(wordArray1,wordArray2)));

    }
    //LOESUNG
    public static String mergeString(String[] words1, String[] words2)
    {
        String output = "";
        for(int i = 0; i < words1.length ; i++){
            output += words1[i]+" "+words2[i]+" ";
        }
        return output.trim();
    }

    public static String rekursiveDoSomething(String[] words1, String[] words2)
    {
        if (words1.length == 0 && words2.length == 0) {
            return "";
        } else {
            return (
                    words1[0] + " " +
                            words2[0] + " " +
                            rekursiveDoSomething(
                                    Arrays.copyOfRange(words1, 1, words1.length),
                                    Arrays.copyOfRange(words2, 1, words2.length))
            ).trim();
        }
    }

}
