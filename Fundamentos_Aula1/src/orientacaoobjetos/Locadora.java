package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Locadora {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
double valorLocacaoSimples;
        double valorLocacaoLancamento;
        Cliente c1 = new Cliente("Amélia");
        c1.validarNome(c1.getNome());
        c1.verificarEmailDominioGoogle(c1.getEmail());
        System.out.println(c1);
        valorLocacaoSimples = c1.calcularLocacao(3 );
        System.out.println("O valor para a locação do filme: " + valorLocacaoSimples);
        Cliente c2 = new Cliente("José Armando Pinto", "jose.armando@gmail.com");
        c2.verificarEmailDominioGoogle(c2.getEmail());
        c2.validarNome(c2.getNome());
        System.out.println(c2);
        valorLocacaoLancamento = c1.calcularLocacao(3, true);
        System.out.println("O valor para a locação do filme: " + valorLocacaoLancamento);
    }
}
