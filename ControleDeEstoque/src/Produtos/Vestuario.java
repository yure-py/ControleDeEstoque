package Produtos;

enum Size{
    P, M, G
}

public class Vestuario extends Produto {

    String Cor;
    Size Tamanho;
    String Material;


    Vestuario(int id, String nome, String marca, String descricao, double preco,
              int quantidade, String cor, Size tamanho, String material) {

        super(id, nome, marca, descricao, preco, quantidade);

        this.Cor = cor;
        this.Tamanho = tamanho;
        this.Material = material;

    }

    Vestuario(int id, String nome, String descricao, double preco, int quantidade,
              String cor, Size tamanho, String material) {

        super(id, nome, descricao, preco, quantidade);

        this.Cor = cor;
        this.Tamanho = tamanho;
        this.Material = material;
    }
}
