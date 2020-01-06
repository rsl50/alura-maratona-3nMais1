package br.com.alura.maratona;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        calculaCiclos(999999);

//        while (scanner.hasNextLine()) {
//            int i = scanner.nextInt();
//            int j = scanner.nextInt();
//
//            System.out.println(i + " " + j + " xxx");
//        }
    }

    private static void calculaCiclos(int n) {
        int contagem_ciclos = 1;
        while (n != 1) {
            if (n % 2 == 1) n = n * 3 + 1;
            else n = n / 2;

            contagem_ciclos++;
        }

        System.out.println("Ciclos: " + contagem_ciclos);
    }
}
