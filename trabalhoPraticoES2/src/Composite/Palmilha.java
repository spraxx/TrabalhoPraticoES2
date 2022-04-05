package Composite;
import java.util.ArrayList;

public class Palmilha extends Sapato{
    private final ArrayList<Sapato> Palmilha = new ArrayList<Sapato>();
    public Palmilha(){}
    public void addChild(Sapato child)
    {
        Palmilha.add(child);
    }
    public void removeChild(Sapato child)
    {
        Palmilha.remove(child);
    }

    public void showOptions()
    {
        System.out.println(getFabricar());

        for(Sapato Palmilha : Palmilha)
        {
            Palmilha.showOptions();
        }
    }
}
