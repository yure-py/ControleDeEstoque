package Produtos;

public class Eletronicos extends Produto{

    int Ram;
    double Memoria;

    Eletronicos(int id, String nome, String marca, String descricao, double preco,
                int quantidade) {

        super(id, nome, marca, descricao, preco, quantidade);

    }

    Eletronicos(int id, String nome, String descricao, double preco,
                int quantidade, int ram, double memoria) {

        super(id, nome, descricao, preco, quantidade);

        this.Ram = ram;
        this.Memoria = memoria;
    }
}

