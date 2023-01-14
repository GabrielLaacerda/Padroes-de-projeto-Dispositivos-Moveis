package adapter;

public class Retangulo {
    
    int x,y,w,h;
    
    public Retangulo(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    public int calculaArea(){
        return h*w;
    }
}
