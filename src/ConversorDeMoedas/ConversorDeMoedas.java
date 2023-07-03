package ConversorDeMoedas;

import java.math.BigDecimal;
import java.util.Scanner;

class ConversorDeMoeda {
    private BigDecimal taxaDolarAmericano;
    private BigDecimal taxaDolarCanadense;
    private BigDecimal taxaEuro;
    private BigDecimal taxaLibraEsterlina;

    public ConversorDeMoeda(BigDecimal taxaDolarAmericano, BigDecimal taxaDolarCanadense, BigDecimal taxaEuro, BigDecimal taxaLibraEsterlina) {
        this.taxaDolarAmericano = taxaDolarAmericano;
        this.taxaDolarCanadense = taxaDolarCanadense;
        this.taxaEuro = taxaEuro;
        this.taxaLibraEsterlina = taxaLibraEsterlina;
    }

    public BigDecimal converterParaReal(String moeda, BigDecimal valor) {
        switch (moeda) {
            case "Dólar americano":
                return valor.multiply(taxaDolarAmericano);
            case "Dólar canadense":
                return valor.multiply(taxaDolarCanadense);
            case "Euro":
                return valor.multiply(taxaEuro);
            case "Libra Esterlina":
                return valor.multiply(taxaLibraEsterlina);
            default:
                throw new IllegalArgumentException("Tipo de moeda inválido");
        }
    }
}