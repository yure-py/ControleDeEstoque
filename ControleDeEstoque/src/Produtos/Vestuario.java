package Produtos;

public class Vestuario extends Produto {

    String Cor;
    String Tamanho;
    String Material;


    public Vestuario(int id,
                     String nome,
                     String marca,
                     String descricao,
                     double preco,
                     int quantidade,
                     String cor,
                     String tamanho,
                     String material) {

        super(id, nome, marca, descricao, preco, quantidade);

        this.Cor = cor;
        this.Tamanho = tamanho;
        this.Material = material;

    }
}
