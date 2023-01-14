package observer;

public class InvestidorConcreto implements Investidor {

    @Override
    public void update(Acao a) {
            System.out.println("Preço Atual: "+a.getPreco());
        
    } 
}
