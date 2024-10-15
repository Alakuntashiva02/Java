import java.util.HashSet;
import java.util.Iterator;
public class Union {
    public static int unionOfArr(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<arr1.length;i++){
         set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
          //  System.out.println(set);
        } 
        
        System.out.println(set);
        return set.size();
    
    }
    public static void main(String args[]){
        int arr1[]={3,6,9};
        int arr2[]={2,4,6,9};
        //System.out.println
      System.out.println(  unionOfArr(arr1,arr2));
    }
    
}
