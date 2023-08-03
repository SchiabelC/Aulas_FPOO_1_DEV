package Atividade01;

import java.util.Scanner;

public class Distancia5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos km voce deseja percorrer: ");
        double Km = scanner.nextDouble();
        if(Km <= 200){
        Km = Km * 0.50;
        }
        else{
        Km = Km * 0.45;
        }
        System.out.println("Valor a ser pago pela distancia: " + Km);
    }
}
