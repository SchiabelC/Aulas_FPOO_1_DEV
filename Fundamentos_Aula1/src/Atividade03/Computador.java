package Atividade03;

public class Computador {
    //Computador (memoria, processador, capacidade disco rígido, sistema operacional) para memoria e processador usar enum
  private EnumMemoria memoria;
  private EnumProcessor processador;
  private String capacidadeDisco;

  private String SistemaOperacional;

  private boolean usado;

  private int quantasVezesLigado;

  private boolean ligado;

    public Computador(EnumMemoria memoria, EnumProcessor processador, String capacidadeDisco, String sistemaOperacional) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDisco = capacidadeDisco;
        SistemaOperacional = sistemaOperacional;
        this.usado = false;
        this.quantasVezesLigado = 0;
        this.ligado = false;
    }

    public void ligar() {
        this.quantasVezesLigado += 1;
        this.usado = true;
        this.ligado = true;
    }
    public void desligar() {
        this.ligado = false;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "memoria=" + memoria +
                ", processador=" + processador +
                ", capacidadeDisco='" + capacidadeDisco + '\'' +
                ", SistemaOperacional='" + SistemaOperacional + '\'' +
                ", usado=" + usado +
                ", quantasVezesLigado=" + quantasVezesLigado +
                ", ligado=" + ligado +
                '}';
    }
}
