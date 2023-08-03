package Atividade01;

import java.util.Scanner;

public class EnergiaEletrica7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de KW/h consumido: ");
        double KWh = scanner.nextDouble();
        System.out.println("Qual seu tipo de instalação elétrica: (R para residência, I para indústria e C para comércio)");
        char Inst = scanner.next().charAt(0);
    }
}
