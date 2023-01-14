package adapter;

class RetanguloAdapter {
    
    int x,y,h,w;
    Retangulo ret;

    RetanguloAdapter(int x1, int x2, int y1, int y2) {
        this.x = x1;
        this.y = y1;
        this.h = x2-x1;
        this.w = y2 - y1;
        ret = new Retangulo(x,y,w,h);
    }
    public int calculaArea(){
        
        return ret.calculaArea();
    }
    
}
