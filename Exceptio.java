//cheked exceptions-compile time exceptions
//unchecked exceptions-run time exceptions
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Exceptio{
    public static void main (String args[])/*throws FileNotFoundException/*java catches compile time exceptions*/{
        System.out.println("printing the remainder");
        int a=9;
        int b=0;
        int result=0;

     /*    File file=new File("D:resume.docx");
        FileInputStream fils=new FileInputStream(file);
        System.out.println(fils);

        
        /* 
         * exception name-arithmetic exception
         * exception message-by zero
         * which line number-7
         * methods info-
        */
        try{//throwing 
          result=a/b;
        }
        catch(ArithmeticException ae){//handling by user
            System.out.println(ae.getMessage());
            throw ae;//to stop the program execution
        }
        finally{
            System.out.println("print details");
        }
        System.out.println(result);
        System.out.println("hai");      
    }
    
}
/*matter
 * 
 * hierarchy of exceptions
 * object
 * throwable
 * exception
 * run time exceptions
 * indexoutofboundsexceptiond
 * nullpointerexceptions
 * arithmrtic exceptions
 * *io exceptions
 * -file not found exception
 * Sql exception
 */
