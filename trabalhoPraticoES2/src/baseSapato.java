import java.util.ArrayList;

public class baseSapato extends Sapato{
    private final ArrayList<Sapato> baseSapato = new ArrayList<Sapato>();
    public baseSapato(){}
    public void addChild(Sapato child)
    {
        baseSapato.add(child);
    }
    public void removeChild(Sapato child)
    {
        baseSapato.remove(child);
    }

    public void showOptions()
    {
        System.out.println(getFabricar());

        for(Sapato baseSapato : baseSapato)
        {
            baseSapato.showOptions();
        }
    }


}
