package Atividade03;

import Classes_Aula3.MarchaEnum;

public class Curso {
    //Curso (nome, descrição, categoria) usar enum para categoria
    private String nome;

    private String descricao;

    private int categoria;

    public Curso(String nome, String descricao, int categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }


    public void promover(CategoriaEnum novaCategoria) {
        int diferenca = novaCategoria.getEtapacategoria() - this.categoria;
        if(diferenca == 1) {
            this.categoria = novaCategoria.getEtapacategoria();
        } else {
            System.out.println("Voce nao pode pular uma etapa inteira");
        }}
    public void expulso(){
        this.categoria = 0;
        System.out.println("Este aluno agora esta expulso");
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
