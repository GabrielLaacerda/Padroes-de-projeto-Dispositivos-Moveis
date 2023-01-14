package factory;

public class PizzaFactory {
    
   public Pizza fazPizza(String tipo){
       if(tipo.equals("calabresa")) {      
          PizzaCalabresa p = new PizzaCalabresa();
          p.assar();
          return p;
       }
       if(tipo.equals("mussarela")) {      
          PizzaMussarela p = new PizzaMussarela();
          p.assar();
          return p;
       }
       if(tipo.equals("portuguesa")) {      
          PizzaPortuguesa p = new PizzaPortuguesa();
          p.assar();
          return p;
       }
       
       return null;
   }
    
}
