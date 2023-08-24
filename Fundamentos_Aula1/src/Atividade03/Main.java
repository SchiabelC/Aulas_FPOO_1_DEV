package Atividade03;

public class Main {
    public static void main(String[] args) {
        Sala sala01 = new Sala(30, 15, 1, true, 30);
        System.out.println(sala01);
        sala01.estaLimpando();
        System.out.println(sala01);
        sala01.naoEstaLimpando();
        sala01.PassarDia();
        System.out.println(sala01);

        Computador computador01 = new Computador(EnumMemoria.DEZOITO_GIGAS_RAM, EnumProcessor.CPU, "2T","Windows" );
        System.out.println(computador01);
        computador01.ligar();
        System.out.println(computador01);
        computador01.desligar();
        System.out.println(computador01);

        Curso administracao = new Curso("Administracao", "Administra as coisas",0);
        System.out.println(administracao);
        administracao.promover(CategoriaEnum.BRONZE);
        System.out.println(administracao);
        administracao.promover(CategoriaEnum.PRATA);
        System.out.println(administracao);
        administracao.promover(CategoriaEnum.DIAMANTE);
        System.out.println(administracao);
        administracao.expulso();
        System.out.println(administracao);
    }

}
