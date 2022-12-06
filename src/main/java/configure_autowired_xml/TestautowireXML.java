package configure_autowired_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestautowireXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configure_autowired_xml/AutowireXML.xml");
        Emp e1 = (Emp) context.getBean("emp1");
        System.out.println(e1);
    }
}
