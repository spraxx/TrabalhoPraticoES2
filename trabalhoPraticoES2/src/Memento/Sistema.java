package Memento;

import Composite.compositoSapato;

import java.util.HashMap;

public class Sistema extends compositoSapato {
    private  String versao;

    public void setVersao(String versao)
    {
        System.out.println("Sistema: criar modelo de versao: " + versao);
        this.versao = versao;
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

    @Override
    public void montar(String sapato, String acessorios) {

    }
}
