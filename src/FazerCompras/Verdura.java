package FazerCompras;

public class Verdura implements Alimento{

    private String nome;
    private double quantidadeEmGramas;

    public Verdura(String nome, double quantidadeEmGramas) {
        this.nome = nome;
        this.quantidadeEmGramas = quantidadeEmGramas;
    }

    @Override
    public String Tipo() {
        return "VERDURA";
    }

    @Override
    public String Descricao() {
        return nome + " - " + quantidadeEmGramas + "g";
    }
}
