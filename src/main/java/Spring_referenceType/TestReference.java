package Spring_referenceType;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReference {
    public static void main(String[] args) {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("Spring_referenceType/refConfig.xml");
        A a =(A)context1.getBean("aref");
        System.out.println("value of x comes from A class " + a.getX());
        System.out.println("value of y comes from B class to ob by IOC = " + a.getOb().getY());
        System.out.println("value of c comes from B class to ob by IOC = " + a.getOb().getC());
        // IOC have injected all the values of B class in ob reference-type in A class.
        // so, we can access value of B class with the help of reference variable inside A(a.getob().getY()).
    }
}
