package Memento;

import Composite.Sapato;

import java.util.HashMap;

public class Sistema extends Sapato {
    private  String versao;
    HashMap <Sapato, String> sapatos = new HashMap();
    public void setVersao(String versao)
    {
        System.out.println("Sistema: criar modelo de versao: " + versao);
        this.versao = versao;
    }
    public void adicionarSapatosistema(Sapato sapato, String versao)
    {
        sapatos.put(sapato, versao);
    }

    public versaoSapato save()
    {
        System.out.println("Sistema: Guardar a versao");
        return new versaoSapato(versao);
    }
    public void restore(versaoSapato v)
    {
        versao = v.getVersao();
        System.out.println("Sistema: versao depois de restaurada " + versao);
    }

    @Override
    public void showOptions() {

    }
}
