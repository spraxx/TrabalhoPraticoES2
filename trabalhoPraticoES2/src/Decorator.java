

public class Decorator implements sapatoFinal
{

    sapatoFinal sapato1;

    public Decorator(sapatoFinal sapato)
    {
        this.sapato1 = sapato;
    }


    public void montar(String sapato, String acessorios)
    {
        sapato1.montar(sapato, acessorios);
    }


}
