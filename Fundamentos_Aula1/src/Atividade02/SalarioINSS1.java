package Atividade02;

import java.util.Scanner;

public class SalarioINSS1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu cargo ?");
        String cargo = scanner.nextLine();
        //INSS = salario * (INSS / 100)
        double INSS;
        double salario;
        double convenio;
        if (cargo == "Gerente" || cargo == "gerente") {
            INSS = 8;
            salario = 5590;
            convenio = 289;
            INSS = salario * (INSS / 100);
            salario  = salario - INSS - convenio;
            System.out.println("Seu salario é: " + salario);
        }
               if (cargo == "Supervisor" || cargo == "supervisor") {
            INSS = 7;
            salario = 4128;
            convenio = 239;
            INSS = salario * (INSS / 100);
            salario  = salario - INSS - convenio;
            System.out.println("Seu salario é: " + salario);
        }
                      if (cargo == "Tecnico" || cargo == "tecnico") {
            INSS = 4;
            salario = 3789;
            convenio = 189;
            INSS = salario * (INSS / 100);
            salario  = salario - INSS - convenio;
            System.out.println("Seu salario é: " + salario);
        }
                             if (cargo == "Auxiliar" || cargo == "auxiliar") {
            INSS = 2;
            salario = 2345;
            convenio = 156;
            INSS = salario * (INSS / 100);
            salario  = salario - INSS - convenio;
            System.out.println("Seu salario é: " + salario);
        }
    }
}
