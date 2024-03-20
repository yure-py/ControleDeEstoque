package Produtos;

import java.util.Objects;

public abstract class Produto {
    private int Id, Quantidade;
    private String Nome, Marca, Descricao;
    private double Preco;

    Produto(int id, String nome, String marca, String descricao, double preco,
            int quantidade) {
        Id = id;
        Nome = nome;
        Marca = marca;
        Descricao = descricao;
        Preco = preco;
        Quantidade = quantidade;
    }

    Produto(int id, String nome, String descricao, double preco,
            int quantidade) {
        Id = id;
        Nome = nome;
        Marca = null;
        Descricao = descricao;
        Preco = preco;
        Quantidade = quantidade;
    }

    public int getId() {
        return Id;
    }
    public String getNome() {
        return Nome;
    }
    public int getQuantidade() {
        return Quantidade;
    }
    public double getPreco() {
        return Preco;
    }

    public void setId(int id) {
        Id = id;
    }
    private void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public void setPreco(double preco) {
        Preco = preco;
    }

    public void incrementar(int e){
        setQuantidade(getQuantidade() + e);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Id = " + Id +
                ", Quantidade = " + Quantidade +
                ", Nome = '" + Nome + '\'' +
                ", Preco = " + Preco;
    }
}
