import Produtos.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void imprimir(Object objeto){
        System.out.println(objeto);
    }

    public static void teste_de_registroDeProdutos(Estoque teste){

        for (int id = 0; id < 10+1; id++) {

            Eletronicos celular = new Eletronicos(id, "Nome " + id ,"Marca " + id, "Descrição " +
                    id,(double) id*10, id, (double) id, 15
            );

            teste.registroDeProduto(Tipo.Eletronico, "celulares", celular);

        }
    }

    public static void main(String[] args) {

        Estoque teste = new Estoque();

        // Teste de registro de um novo produto
        teste_de_registroDeProdutos(teste);

        // Teste de adição de estoque a um produto
        teste.adicionar_estoque("Eletronico", "celulares", 1, 15);
        assert teste.eletronicos.get("celulares").get(1).getQuantidade() == 30;

        // Venda de um produto e verificação do estoque
        teste.venda("Eletronico", "celulares", 1, 15);
        assert teste.eletronicos.get("celulares").get(1).getQuantidade() == 15;

        for (Eletronicos x: teste.eletronicos.get("celulares")){
            System.out.println(x);
        }
    }
}