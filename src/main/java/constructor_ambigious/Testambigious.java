package constructor_ambigious;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Testambigious {
    public static void main(String[] args) {

        ApplicationContext context1 = new ClassPathXmlApplicationContext("constructor_ambigious/ConfigAmbigious.xml");
        Addition p =(Addition) context1.getBean("add");
        p.dosum();
        
    }

}
