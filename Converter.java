package entities;

public class Converter {

    public static double CurrencyConverter(Double dollar, Double compraDollar){
        Double preco = dollar * compraDollar * 0.06;
        return preco + compraDollar * dollar;
    }
}
