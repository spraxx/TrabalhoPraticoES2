package Memento;

import java.util.ArrayList;

public class Utilizador {
    private ArrayList<versaoSapato> versoes = new ArrayList<>();

    public void addVersaoSapato(versaoSapato v)
    {
        versoes.add(v);
    }
    public versaoSapato getVersaoSapato()
    {
        return versoes.get(1);
    }
}
