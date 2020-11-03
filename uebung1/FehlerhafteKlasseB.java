package uebung1;

//Ueberarbeitet
public class FehlerhafteKlasseB {

    public static void main(String[] args)
    {
        short x = (short)33000; // Kommt zu negativer Zahl --> kein mathematischer Sinn // Wertebereich
        char d = 34;
        boolean b = true;
        float g = (float)1e-47;
        int lang = 25;
        char l = 'b';
        int bar = 32148 * 9876 * 10; // Kommt zu negativer Zahl --> kein mathematischer Sinn // Wertebereich

        System.out.println(x+'\n');

        System.out.println(d+'\n');
        System.out.println(b);
        System.out.println(g+'\n');
        System.out.println(lang+'\n');
        System.out.println(l+'\n');
        System.out.println(bar+'\n');

    }
}
