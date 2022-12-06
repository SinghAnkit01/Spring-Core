package configure_autowired_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("a2")
    private Address address;
    
    // @Autowired
    // @Qualifier("a1")
    public Emp(Address address) {
        System.out.println("inside constructor");
        this.address = address;
        // System.out.println(address);
        
    }

    public Address getAddress() {
        return address;
    }

    // @Autowired
    // @Qualifier("a1")
   public void setAddress(Address address) {
        System.out.println("inside setter method");
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
