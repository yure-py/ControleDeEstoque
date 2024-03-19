import Produtos.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Estoque {

    public Map<String, ArrayList<Eletronicos> > eletronicos = new HashMap<>();
    public Map<String, ArrayList<Alimenticio> > alimentos = new HashMap<>();
    public Map<String, ArrayList<Vestuario> > roupas = new HashMap<>();

    void registroDeProduto(String Tipo, Eletronicos instancia){
        if (eletronicos.isEmpty())
            eletronicos.put(Tipo, new ArrayList<>());

        eletronicos.get(Tipo).add(instancia);
    }

    void registroDeProduto(String Tipo, Alimenticio instancia){
        if (alimentos.isEmpty())
            alimentos.put(Tipo, new ArrayList<>());

        alimentos.get(Tipo).add(instancia);
    }

    void registroDeProduto(String Tipo, Vestuario instancia){
        if (roupas.isEmpty())
            roupas.put(Tipo, new ArrayList<>());

        roupas.get(Tipo).add(instancia);
    }



}


