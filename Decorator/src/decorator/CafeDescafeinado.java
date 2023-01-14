package decorator;

public class CafeDescafeinado implements Bebida{

    @Override
    public float custo() {
        return 2.5f;
    }

    @Override
    public String getDesc() {
       return "Cafe Descafeinado ";
    }
    
}
