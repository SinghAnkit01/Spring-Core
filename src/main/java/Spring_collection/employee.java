package Spring_collection;

import java.util.*;

public class employee {

    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String, String> courses;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        System.out.println("setting employee name");
        this.name = name;
    }
    public List<String> getPhones() {
        return phones;
    }
    public void setPhones(List<String> phones) {
        System.out.println("setting employee Phone number");
        this.phones = phones;
    }
    public Set<String> getAddress() {
        return address;
    }
    public void setAddress(Set<String> address) {
        System.out.println("setting employee address");
        this.address = address;
    }
    public Map<String, String> getCourses() {
        return courses;
    }
    public void setCourses(Map<String, String> courses) {
        System.out.println("setting employee courses");
        this.courses = courses;
    }
    public employee(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
        System.out.println("Example based on collection-Type");
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }

   
    public employee(){
        super();
    }

    @Override
    public String toString() {
        return "employee [name=" + name + ", phones=" + phones + ", address=" + address + ", courses=" + courses + "]";
    }

    

    
    

    
    
    
}
