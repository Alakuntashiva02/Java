import java.util.*;
public  class Special  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];


        for (int i=0;i<size;i++){
             arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
             
            
            
          int rem=arr[i]%10;
          int div=arr[i]/10;

        int prod=rem*div;
        int sum=rem+div; 
  
        
        
        
            
        int spe=prod+sum;
        if(spe==arr[i]){
            System.out.println("speacial number");
        }
        else{
            System.out.println("not special number");
        }
    }
  
        
        
    
}
}
