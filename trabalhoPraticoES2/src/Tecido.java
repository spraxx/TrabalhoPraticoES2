public class Tecido extends Sapato{
    private String tecido;
    public Tecido(){}

    public String getTecido()
    {
        return tecido;
    }

    public void setTecido  (String tecido)
    {
        this.tecido = tecido;
    }
    public void showOptions()

    {
        System.out.println(getFabricar());
        System.out.println(tecido);

    }
}
