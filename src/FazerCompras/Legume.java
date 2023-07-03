package FazerCompras;

public class Legume implements Alimento{
    private String nome;
    private int quantidadeEmUnidade;

    public Legume(String nome, int quantidadeEmUnidade) {
        this.nome = nome;
        this.quantidadeEmUnidade = quantidadeEmUnidade;
    }

    @Override
    public String Tipo() {
        return "LEGUME";
    }

    @Override
    public String Descricao() {
        return nome + " - " + quantidadeEmUnidade + "unidades";
    }
}
