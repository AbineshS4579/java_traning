import java.util.*;
public class fore {
    public static void main(String[] args){
        List<Integer> l=new ArrayList<>(Arrays.asList(4,8,7,9,56,79));
        l.forEach(System.out::print);
        for(int a:l)
            System.out.println(a);
    
        

    }
}
