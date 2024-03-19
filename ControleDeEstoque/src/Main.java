import Produtos.*;

import java.util.ArrayList;

public class Main {

    public static void imprimir(Object objeto){
        System.out.println(objeto);
    }

    public static void main(String[] args) {

        Estoque teste = new Estoque();

        Eletronicos celular = new Eletronicos(

                1001,
                "a",
                "q",
                "b",
                1235,
                512,
                545,
                15
        );

        teste.eletronicos.put("tipo", new ArrayList<>());

        System.out.println(teste.eletronicos);
        teste.eletronicos.get("tipo").add(celular);
        System.out.println(teste.eletronicos);

    }
}