package Atividade02;

import java.util.Scanner;

public class Imovel02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = 0;
        double largura;
        double comprimento;
        double area;
        System.out.println("Informe a largura do terreno:");
        largura = scanner.nextDouble();
        System.out.println("Informe o comprimento do terreno:");
        comprimento = scanner.nextDouble();
        area = largura * comprimento;
        if (area <= 350) {
           valor = area * 9.50;
           if (area <= 250){
           valor = area * 8.50;}
        } else if(area > 350 ){
            valor = area * 11.50;
        }
        System.out.println("O valor final sera: " + valor);
    }
}
