package Atividade01;

import java.util.Scanner;

public class Cartao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double desconto = 0;
        double valorParcela = 0;
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite o valor do produto:");
        double valor = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto:");
        double qtdeItens = scanner.nextDouble();
        valor = valor * qtdeItens;
        System.out.println("Credito ou debito? (c para credito | d para debito)");
        char cartao = scanner.next().charAt(0);

        if (cartao == 'd' || cartao == 'D') {
            if (valor <= 100) {
                desconto = valor - 5 * valor / 100;
            }
            if (valor > 100) {
                desconto = valor - 3 * valor / 100;
            }
        }
        if (cartao == 'c' || cartao == 'C') {
            System.out.println("Em quantas vezes deseja parcelar:");
            int qtdeParcelas = scanner.nextInt();
            valorParcela = valor / qtdeParcelas;
        }
        System.out.println("resultado : ");
        System.out.println("Nome do produto : " + nome);
        System.out.println("Quantidade do produto : " + qtdeItens);
        if (cartao == 'D' || cartao == 'd') {
            System.out.println("Valor total : " + desconto);
        }
        if (cartao == 'C' || cartao == 'c') {
            System.out.println("Valor de cada parcela : " + valorParcela);
        }

    }

}

