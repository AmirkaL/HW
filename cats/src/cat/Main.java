package cat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 10 == 0) System.out.println(n + " " + "кот" + "ов");
        else if (n % 100> 10 && n % 100 < 20) System.out.println(n + " " + "кот" + "ов");
        else if (n % 10 < 5) System.out.println(n + " " + "кот" + (n % 10 > 1? "а" :""));
        else System.out.println(n + " " + "кот" + "ов");

    }
}