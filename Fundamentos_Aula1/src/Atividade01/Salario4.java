package Atividade01;

import java.util.Scanner;

public class Salario4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu salario: ");
        double salario = scanner.nextDouble();
        if (salario > 1350) {
            salario = salario + salario * 10 / 100;
        }
        else{ 
            salario = salario + salario * 15 / 100;}
        System.out.println("O seu salario atual: " + salario);
}
}
