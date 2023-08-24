package Classes_Aula3;

public class Carro {

    private String modelo;

    private String marca;

    private CorEnum cor;

    private int ano;

    private int rodas;

    private int marcha;

    private boolean estaEmRe;

    private boolean andando;

    private double kmRodados;


    public Carro(String modelo, String marca, CorEnum cor, int ano, int rodas, int marcha) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.rodas = rodas;
        this.marcha = marcha;
        this.andando = false;
        this.kmRodados = 0;
    }

    public void trocarDeMarcha(MarchaEnum novaMarcha) {
        int diferenca = novaMarcha.getNumeroMarcha() - this.marcha;


    if(diferenca == 1) {
        this.marcha = novaMarcha.getNumeroMarcha();
    } else {
        System.out.println("Voce nao pode pular a marcha");
    }}

    public void estaAndando() {
        this.andando = true;
        this.kmRodados += 1;
    }

    public void estaParado() {
        this.andando = false;
    }
    public void engatarRe(boolean re){
        this.estaEmRe = re;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor=" + cor +
                ", ano=" + ano +
                ", rodas=" + rodas +
                ", marcha=" + marcha +
                ", andando=" + andando +
                ", kmRodados=" + kmRodados +
                '}';
    }
}
