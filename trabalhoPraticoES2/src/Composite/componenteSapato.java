package Composite;
import java.util.ArrayList;

public class componenteSapato extends compositoSapato {
    private final ArrayList<compositoSapato> baseCompositoSapatoes = new ArrayList<compositoSapato>();
    public componenteSapato(){}
    public void addChild(compositoSapato child)
    {
        baseCompositoSapatoes.add(child);
    }
    public void removeChild(compositoSapato child)
    {
        baseCompositoSapatoes.remove(child);
    }

    public void showOptions()
    {
        System.out.println(getFabricar());

        for(compositoSapato baseCompositoSapato : baseCompositoSapatoes)
        {
            baseCompositoSapato.showOptions();
        }
    }


    @Override
    public void montar(String sapato, String acessorios) {

    }
}
