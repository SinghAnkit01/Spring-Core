package configure_SpringLifecycle_annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Testannotationlifecycle {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configure_SpringLifeCycle_annotation/configLifecycleannotation.xml");
        annotationlifecycle l1 = (annotationlifecycle) context.getBean("a1");
        context.registerShutdownHook();
         System.out.println(l1);
    }
}
