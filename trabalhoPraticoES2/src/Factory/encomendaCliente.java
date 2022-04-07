package Factory;

public class encomendaCliente implements encomendaInterface {
    private String dados;
    protected encomendaCliente(){};


    @Override
    public void setDados(String dados) {
        this.dados = dados;
    }


    public String getDados() {
        return dados;
    }
}
