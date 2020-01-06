package br.com.alura.maratona;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        calculaPara(22);

//        while (scanner.hasNextLine()) {
//            int i = scanner.nextInt();
//            int j = scanner.nextInt();
//
//            System.out.println(i + " " + j + " xxx");
//        }
    }

    private static void calculaPara(int n) {
        System.out.println(n);
        while (n != 1) {
            if (n % 2 == 1) n = n * 3 + 1;
            else n = n / 2;

            System.out.println(n);
        }
    }
}
