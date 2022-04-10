package Composite;
import Decorator.sapatoFinal;

public abstract class compositoSapato implements sapatoFinal {
    private String fabricar;

    public compositoSapato(){}

    public String getFabricar()
    {
        return fabricar;
    }

    public void setFabricar(String Fabricar)
    {
        this.fabricar = fabricar;
    }
    public abstract void showOptions();
}
