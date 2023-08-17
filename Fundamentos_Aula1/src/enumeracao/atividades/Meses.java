/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class Meses {
    private MesesEnum nome;
    private int mes;

    public Meses(MesesEnum nome, int mes) {
        this.nome = nome;
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Meses{" + "nome=" + nome + ", mes=" + mes + '}';
    }
    
}
