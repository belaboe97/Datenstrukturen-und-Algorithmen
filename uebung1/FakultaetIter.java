package uebung1;

public class FakultaetIter {
    public static void main(String[] args) {
        int fakultaet = 1;
        int n = 5;
        while ( n > 1 )
        {
        fakultaet = fakultaet * n;
                  n   = n - 1;
        }
        System.out.println(fakultaet); 
    }        
}
