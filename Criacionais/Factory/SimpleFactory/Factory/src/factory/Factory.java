package factory;

public class Factory {

    public static void main(String[] args) {
       
        PizzaFactory pf = new PizzaFactory();
        Pizza p = pf.fazPizza("mussarela");
        Pizza p2 = pf.fazPizza("portuguesa");
        
        p.comer();
        p2.comer();
 
        
        
        
        
        
        
    }
    
}
