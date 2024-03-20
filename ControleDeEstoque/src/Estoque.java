import Produtos.*;

import java.util.*;


public class Estoque {

    public Map<String, ArrayList<Eletronicos> > eletronicos = new TreeMap<>();
    public Map<String, ArrayList<Alimenticio> > alimentos = new TreeMap<>();
    public Map<String, ArrayList<Vestuario> > roupas = new TreeMap<>();

    public <T extends Produto> void registroDeProduto(String tipo, T produto){

        if (tipo.equals("Eletronico")){
            eletronicos.get(tipo).add((Eletronicos) produto);
        }
    }

    public void registroDeProduto(String Tipo, Eletronicos instancia){
        if (eletronicos.isEmpty())
            eletronicos.put(Tipo, new ArrayList<>());

        eletronicos.get(Tipo).add(instancia);
    }

    public void registroDeProduto(String Tipo, Alimenticio instancia){
        if (alimentos.isEmpty())
            alimentos.put(Tipo, new ArrayList<>());

        alimentos.get(Tipo).add(instancia);
    }

    public void registroDeProduto(String Tipo, Vestuario instancia){
        if (roupas.isEmpty())
            roupas.put(Tipo, new ArrayList<>());

        roupas.get(Tipo).add(instancia);
    }

    private int searchForId(Tipo prod_type,
                            String category, int product_id){
        /*
         * Pesquisa em uma categoria de produto um determinado id e retorna seu
         * indice, -1 em caso de não encontrar
         */

        if (prod_type == Tipo.Eletronico) {
            for (Eletronicos celular : eletronicos.get(category)) {
                if (celular.getId() == product_id) {
                    return eletronicos.get(category).indexOf(celular);
                }
            }
        } else if (prod_type == Tipo.Roupa) {
            for (Vestuario roupa : roupas.get(category)) {
                if (roupa.getId() == product_id) {
                    return roupas.get(category).indexOf(roupa);
                }
            }
        } else if (prod_type == Tipo.Alimento) {
            for (Alimenticio alimento : alimentos.get(category)) {
                if (alimento.getId() == product_id) {
                    return alimentos.get(category).indexOf(alimento);
                }
            }
        }
        return -1;
    }

    public void adicionar_estoque(Tipo prod_type, String category, int product_id,
                                  int quantidade){

        // Chama a pesquisa e incrementa o estoque de um produto

        // se for um eletronico
        if (prod_type == Tipo.Eletronico){

            int idx = searchForId(Tipo.Eletronico, category, product_id);
            eletronicos.get(category).get(idx).incrementar(quantidade);

        } else if (prod_type == Tipo.Roupa) {

            int idx = searchForId(Tipo.Roupa, category, product_id);
            roupas.get(category).get(idx).incrementar(quantidade);

        } else if (prod_type == Tipo.Alimento){

            int idx = searchForId(Tipo.Alimento, category, product_id);
            alimentos.get(category).get(idx).incrementar(quantidade);
        }
    }
}


