public class Decorator implements sapatoFinal
{
    sapatoFinal sapato;
    public Decorator(sapatoFinal sapato)
    {
        this.sapato = sapato;
    }


    public void montar(String sapato, String acessorios)
    {
        sapato.montar(sapato, acessorios);
    }


}
