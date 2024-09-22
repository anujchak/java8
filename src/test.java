import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args)
    {
        List<Integer>l=new ArrayList<Integer>();
        l.add(5);
        l.add(1);
        l.add(3);
        l.add(2);
        l.add(4);
        l.add(1);
        l.add(3);
        //limit will limit only 3 elements
        //l.stream().limit(3).forEach(e-> System.out.println(e));
        //skip will skip 1st 3 elements
        //l.stream().skip(3).forEach(e-> System.out.println(e));
        //using for each loop
        //l.stream().forEach(e->{if(e>3) System.out.println(e);});
        //using filter
        // l.stream().filter(e->e%2==0).forEach(e-> System.out.println(e));
        //print distinct element
        //System.out.println(l.stream().distinct().collect(Collectors.toList()));
        //print frequency of elements
        //System.out.println(l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

        List<String>l1=new ArrayList<String>();
        l1.add("anuj");
        l1.add("anujxc");
        l1.add("aa");
        l1.add("anu");
        l1.add("k");
        //print element whos length is greter than 3
        //System.out.println(l1.stream().filter(e->e.length()>3).collect(Collectors.toList()));
        Set<Integer>s=new HashSet<Integer>();
        //print dublicate element
        //System.out.println(l.stream().filter(e->!s.add(e)).collect(Collectors.toList()));
        String s1="I am hero hero am";
        List<String>l2= Arrays.asList(s1.split(" "));
        //print frequency of each word
        //System.out.println(l2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
       // using functional interface
        product p= (a,b)->a*b;
        //System.out.println(p.multiply(2,3));

    }
}
