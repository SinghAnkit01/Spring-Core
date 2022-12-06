package configure_standalone_collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class person {
    private List<String> friends;
    private Map<String,String> fees;
    private Properties properties;

    public List<String> getFriends() {
      return friends;
       
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, String> getFees() {
      return fees;
    }

    public void setFees(Map<String, String> fees) {
        this.fees = fees;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    // @Override
    // public String toString() {
    //     return "person [friends=" + friends + ", fees=" + fees + ", properties=" + properties + "]";
    // }



   
    
}
