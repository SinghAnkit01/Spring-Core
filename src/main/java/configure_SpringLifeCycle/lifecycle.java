package configure_SpringLifeCycle;

public class lifecycle {
    private double cycleprice;

    public double getCycleprice() {
        return cycleprice;
    }

    public void setCycleprice(double cycleprice) {
        System.out.println("setting price of cycle");
        this.cycleprice = cycleprice;
    }

    public lifecycle(){
        super();
    }
    
    @Override
    public String toString() {
        return "cycleprice=" + cycleprice ;
    }

    public void hii(){
        System.out.println("I am IOC and i am going to create object of this class");
    }

    public void bye() {
        System.out.println("i am IOC and i am going to clean this code after calling destroy()");
    }
}
