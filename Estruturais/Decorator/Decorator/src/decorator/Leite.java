package decorator;

public class Leite implements BebidaDecorator{
    
    private Bebida b;
    
    public Leite(Bebida b){
        this.b = b;
    }
    
    @Override
    public float custo() {
        return 0.5f + b.custo();
    }
}
