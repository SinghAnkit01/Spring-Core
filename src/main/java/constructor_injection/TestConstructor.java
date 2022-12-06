package constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestConstructor {
    public static void main(String[] args) {
       ApplicationContext context1 = new ClassPathXmlApplicationContext("constructor_injection/ConstructorConfig.xml");
       person p =(person) context1.getBean("person1");
        
       System.out.println(p);
    //    above line will call toString() method to print object.
    }
}
