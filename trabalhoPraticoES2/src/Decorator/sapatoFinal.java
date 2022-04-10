package Decorator;

import Bridge.Encomenda;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class sapatoFinal implements Encomenda {
    protected LinkedHashMap<String,String> encomenda = new LinkedHashMap<>();
    int count = 0;
    void montar(String sapato, String acessorios)
    {

    }
    public String getEncomenda(String encomendaID)
    {
        String en = " ";
        for(Map.Entry<String,String> entry : this.encomenda.entrySet())
        {
            en = en.concat(entry.getValue());
        }
        return en;
    }

    public String setEncomenda(String encomenda)
    {
        String encomendaID = "Id da encomenda" + count;
        this.encomenda.put(encomendaID,encomenda);
        count++;
        return encomendaID;
    }
}
