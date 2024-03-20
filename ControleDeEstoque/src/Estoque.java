import Produtos.*;

import java.util.*;


public class Estoque {

    public Map<String, ArrayList<Eletronicos> > eletronicos = new TreeMap<>();
    public Map<String, ArrayList<Alimenticio> > alimentos = new TreeMap<>();
    public Map<String, ArrayList<Vestuario> > roupas = new TreeMap<>();


    public <T extends Produto> void registroDeProduto(Tipo tipo, String Category,
                                                      T instancia){

        if (Tipo.Eletronico == tipo) {
            eletronicos.get(Category).add((Eletronicos) instancia);

        } else if (Tipo.Alimento == tipo) {
            alimentos.get(Category).add((Alimenticio) instancia);

        } else if (Tipo.Roupa == tipo) {
            roupas.get(Category).add((Vestuario) instancia);
        }
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

    public void adicionar_estoque(String prod_type, String category,
                                  int product_id, int quantidade) {

        int idx;
        if (prod_type.equals("Eletronico")) {

            idx = searchForId(Tipo.Eletronico, category, product_id);
            eletronicos.get(category).get(idx).incrementar(quantidade);

        } else if (prod_type.equals("Alimento")) {

            idx = searchForId(Tipo.Alimento, category, product_id);
            roupas.get(category).get(idx).incrementar(quantidade);

        } else if (prod_type.equals("Vestuario")) {

            idx = searchForId(Tipo.Roupa, category, product_id);
            alimentos.get(category).get(idx).incrementar(quantidade);

        }
    }
}


