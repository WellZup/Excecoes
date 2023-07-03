package FazerCompras;

public class Graos implements Alimento {
    private String nome;
    private double quantidadeEmGramas;

    public Graos(String nome, double quantidadeEmGramas) {
        this.nome = nome;
        this.quantidadeEmGramas = quantidadeEmGramas;
    }

    @Override
    public String Tipo() {
        return nome;
    }

    @Override
    public String Descricao() {
        return nome + " - " + quantidadeEmGramas + "g";
    }
}
