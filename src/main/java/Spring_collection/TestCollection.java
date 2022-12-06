package Spring_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {
    public static void main(String[] args) {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("Spring_collection/collectionConfig.xml");
        employee e1 =   (employee) context1.getBean("employee1");
        // System.out.println(e1);
        System.out.println("Name of Employee = " + e1.getName());
        System.out.println("Phones Number of Employee = " + e1.getPhones());
        System.out.println("Address of employee = " + e1.getAddress());
        System.out.println("Courses done by employee = " + e1.getCourses());
        System.out.println("Class where employee fields are exist = " + e1.getClass());
    }
}
