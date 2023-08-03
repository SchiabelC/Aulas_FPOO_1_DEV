package Atividade01;

import java.util.Scanner;

public class Carro3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a velocidade: ");
        double velocidade = scanner.nextDouble();
        if (velocidade > 80) {
            System.out.println("Você foi multado");

            double multa = (velocidade - 80) * 5;
            System.out.println("O valor a pagar e: " + multa);

        }

    }
}
