package FazerCompras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaCompras {
    List<Alimento> lista;

    public ListaCompras() {
        lista = new ArrayList<>();
    }

    public void adicionarAlimento(Alimento alimento) {
        this.lista.add(alimento);
    }


    public void exibirListaCompras() {
        if (lista.isEmpty()) {
            System.out.println("A lista de compras está vazia");
        } else {
            System.out.println("Lista de compras: ");
            for (Alimento alimento: lista) {
                System.out.println(alimento.Tipo() + " - " + alimento.Descricao());
            }
        }
    }



    public void exibirQuantidadePorTipo () {
        Map<String, Integer> quantidadePorTipo = new HashMap<>();
        for (Alimento alimento: lista) {
            String tipo = alimento.Tipo();
            quantidadePorTipo.put(tipo,quantidadePorTipo.getOrDefault(tipo, 0) + 1);
            System.out.println("A quantidade de alimentos do tipo " + tipo + " a ser comprada é: " + quantidadePorTipo);


        }
    }


}
