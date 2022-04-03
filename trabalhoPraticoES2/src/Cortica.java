public class Cortica extends Sapato {
    private String cortica;
    public Cortica(){}

    public String getCortica()
    {
        return cortica;
    }

    public void setCortica  (String cortica)
    {
        this.cortica = cortica;
    }
    public void showOptions()

    {
        System.out.println(getFabricar());
        System.out.println(cortica);

    }
}
