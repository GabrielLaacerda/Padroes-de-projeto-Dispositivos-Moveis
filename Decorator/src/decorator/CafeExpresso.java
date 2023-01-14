package decorator;

public class CafeExpresso implements Bebida{
    
    @Override
    public float custo() {
        return 2.5f;
    }

    @Override
    public String getDesc() {
        return "CafeExpresso ";
    }
}
