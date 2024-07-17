import java.util.*;
public class Sequence {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int j=2;
        for (int i=0;i<n;i++){
            
            System.out.println(j+" ");
            if(i%2==0){
                 j=j*2+1;
            }
            else{
                j=j*2-1;
            }
        }

    }
    
}
