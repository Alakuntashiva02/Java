public class CamelCase {
    public static int countWords(String str){
    int result=1;    
for(int i=0;i<str.length();i++){
    
    if(Character.isUpperCase(str.charAt(i))){
        result=result+1;
     }
     
     
     
}

return result;
    }
    public static void main(String[] args){
       int result= countWords("saveTheEarth");
       System.out.println(result);
    }
    
}
