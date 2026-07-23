import java.io.*;
import java.util.*;
import java.nio.file.*;

// public class bassicfil {
//     public static void main(String[] args){
//         try{
//            File f=new File("s1.txt"); 
//            if(f.createNewFile())
//             System.out.println(f.getName());
//         else
//             System.out.println("file already exist");
//         }catch(Exception e){
//             e.printStackTrace();
//         }
//     }
// }

public class bassicfil {
    public static void main(String[] args){
        
        try(FileWriter f=new FileWriter("s1.txt"); ){
            f.write("fiii eewejwoeen");
            f.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

