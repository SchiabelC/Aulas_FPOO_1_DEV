package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
public class RedeSocial {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Post num1 = new Post("Cachorro dormindo", "Aninha12", "meu dog dormindo", 4);
        num1.COMUM();
        System.out.println(num1);
        Post num2 = new Post("Cachorro acordanoo", "FortlightFreeza", "meu dog acordando", 13);
        num2.LEGAL();
        System.out.println(num2);
        Post num3 = new Post("Sucata Velha", "SenhorCarlos", "Minha sucata de estimação", 234);
        num3.SUPER_LEGAL();
        System.out.println(num3);
    }

}
