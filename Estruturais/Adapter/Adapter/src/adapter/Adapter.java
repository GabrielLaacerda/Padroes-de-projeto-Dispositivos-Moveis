package adapter;

public class Adapter {

    public static void main(String[] args) {
        
        int x1 = 5, x2 = 10, y1 = 8, y2 = 6;
        
        RetanguloAdapter r = new RetanguloAdapter(x1,x2,y1,y2);
        System.out.println(r.calculaArea());
      
        
         
        
    }
    
}
