package br.com.alura.maratona;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        calculaCiclos(999999);

        while (scanner.hasNextLine()) {
            int menor = scanner.nextInt();
            int maior = scanner.nextInt();

            int maiorCiclo = 1;
            for (int n = menor; n <= maior; n++) {
                int resultado = calculaCiclos(n);
                if (resultado > maiorCiclo) maiorCiclo = resultado;
            }

            System.out.println(menor + " " + maior + " " + maiorCiclo);
        }
    }

    private static int calculaCiclos(int n) {
        int contagem_ciclos = 1;
        while (n != 1) {
            if (n % 2 == 1) n = n * 3 + 1;
            else n = n / 2;

            contagem_ciclos++;
        }

        return contagem_ciclos;
    }
}
