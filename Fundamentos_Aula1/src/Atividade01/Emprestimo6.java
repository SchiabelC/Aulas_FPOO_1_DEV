package Atividade01;

import java.util.Scanner;

public class Emprestimo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor da casa: ");
        double valorCasa = scanner.nextDouble();
        System.out.println("Qual seu salario: ");
        double salario = scanner.nextDouble();
        System.out.println("Quantidade de anos a pagar: ");
        double qtdeAnos = scanner.nextDouble();
        qtdeAnos = qtdeAnos * 12;
        double prestacao = valorCasa / qtdeAnos;
        if (prestacao < 30 * salario / 100 ) {
            System.out.println("Prestacao Aprovada");
        }
        else{
            System.out.println("Prestacao Recusada");
        }
    }
}
