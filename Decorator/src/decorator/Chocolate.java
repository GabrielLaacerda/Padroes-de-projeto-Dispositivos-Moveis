package decorator;

public class Chocolate implements BebidaDecorator{
    
    private Bebida b;
     private String desc = "com Chocolate";
    
    public Chocolate(Bebida b){
        this.b = b;
    }
    
    @Override
    public float custo() {
        return 0.5f + b.custo();
    }
    
    @Override
    public String getDesc(){
        return this.desc;
    }
}
