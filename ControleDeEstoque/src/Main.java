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
            Eletronicos celular = new Eletronicos(id, "Nome " + id ,
                    "Marca " + id, "Descrição " + id,
                    (double) id*10, id, (double) id, 15
            );

            teste.registroDeProduto(Tipo.Eletronico, "celulares", celular);

            //teste.eletronicos.get("celulares").add(celular);
            System.out.println(teste.eletronicos.get("celulares").get(id));
        }
    }

    public static void main(String[] args) {

        Estoque teste = new Estoque();


        teste.eletronicos.put("celulares", new ArrayList<>());

        // Instancia varias coisas
        teste_de_registroDeProdutos(teste);


    }
}