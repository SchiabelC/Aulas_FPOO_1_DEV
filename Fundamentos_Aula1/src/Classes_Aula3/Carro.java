package Classes_Aula3;

public class Carro {

    private String modelo;

    private String marca;

    private String cor;

    private int ano;

    private int rodas;

    private boolean andando;

    private double kmRodados;


    public Carro(String modelo, String marca, String cor, int ano, int rodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.rodas = rodas;
        this.andando = false;
        this.kmRodados = 0;
    }

    public void estaAndando() {
        this.andando = true;
        this.kmRodados += 1;
    }

    public void estaParado() {
        this.andando = false;
    }


    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", rodas=" + rodas +
                ", andando=" + andando +
                ", kmRodados=" + kmRodados +
                '}';
    }
}
