package Bridge;

import Composite.compositoSapato;

import java.util.HashMap;

public class encomendaUtilizador implements Encomenda{

    int count = 0;
    String encomenda;
    protected HashMap<compositoSapato, String> sapatos = new HashMap<>();
   public encomendaUtilizador(){}

    public void addSapatos(compositoSapato compositoSapato, String encomenda )
    {
        sapatos.put(compositoSapato, encomenda);
    }


    public String getEncomenda() {
        return encomenda;
    }


    public void setEncomenda(String encomenda) {
        this.encomenda = encomenda;

    }
}
