package observer;

public interface Acao {
    
    public int getPreco();
    public void setPreco(int valor);
    public void notifyInvestidor();
    public void anexar(Investidor i);
    public void desanexar(Investidor i);
}
