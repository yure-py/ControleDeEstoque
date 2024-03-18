import Produtos.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Estoque {

    public Map<String, ArrayList<Eletronicos> > eletronicos = new HashMap<>();
    public Map<String, ArrayList<Alimenticio> >  alimentos = new HashMap<>();
    public Map<String, ArrayList<Vestuario> >  roupas = new HashMap<>();

    void registroDeProduto(String Tipo, Eletronicos instancia){
        if (eletronicos.isEmpty()){

            eletronicos.put("tipo", new ArrayList<Eletronicos>());
        }

        eletronicos.get("tipo").add(instancia);
    }

    void registroDeProduto(String Tipo, Vestuario instancia){
        if (alimentos.isEmpty()){

            alimentos.put("tipo", new ArrayList<Vestuario>());
        }

        alimentos.get("tipo").add(instancia);
    }

    void registroDeProduto(String Tipo, Alimenticio instancia){
        if (roupas.isEmpty()){

            roupas.put("tipo", new ArrayList<Alimenticio>());
        }

        roupas.get("tipo").add(instancia);
    }

}


