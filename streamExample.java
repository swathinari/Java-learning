import java.util.*;
public class streamExample{
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer> ();
        //List<Integer> num =  Arrays.asList(10,11,13,14,15,16,17,18,19,20);
       // num.forEach((n) -> {System.out.println(n);});
        num.add(40);
        num.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(num);
        System.out.println("getting a specfic item " + num.get(4));
        num.sort(null);
        System.out.print("sorting item " + num);
        num.set(0,10);
        System.out.println(num);
        System.out.println("SUBLIST OF ITEM " + num.subList(0,3));
        
         

    }
}