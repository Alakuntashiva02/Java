import java.util.HashSet;
import java.util.Iterator;



public class Hashing {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        set.remove(1);
        System.out.println(set);

        if(set.contains(1)){
            System.out.println("is available");
        }
        if(!set.contains(1)){
            System.out.println("not available");
        }
        set.add(0);
        set.add(4);
        Iterator it=set.iterator();

while(it.hasNext()){
   System.out.println(it.next() + " ");

}

    }
}


       
