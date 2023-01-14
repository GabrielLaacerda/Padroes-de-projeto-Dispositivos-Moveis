package observer;

import java.util.ArrayList;

public class AcaoConcreto implements Acao {
    
    private int preco;
    private ArrayList<Investidor> Interessados = new ArrayList<>();
    
    public AcaoConcreto() {
    }

    @Override
    public int getPreco() {
        return preco;
    }

    @Override
    public void setPreco(int valor) {
        this.preco = valor;
         notifyInvestidor();
    }

    @Override
    public void notifyInvestidor() {
        Interessados.forEach((i) -> {
            i.update(this);
        });
    }

    @Override
    public void anexar(Investidor i) {
        Interessados.add(i);
    }

    @Override
    public void desanexar(Investidor i) {
        //Remover do ArrayList
    }

    
    
}
