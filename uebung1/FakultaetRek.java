package uebung1;

public class FakultaetRek {
    public static void main(String[] args) {
        System.out.println(fakultaet(5));
    }
    private static int fakultaet(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fakultaet(n - 1) * n;
        }
    }
}

