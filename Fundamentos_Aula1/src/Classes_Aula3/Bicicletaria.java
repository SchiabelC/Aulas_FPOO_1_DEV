package Classes_Aula3;

public class Bicicletaria {
    public static void main(String[] args) {
        Bicicleta caloiCross  = new Bicicleta(2,true,21,"Caloi Cross",true,"Azul");

        System.out.println(caloiCross);

        caloiCross.andar();
        caloiCross.andar();
        caloiCross.andar();

        System.out.println(caloiCross);
    }
}
