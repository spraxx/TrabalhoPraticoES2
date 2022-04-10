package Memento;

import Composite.compositoSapato;

import java.util.HashMap;

public class versaoSapato {
    private String versao;
    HashMap<compositoSapato, String> sapatos = new HashMap();
    public void adicionarSapatosistema(compositoSapato compositoSapato, String versao)
    {
        sapatos.put(compositoSapato, versao);
    }

    public versaoSapato(String versao)
    {
        this.versao = versao;
    }

    public String getVersao()
    {
        return versao;
    }
}
