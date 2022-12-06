package configure_SpringLifecycle_interface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Testinterfacelifecycle {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configure_SpringLifecycle_interface/configLifecycleinterface.xml");
        interfacelifecycle l1 = (interfacelifecycle) context.getBean("i1");
        System.out.println(l1);
       context.registerShutdownHook();
    }
}
