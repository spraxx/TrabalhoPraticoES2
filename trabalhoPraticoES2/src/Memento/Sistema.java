package Memento;

import Composite.Sapato;

public class Sistema extends Sapato {
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
}
