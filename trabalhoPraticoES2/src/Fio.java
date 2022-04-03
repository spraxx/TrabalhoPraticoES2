public class Fio extends Sapato{
    private String fio;
    public Fio(){}

    public String getFio()
    {
        return fio;
    }

    public void setFio  (String fio)
    {
        this.fio = fio;
    }
    public void showOptions()

    {
        System.out.println(getFabricar());
        System.out.println(fio);

    }
}
