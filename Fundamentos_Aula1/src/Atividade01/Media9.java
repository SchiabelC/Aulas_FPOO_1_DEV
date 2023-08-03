package Atividade01;

import java.util.Scanner;

public class Media9 {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
    int rs = media(10,10,10,10);
        System.out.println("A media:" + rs);
        
    }
    
    public static int media(int... valores) {
    int resultado = 0;
   
        for (int i = 0; i < valores.length; i++) {
            int valor = valores[i];
            resultado += valor;
        }
        resultado = resultado / valores.length;
        return resultado;
    }
}
    

