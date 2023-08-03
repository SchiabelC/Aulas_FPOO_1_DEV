package Atividade01;

import java.util.Scanner;

public class EnergiaEletrica7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de KW/h consumido: ");
        double KWh = scanner.nextDouble();
        System.out.println("Qual seu tipo de instalação elétrica: (R para residência, I para indústria e C para comércio)");
        char inst = scanner.next().charAt(0);
        if (inst == 'r'|| inst == 'R') {
            if(KWh <= 500){
            KWh = KWh * 0.40;
            }
            else{
            KWh = KWh * 0.65;
        }}
            if (inst == 'c'|| inst == 'C') {
            if(KWh <= 1000){
            KWh = KWh * 0.55;
            }
            else{
            KWh = KWh * 0.60;
        }}
            if (inst == 'i'|| inst == 'I') {
            if(KWh <= 5000){
            KWh = KWh * 0.55;
            }
            else{
            KWh = KWh * 0.60;
        }}
                System.out.println("Valor a ser pago: " + KWh);
    }
}
