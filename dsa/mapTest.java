import java.util.*;
public class mapTest {
    public static void main(String args[]){
        HashMap<String ,Integer>map=new HashMap();
         //for insert the data in maap
        map.put("india",120);
        map.put("china",100);
        map.put("nepal",10);

        System.out.println(map);
       //for find the size of the map
        System.out.println("size of map is:"+map.size());
      //for checking key  and values
        if(map.containsKey("india"))
        {
            System.out.println("india element are found:");
        }
        else{
            System.out.println("india element are not founnd:");
        }

        System.out.println(map.get("india"));
        System.out.println(map.get("us"));

     //for sacnning data in map[]
    for(Map.Entry<String,Integer>p:map.entrySet())
    {
        System.out.println(p.getKey());
        System.out.println(p.getValue());
    }
     //for removing data set from map
    map.remove("china");
    System.out.println(map);
}

}
