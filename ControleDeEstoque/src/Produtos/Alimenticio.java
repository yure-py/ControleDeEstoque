package Produtos;

public class Alimenticio extends Produto{

    String Data_validade;

    Alimenticio(int id, String nome, String marca, String descricao, double preco,
                int quantidade, String Data_validade) {
        super(id, nome, marca, descricao, preco, quantidade);

        this.Data_validade = Data_validade;
    }
}
