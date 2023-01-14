package factory;

public class PizzaPortuguesa implements Pizza{

    @Override
    public void comer() {
        System.out.println("Comendo pizza Portuguesa");
    }
      public void assar(){
        System.out.println("Assando Pizza");
    }
    
}
