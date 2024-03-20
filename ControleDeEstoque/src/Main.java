import Produtos.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void imprimir(Object objeto){
        System.out.println(objeto);
    }



    public static void main(String[] args) {

        Estoque teste = new Estoque();

        ArrayList<Eletronicos> celulares = new ArrayList<>();


        teste.eletronicos.put("celulares", celulares);

        // Instancia varias coisas

        for (int id = 0; id < 10+1; id++) {
            Eletronicos celular = new Eletronicos(id, "Nome " + id ,
                "Marca " + id, "Descrição " + id,
                (double) id*10, id, (double) id, 15
            );
        }

        teste.adicionar_estoque(Tipo.Eletronico, "celulares", 5,
                3);


    }
}