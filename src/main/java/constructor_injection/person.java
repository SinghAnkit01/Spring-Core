package constructor_injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class person {
    private String name;
    private int personid;
    private certi certi;
    private List<String> list;
    private Set<String> set;
    private Map<Integer,String> map;

   

    public person(String name, int personid,certi certi,List<String> list,Set<String>set,Map<Integer,String>map) {
        this.name = name;
        this.personid = personid;
        this.certi=certi;
        this.list=list;
        this.set=set;
        this.map=map;
    }

   

    @Override
    public String toString() {

        return this.name + " : " + this.personid + " : " +  "{ " + this.certi.name  + " }" + "\n" + "Name of participants " + this.list + " and their surnames are " + " participants surname " + this.set + "\n" + "Id with name : " + this.map; 
    }
    public person()
    {
        super();
        System.out.println("default constructor");
    }

    

    
}




