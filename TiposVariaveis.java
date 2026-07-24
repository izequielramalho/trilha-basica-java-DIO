package estudos.Izequiel.sintaxejava.trilhaDIO;

public class TiposVariaveis {

    public static void main(String[] args) {
        double salarioMinimo = 2500;

        short nomeroCurto = 1;
        int numeroNormal = nomeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        //dessa forma aqui é conhecido como variavel, pois pode ser alterado.


        final double valorPI = 3.14;
        //final representa algo que n pode ser alterado, mais conhecido como "constante"
    }
}
