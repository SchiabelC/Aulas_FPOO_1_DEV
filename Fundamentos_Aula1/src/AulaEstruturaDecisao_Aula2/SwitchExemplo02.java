package AulaEstruturaDecisao_Aula2;

public class SwitchExemplo02 {
    public static void main(String[] args) {
        int temperatura = 15;
        switch (temperatura) {
            case 15:
                System.out.println("Esta ficando frio");
                break;
            case 20:
                System.out.println("Esta ficando agradavel");
                break;
            case 30:
                System.out.println("Esta ficando calor");
                break;
            default:
                System.out.println("Nao identifiquei a temperatura");
                throw new AssertionError();
        }
    }
}
