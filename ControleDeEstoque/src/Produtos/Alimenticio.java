package Produtos;

public class Alimenticio extends Produto{

    String Data_validade;
    String Data_fabr;

    public Alimenticio(int id,
                       String nome,
                       String marca,
                       String descricao,
                       double preco,
                       int quantidade,
                       String Data_validade,
                       String Data_fabr) {

        super(id, nome, marca, descricao, preco, quantidade);

        this.Data_validade = Data_validade;
        this.Data_fabr = Data_fabr;

    }
}
