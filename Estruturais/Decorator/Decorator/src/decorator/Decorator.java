package decorator;

public class Decorator {

    public static void main(String[] args) {
        
        Bebida b = new CafeExpresso();
        b = new Leite(b);
        b = new Canela(b);
        
        
        System.out.println(b.custo());
         
    }
    
}
