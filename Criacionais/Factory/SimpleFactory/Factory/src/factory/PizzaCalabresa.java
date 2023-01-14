package factory;

public class PizzaCalabresa implements Pizza{

    @Override
    public void comer() {
         System.out.println("Comendo pizza Calabresa");
    }
      public void assar(){
        System.out.println("Assando Pizza");
    }
    
    
}
