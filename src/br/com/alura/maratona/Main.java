package br.com.alura.maratona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            System.out.println(i + " " + j + " xxx");
        }
    }
}
