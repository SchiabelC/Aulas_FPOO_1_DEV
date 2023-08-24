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

        Carro uno = new Carro("Uno", "Fiat", CorEnum.AZUL, 2011, 2, 0);
        System.out.println(uno);
uno.estaAndando();
        uno.trocarDeMarcha(MarchaEnum.PRIMEIRA_MARCHA);
        System.out.println(uno);
        uno.trocarDeMarcha(MarchaEnum.SEGUNDA_MARCHA);
        System.out.println(uno);
        uno.trocarDeMarcha(MarchaEnum.QUINTA_MARCHA);

        System.out.println(uno);

        uno.estaParado();

        System.out.println(uno);
    }
}
