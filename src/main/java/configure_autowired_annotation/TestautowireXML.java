package configure_autowired_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestautowireXML {
    public static void main(String[] args) {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("configure_autowired_annotation/AutowireXML.xml");
        Emp e1 = (Emp) context1.getBean("emp1");
        System.out.println(e1);
    }
}
