package factory;

public class PizzaMussarela implements Pizza{

    @Override
    public void comer() {
        System.out.println("Comendo pizza Mussarela");
    }
    public void assar(){
        System.out.println("Assando Pizza");
    }
    
}
