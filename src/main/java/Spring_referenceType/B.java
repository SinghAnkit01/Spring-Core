package Spring_referenceType;

public class B {
    private int y;
    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

   
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public B(int y , int c) {
        this.y = y;
        this.c = c;
    }

  
    public B(){
        super();
    }

    @Override
    public String toString() {
        return "B [y=" + y + ", c=" + c + "]";
    }


    
}
