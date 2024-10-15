import java.util.*;
public class Intersection {
    public static int intersectionOfArr(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                System.out.print(arr2[j]+ " ");
            
                count++;
                set.remove(arr2[j]);

            }
        }
        System.out.println();
        return count;
    }
    public static void main (String args[]){
        int arr1[]={1,3,2,6};
        int arr2[]={3,6,9,2};
        System.out.print(intersectionOfArr(arr1,arr2));
    }
    
}
