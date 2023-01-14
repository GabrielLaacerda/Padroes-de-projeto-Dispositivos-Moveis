package Plataformas;

import Interfaces.Plataforma;

public class Netflix implements Plataforma{

    private float preco;
    
    public Netflix(){
        setPreco(19.99f);
    }
    
    @Override
    public String nome() {
      return "Netflix"; 
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    
}
