public class Acessorios extends Sapato{
    public Acessorios(){};
    private String fio;
    private String cortica;
    private String tecido;
    public String getFio()
    {
        return fio;
    }

    public void setFio  (String fio)
    {
        this.fio = fio;
    }

    public String getCortica()
    {
        return cortica;

    }

    public void setCortica(String cortica) {
        this.cortica = cortica;
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    public void showOptions()

    {
        System.out.println(getFabricar());
        System.out.println(fio + tecido + cortica);

    }
}
