package Plataformas;

import Interfaces.Plataforma;

public class Scribd implements Plataforma{
    
    private float preco;

    public Scribd(){
        setPreco(8.99f);
    }
    
    @Override
    public String nome() {
        return "Scribd";
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    
}
