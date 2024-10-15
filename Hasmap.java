import java.util.HashMap;
import java.util.*;
public class Hasmap{
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
map.put("India", 100);
map.put("china",200);
map.put("us",50);
System.out.println(map);

map.put("brazil",29);
map.put("India",100);
System.out.println(map);
map.remove("china");
System.out.println(map.size());

/*if(map.containsKey("India")){
    System.out.println("key exists");
}
else{
    System.out.println("key does not exist");
}*/
//System.out.println(map.get("china"));
//System.out.println(map.get("indonesia"));
/*int arr[]={1,2,3};
for(int i=0;i<3;i++){
    System.out.println(arr[i]+ " ");
}
System.out.println();
for(int val:arr){
    System.out.println(val);
}*/
for(Map.Entry<String,Integer> e: map.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
    
}
    }
}       
    

