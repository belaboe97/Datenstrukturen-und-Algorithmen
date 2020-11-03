
package uebung1;

import java.util.Scanner;

// AUFGABE VON ITERATIVE ZU REKURSIV
public class Main {

    static int result;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter start of interval");
        int from = scan.nextInt();
        System.out.println("Please enter start of interval");
        int to = scan.nextInt();

        System.out.println(" Result Recursive: " + recursiveCalculate(from, to, from));
        System.out.println(" Result Iterative: " + iterativeCalculate(from, to));
        System.out.println(" Result Iterative: " + iterativeCalculate(from, to));

        scan.close();

    }

    public static long recursiveCalculate(int from, int to, int start) {

        if (from < to) {
            result = start + (from + 1);
            start = result;
            from++;
            return recursiveCalculate(from, to, start);
        } else {
            return result;
        }
    }

    public static long iterativeCalculate(int from, int to) {
        long result = 0;
        for (int i = from; i <= to; i++) {
            result = result + i;
        }
        return result;
    }

    public static long rekursiveCalculate(int from, int to) {
        if(to > from) {
            return to + rekursiveCalculate(from, to - 1);
        }
        return 0;

    }
}



