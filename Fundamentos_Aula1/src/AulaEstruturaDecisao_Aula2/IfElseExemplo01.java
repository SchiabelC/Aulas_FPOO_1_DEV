package AulaEstruturaDecisao_Aula2;

public class IfElseExemplo01 {
    public static void main(String[] args) {
        int idade = 17;
        
        if (idade >= 18) {
            System.out.println("Voce pode entrar na  festa");
        } else {
            System.out.println("Voce nao pode entrar na festa");
        }
        int temperatura = 15;
        if (temperatura == 15) {
            System.out.println("Esta ficando frio");
        } else if(temperatura == 20) {
            System.out.println("Esta ficando agradavel");
        }
        else if (temperatura == 30){
            System.out.println("Esta ficando calor");
       }
    }
}
