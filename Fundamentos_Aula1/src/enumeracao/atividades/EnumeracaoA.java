/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class EnumeracaoA {
    public static void main(String[] args) {
        Meses mes = new Meses ( MesesEnum.AGOSTO, 8);
        System.out.println(mes);
        Livros livro = new Livros(CategoriaEnum.CALAFRIO, "PAQUETA", 2);
        System.out.println(livro);
    }
}
