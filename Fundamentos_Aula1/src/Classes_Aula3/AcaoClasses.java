package Classes_Aula3;

public class AcaoClasses {

    public static void main(String[] args) {
        Aluno caio  = new Aluno("Caio","caio.gostoso@HOTmail.com.org.br", 4532);
        System.out.println(caio);

        caio.estaEstudando();
        caio.estaEstudando();

        System.out.println(caio);

        caio.naoEstaEstudando();
        System.out.println(caio);

        Carro uno = new Carro("Uno", "Fiat", "amarelo", 2011, 2);
        System.out.println(uno);

        uno.estaAndando();

        System.out.println(uno);

        uno.estaParado();

        System.out.println(uno);
    }
}
