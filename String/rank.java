import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class rank {
    public static void main(String[] args){
    int score[]={23,45,67,78,98,54,32,23};
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:score)p.offer(i);
        String a[]={"Bronze Medal","Silver Medal","Gold Medal"},b[]=new String[score.length];
        List<Integer> l = Arrays.stream(score)
                        .boxed()
                        .collect(Collectors.toList());
        for(int i=0;i<score.length;i++){
            if((3-i-1)>=0)
            b[l.indexOf(p.poll())]=a[3-i-1];
            else
            b[l.indexOf(p.poll())]=""+(i+1);

        }
        System.out.println(b);
    }
}
