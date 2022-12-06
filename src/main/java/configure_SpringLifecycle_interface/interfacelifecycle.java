package configure_SpringLifecycle_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class interfacelifecycle implements InitializingBean,DisposableBean {

    private double cycleprice;

     public double getCycleprice() {
        return cycleprice;
    }

   

    public void setCycleprice(double cycleprice) {
        System.out.println("setting values");
        this.cycleprice = cycleprice;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        
        System.out.println("buying cycle");
        
    }

    @Override
    public void destroy() throws Exception {
       System.out.println("Throw the cycle");
        
    }

    public interfacelifecycle(){
        super();
    }

    @Override
    public String toString() {
        return "price=" + cycleprice  ;
    }
    
}
