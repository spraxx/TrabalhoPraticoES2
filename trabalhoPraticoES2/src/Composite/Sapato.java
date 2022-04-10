package Composite;
import Decorator.sapatoFinal;

public abstract class Sapato implements sapatoFinal {
    private String fabricar;

    public Sapato(){}

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
