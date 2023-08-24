package Classes_Aula3;

public class Aluno {
    private String nome;
    private String email;

    private int ra;

    private boolean estudando;

    private int tempoNaEscola;

    public Aluno(String nome, String email, int ra) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.estudando = false;
        this.tempoNaEscola = 0;
    }
public void estaEstudando(){
        this.estudando = true;
        this.tempoNaEscola += 1;
}
    public void naoEstaEstudando(){
        this.estudando = false;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", ra=" + ra +
                ", estudando=" + estudando +
                ", tempoNaEscola=" + tempoNaEscola +
                '}';
    }
}
