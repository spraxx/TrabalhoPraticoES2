package Bridge;

import Composite.compositoSapato;

import java.util.HashMap;

public class encomendaUtilizador implements Encomenda{


    String encomenda;
    protected HashMap<compositoSapato, String> sapatos = new HashMap<>();
   public encomendaUtilizador(){}

    public void addSapatos(compositoSapato sapato, String encomenda )
    {
        sapatos.put(sapato, encomenda);
    }


    public String getEncomenda() {
        return encomenda;
    }


    public void setEncomenda(String encomenda) {
        this.encomenda = encomenda;

    }
}
