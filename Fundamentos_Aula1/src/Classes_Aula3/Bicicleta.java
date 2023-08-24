package Classes_Aula3;

public class Bicicleta {
// atributos, são as características da bicicleta
    private int qtdeRodas;

    private boolean temMarcha;

    private int qtdeMarchas;

    private String modelo;

    private boolean temFreio;

    private String cor;

    private String situacao;

    private int velocidade;

    //construtor sem argumentos

    public Bicicleta() {
    }

    //construtor com argumentos


    public Bicicleta(int qtdeRodas, boolean temMarcha, int qtdeMarchas, String modelo, boolean temFreio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.temMarcha = temMarcha;
        this.qtdeMarchas = qtdeMarchas;
        this.modelo = modelo;
        this.temFreio = temFreio;
        this.cor = cor;
        this.situacao = "Parada";
        this.velocidade = 0;
    }

    //Ações da bicicleta
    public void freiar() {
        this.situacao = "Freiando";
        this.velocidade = this.velocidade - 1;
    }
    public void andar() {
        this.situacao = "Andando";
        this.velocidade = this.velocidade + 2;
    }

    public boolean verificarSeTemFreio() {
        return this.temFreio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "qtdeRodas=" + qtdeRodas +
                ", temMarcha=" + temMarcha +
                ", qtdeMarchas=" + qtdeMarchas +
                ", modelo='" + modelo + '\'' +
                ", temFreio=" + temFreio +
                ", cor='" + cor + '\'' +
                ", situacao='" + situacao + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
