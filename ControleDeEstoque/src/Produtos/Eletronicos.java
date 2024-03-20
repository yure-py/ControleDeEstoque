package Produtos;

public class Eletronicos extends Produto{

    int Ram;
    double Memoria;

    public Eletronicos(int id,
                       String nome,
                       String marca,
                       String descricao,
                       double preco,
                       int ram,
                       double memoria,
                       int quantidade) {

        super(id, nome, marca, descricao, preco, quantidade);

        this.Ram = ram;
        this.Memoria = memoria;

    }

    public Eletronicos(int id,
                       String nome,
                       String descricao,
                       double preco,
                       int ram,
                       double memoria,
                       int quantidade) {

        super(id, nome, descricao, preco, quantidade);

        this.Ram = ram;
        this.Memoria = memoria;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", Ram = " + Ram +
                ", Memoria = " + Memoria +
                '}';
    }
}

