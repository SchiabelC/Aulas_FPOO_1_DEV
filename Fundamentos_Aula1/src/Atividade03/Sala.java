package Atividade03;

public class Sala {
    //Sala (numero cadeiras, numero mesas, numero sala, tem projetor, numero computadores)
    private int numeroCadeiras;
    private int mesas;

    private int numeroSala;

    private boolean temProjetor;

    private int numeroComputador;

    private boolean limpando;

    private int diasParaDetetizaçao;

    public Sala(int numeroCadeiras, int mesas, int numeroSala, boolean temProjetor, int numeroComputador) {
        this.numeroCadeiras = numeroCadeiras;
        this.mesas = mesas;
        this.numeroSala = numeroSala;
        this.temProjetor = temProjetor;
        this.numeroComputador = numeroComputador;
        this.limpando = false;
        this.diasParaDetetizaçao = 30;
    }
public void estaLimpando(){
        this.limpando = true;
}
    public void naoEstaLimpando(){
        this.limpando = false;
    }
    public void PassarDia(){
        this.diasParaDetetizaçao -= 1;
    }
    @Override
    public String toString() {
        return "Sala{" +
                "numeroCadeiras=" + numeroCadeiras +
                ", mesas=" + mesas +
                ", numeroSala=" + numeroSala +
                ", temProjetor=" + temProjetor +
                ", numeroComputador=" + numeroComputador +
                ", limpando=" + limpando +
                ", diasParaDetetizaçao=" + diasParaDetetizaçao +
                '}';
    }
}

