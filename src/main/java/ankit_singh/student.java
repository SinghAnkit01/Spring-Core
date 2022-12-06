package ankit_singh;

public class student {
    private int id;
    private String name;
    private String address;
    
  
    public int getId() {
        return id;
    }
   
    public void setId(int id) {
        System.out.println("setting student id");
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        System.out.println("setting student name");
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        System.out.println("setting student address");
        this.address = address;
    }

    public student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "student [id=" + id + ", name=" + name + ", address=" + address + "]";
    }

    public student(){
        super();
    }

    
}
