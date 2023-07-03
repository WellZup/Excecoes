package ConversorDeMoedas;

import java.math.BigDecimal;

public class ConversorDeMoedas {
    private BigDecimal taxaDolarAmericano;
    private BigDecimal taxaDolarCanadense;
    private BigDecimal taxaEuro;
    private BigDecimal taxaLibraEsterlina;

    public ConversorDeMoedas(BigDecimal taxaDolarAmericano, BigDecimal taxaDolarCanadense,
                             BigDecimal taxaEuro, BigDecimal taxaLibraEsterlina) {
        this.taxaDolarAmericano = taxaDolarAmericano;
        this.taxaDolarCanadense = taxaDolarCanadense;
        this.taxaEuro = taxaEuro;
        this.taxaLibraEsterlina = taxaLibraEsterlina;
    }

    public BigDecimal converterParaReal(String moeda, BigDecimal valor) {
        switch (moeda){
            case  "Dolar Americano" :
                return valor.multiply(taxaDolarAmericano);
            case "Dolar Canadense" :
                return valor.multiply(taxaDolarCanadense);
            case "Euro" :
                return valor.multiply(taxaEuro);
            case "Libra Esterlina" :
                return valor.multiply(taxaLibraEsterlina);

            default:
                throw new IllegalArgumentException("Tipo de moeda inválido");
        }
    }
}
