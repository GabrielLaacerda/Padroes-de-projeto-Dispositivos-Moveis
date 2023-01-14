package Plataformas;

import Interfaces.Plataforma;

public class AmazonPrime implements Plataforma{

    private float preco;
    
    public AmazonPrime(){
        setPreco(9.90f);
    }
    
    @Override
    public String nome() {
        return "AmazonPrime";
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    
}
