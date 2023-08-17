/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class Livros {
    private CategoriaEnum categoria;
    private String nome;
    private int quantidade;

    public Livros(CategoriaEnum categoria, String nome, int quantidade) {
        this.categoria = categoria;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Livros{" + "categoria=" + categoria + ", nome=" + nome + ", quantidade=" + quantidade + '}';
    }
    
}
