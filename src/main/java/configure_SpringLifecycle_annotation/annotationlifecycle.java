package configure_SpringLifecycle_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class annotationlifecycle {
    
   
    private double cycleprice;

    public double getCycleprice() {
        return cycleprice;
    }

    public void setCycleprice(double cycleprice) {
        this.cycleprice = cycleprice;
    }
    public annotationlifecycle(){
        super();
        System.out.println("default constructor");
    }

    @Override
    public String toString() {
        return "cycleprice = " + cycleprice ;
    }
    
    @PostConstruct
    public void start() {
        System.out.println("init of annotation");
    }
    @PreDestroy
    public void end() {
        System.out.println("destroy of annotation");
    }
    
      
}
