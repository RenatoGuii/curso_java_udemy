package classes;

public class CurrencyConverter {

    private static double IOF = 0.06;

    public static double conversao (double valorDolar, double qntd) {
        double resultado = (valorDolar * qntd) + (IOF * (valorDolar * qntd));
        return resultado;
    }

}
