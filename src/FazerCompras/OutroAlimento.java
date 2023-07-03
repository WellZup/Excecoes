package FazerCompras;

public class OutroAlimento implements Alimento{
    private String nome;
    private int quantidadeEmUnidade;

    public OutroAlimento(String nome, int quantidadeEmUnidade) {
        this.nome = nome;
        this.quantidadeEmUnidade = quantidadeEmUnidade;
    }

    @Override
    public String Tipo() {
        return nome;
    }

    @Override
    public String Descricao() {
        return nome + " - " + quantidadeEmUnidade + "unidades";
    }
}
