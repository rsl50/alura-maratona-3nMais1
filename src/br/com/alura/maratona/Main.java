package br.com.alura.maratona;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        calculaCiclos(999999);

        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            int maiorCiclo = 1;
            for (int n = Math.min(i, j); n <= Math.max(i, j); n++) {
                int resultado = calculaCiclos(n);
                if (resultado > maiorCiclo) maiorCiclo = resultado;
            }

            System.out.println(i + " " + j + " " + maiorCiclo);
        }
    }

    private static int calculaCiclos(int n) {
        int contagem_ciclos = 1;
        while (n != 1) {
            if (n % 2 == 1) n = n * 3 + 1;
            else n = n / 2;

            contagem_ciclos++;

            //if (contagem_ciclos > ‭4294967295‬) break;
        }

        return contagem_ciclos;
    }
}
