package configure_autowired_xml;

public class Emp {
    private Address address;

    public Emp(Address address) {
        System.out.println("inside constructor");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

   public void setAddress(Address address) {
    
        this.address = address;
    }

    public Emp(){
        super();
    }
    
    @Override
    public String toString() {
        return "Employee address is = " + address ;
    }
    
}
