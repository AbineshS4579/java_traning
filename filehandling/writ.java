import java.io.*;
import java.util.*;
import java.nio.file.*;
public class writ {
    public static void main(String[] args){
        
        try{
            File f=new File("s1.txt");
            // String content = Files.readString(f.toPath());
        // //  content=content.replace("are","is");
        //     FileWriter f1=new FileWriter("s1.txt");
            // f1.write("content");
            // f1.close();
           f.delete();

        // Scanner sc=new Scanner(f);
        //     while(sc.hasNextLine()){
                
        //         System.out.println(sc.nextLine());
        //     }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
