package Composite;
import java.util.ArrayList;

public class componenteSapato extends compositoSapato {
    private final ArrayList<compositoSapato> componenteSapatos = new ArrayList<compositoSapato>();
    public componenteSapato(){}
    public void addChild(compositoSapato child)
    {
        componenteSapatos.add(child);
    }
    public void removeChild(compositoSapato child)
    {
        componenteSapatos.remove(child);
    }

    public void showOptions()
    {
        System.out.println(getFabricar());

        for(compositoSapato componenteSapato : componenteSapatos)
        {
            componenteSapato.showOptions();
        }
    }


    @Override
    public void montar(String sapato, String acessorios) {

    }
}
