package Bridge;




public class OutSource implements Encomenda {

    
    String encomendaOutsource;
    public OutSource() {
    }


   public String getEncomenda()
   {
       return encomendaOutsource;
   }

   public void setEncomenda(String encomenda)
   {
       this.encomendaOutsource = encomenda;
   }
}
